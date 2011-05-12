;; Simple Unit Test for Clojure {@Author: Kunjan  @Date: 8/20/2009}
(ns unittest)
;; ----------------------------------------------------------------------------
(defmacro is 
  "expr : is compulsory and is the thing to be evaluated
   value      : can be optional in cases where it is a boolean check eg. (is (= 2 2))
   function   : is the optional user defined comparator function
   exception  : can be passed in if you expect the expression to throw exceptions
   timeout    : can be provided if you want to timeout a test and fail
   runafter   : is used for dependency or side effects test
                the test is run after the specified functions are run"
   
  [expr &[value {:keys [function exception timeout run-after] :or {function = timeout -1}}]]
 `(time-limited ~timeout ~expr ~value
   (try
     (do
     (if (not (nil? ~run-after)) ~run-after)
     (let [evaluated-expr# ~expr string-expr# (str (quote ~expr))]
      (if (or (= evaluated-expr#  true) (~function evaluated-expr#  ~value))
		   true
       (if (nil? ~value)
         (return string-expr# (not evaluated-expr#) evaluated-expr#)
         (return string-expr# ~value evaluated-expr#)))))
      (catch Exception e#
        (if (and (not (nil? ~exception)) (instance? ~exception e#))
          true
          (return (str (quote ~expr)) 
            (if (nil? ~exception) "No Exception" ~exception) e#))))))

(defmacro time-limited [ms expr value & body]
  `(if (not (< ~ms 0))
    (let [future# (future ~@body)]
       (try
         (.get future# ~ms java.util.concurrent.TimeUnit/MILLISECONDS)
         (catch java.util.concurrent.TimeoutException e#
           (return (str (quote ~expr)) ~value (str "Timeout after " ~ms " ms")))))
     ~@body))

(defn return [expr i-val u-val]
 (list (list "\n  In:  \t\t"  expr )(list "\n  U Expected: \t  "  i-val)
	     (list "\n  I Got:\t  " u-val)))

;; ----------------------------------------------------------------------------
(defn present?
 "predicate checks if the value is present in the sequence
  present? : T (listof T) -> boolean
  Structural recursion over a sequence. Clojure doesn't have TCO, we use recur"
 [value a-sequence] 
	(cond
		(empty? a-sequence) false
		:else
			(if (= value (first a-sequence)) true	(recur value (rest a-sequence)))))	

(defn perform-tests
 "performs the tests in the test bundle
  optional-para is needed to see if the tests need to halt on error
  strategy: lazy evaluation over a list of tests"
 [test-results optional-para count] 
	(cond
	 (empty? test-results) (list "\n---- Finished Checking -----\n")
	:else 
	 (if (= true (first test-results))
		(perform-tests (rest test-results) optional-para (inc count))					
		 (cons
		   (list (list "\n FAILED Test #" count) (first test-results))
			 (if (present? :runall optional-para)
					 (perform-tests (rest test-results) optional-para (inc count)))))))

;; ----------------------------------------------------------------------------
(defn define-test-bundle
  "Performs the series of test.
   Header : (test-bundle test-name [optional-para] (is test1) (is test2)...)
   Example: (test-bundle 'my-test [:runall :time :noprint]
   				     (is (= 2 3) true)(is (= 2 2) true))
   testname is compulsory
   optional-para could be a vector containing these keywords:   
   :runall - if provided it does not halt on the first error
             Default: Stops on the first error
   :time  -  if provided profiles the running time 
   :noprint- if provided returns a list of the parsable s-expression results
   :skip  -  if provided skips the current test bundle."
  [testname  & [optional-para & is-expr]]
 	(when-not (present? :skip optional-para)
 	  (do
 	   (if (present? :time optional-para) 
 	  		 (def result (cons  testname (time (perform-tests is-expr optional-para 1))))
 	  		 (def result (cons testname (perform-tests is-expr optional-para 1))))
 	   (if (present? :noprint optional-para)
 	   		 result
 	   		 (print (flatten result))))))

;; ===============           Sample test              =========================
(defn approx-equal [tolerance]
  "Compares two numbers that lies within a tolerance"
  (fn [x y](or (= x y)(= x (+ y tolerance)) (= x (- y tolerance))
        (= y (+ x tolerance)) (= y (- x tolerance)))))

;; Test for Side Effects
(def aRef (ref nil))
(defn getRef [] (deref aRef))
(defn setRef [new-val] (dosync (ref-set aRef new-val)))

(define-test-bundle 'my-test [:runall :time]
  ;; Simple True Statement
  (is (= 2 2))
	(is (instance? clojure.lang.Symbol 'alphabet))
  ;; Simple Comparisons
	(is (+ 2 2) 50)
  (is (let [x 2] (* x x)) 4)
  ;; Compare Data Structures
	(is (map (fn[x](Math/sqrt x)) (list 4 16)) (list 2 4))
  (is {:key 1} {:key 1})
  (is (.toUpperCase "foo") "FOo")
  ;; User Defined Comparator Functions
  (is 3 4 {:function <})
  (is 2 2.1 {:function (approx-equal 0.1)})
  ;; Exception Checks
  (is (/ 1 0) 1)
  (is (/ 1 0) 1 {:exception NullPointerException})
  (is (/ 1 0) 1 {:exception ArithmeticException})
  ;; Timeout Tests
  (is (/ 1 0) 1 {:timeout 1 :exception ArithmeticException})
  (is (reduce * (range 1 10001)) 1 {:timeout 1})
  ;; Run After (Dependency or Sideffect Functions Tests)
  (is (getRef) "val2" {:run-after
                       (do (setRef "val1") (setRef "val2"))}))