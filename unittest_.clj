

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
  <title>
	Kunjan_Kshetri / Clojure_Unit / source – Bitbucket
</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="description" content="" />
  <meta name="keywords" content="Kunjan_Kshetri,Unit,Test,for,Clojure,source,sourcecode,unittest.clj@cabab38ca3e6" />
  <!--[if lt IE 9]>
  <script src="https://dwz7u9t8u8usb.cloudfront.net/m/f46996830fe9/js/lib/html5.js"></script>
  <![endif]-->

  <script type="text/javascript">
    var MEDIA_URL = "https://dwz7u9t8u8usb.cloudfront.net/m/f46996830fe9/";
    (function (window) {
      // prevent stray occurrences of `console.log` from causing errors in IE
      var console = window.console || (window.console = {});
      console.log || (console.log = function () {});

      window.BB || (window.BB = {});
      window.BB.debug = false;
      window.BB.cname = false;
      window.BB.CANON_URL = 'https://bitbucket.org';
      window.BB.user || (window.BB.user = {});
      window.BB.user.has = (function () {
        var betaFeatures = [];
        
        return function (feature) {
          return _.contains(betaFeatures, feature);
        };
      }());
      window.BB.repo || (window.BB.repo = {});
  
  
    
    
      window.BB.repo.slug = 'clojure_unit';
    
    
      window.BB.repo.owner = {
        username: 'Kunjan_Kshetri'
      };
    
    
      window.BB.changeset = 'cabab38ca3e6'
    
  
    }(this));
  </script>

  
    <link rel="stylesheet" href="https://dwz7u9t8u8usb.cloudfront.net/m/f46996830fe9/bun/css/bundle.css"/>
  

  <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="Bitbucket" />
  <link rel="icon" href="https://dwz7u9t8u8usb.cloudfront.net/m/f46996830fe9/img/logo_new.png" type="image/png" />


  
    <script type="text/javascript" src="https://dwz7u9t8u8usb.cloudfront.net/m/f46996830fe9/bun/js/bundle.js"></script>
  


	<link rel="stylesheet" href="https://dwz7u9t8u8usb.cloudfront.net/m/f46996830fe9/css/highlight/trac.css" type="text/css" />


</head>

<body class="">

  <div id="wrapper">



  <div id="header-wrap">
    <div id="header">
    <ul id="global-nav">
      <li><a class="home" href="http://www.atlassian.com">Atlassian Home</a></li>
      <li><a class="docs" href="http://confluence.atlassian.com/display/BITBUCKET">Documentation</a></li>
      <li><a class="support" href="/support">Support</a></li>
      <li><a class="blog" href="http://blog.bitbucket.org">Blog</a></li>
      <li><a class="forums" href="http://groups.google.com/group/bitbucket-users">Forums</a></li>
    </ul>
    <a href="/" id="logo">Bitbucket by Atlassian</a>

    <div id="main-nav" class="clearfix">
    
      <ul class="clearfix">
        <li><a href="/features">Features</a></li>
        <li><a href="/plans">Pricing &amp; Signup</a></li>
        <li><a href="/explore">Explore Bitbucket</a></li>
        <li><a href="/account/signin/">Log in</a></li>
        

<li class="search-box">
  <form action="/repo/all">
    <input type="search" results="5" autosave="bitbucket-explore-search"
           name="name" id="search"
           placeholder="Find a project" />
  </form>
</li>

      </ul>
    
    </div>
    </div>
  </div>

    <div id="header-messages">
  
  
    
    
    
    
  

    
   </div>



    <div id="content">
      <div id="unnamed">
      
	
  





  <script type="text/javascript">
    jQuery(function ($) {
        var cookie = $.cookie,
            cookieOptions, date,
            $content = $('#content'),
            $pane = $('#what-is-bitbucket'),
            $hide = $pane.find('[href="#hide"]').css('display', 'block').hide();

        date = new Date();
        date.setTime(date.getTime() + 365 * 24 * 60 * 60 * 1000);
        cookieOptions = { path: '/', expires: date };

        if (cookie('toggle_status') == 'hide') $content.addClass('repo-desc-hidden');

        $('#toggle-repo-content').click(function (event) {
            event.preventDefault();
            $content.toggleClass('repo-desc-hidden');
            cookie('toggle_status', cookie('toggle_status') == 'show' ? 'hide' : 'show', cookieOptions);
        });

        if (!cookie('hide_intro_message')) $pane.show();

        $hide.click(function (event) {
            event.preventDefault();
            cookie('hide_intro_message', true, cookieOptions);
            $pane.slideUp('slow');
        });

        $pane.hover(
            function () { $hide.fadeIn('fast'); },
            function () { $hide.fadeOut('fast'); });
    });
  </script>



  
  
  
  
  
    <div id="what-is-bitbucket" class="new-to-bitbucket">
      <h2>Kunjan Kshetri <span id="slogan">is sharing code with you</span></h2>
      <img src="https://bitbucket-assetroot.s3.amazonaws.com:443/c/photos/2010/Dec/04/Kunjan_Kshetri-avatar-1227034450-0_avatar.png" alt="" class="avatar" />
      <p>Bitbucket is a code hosting site. Unlimited public and private repositories. Free for small teams.</p>
      <div class="primary-action-link signup"><a href="/account/signup/?utm_source=internal&utm_medium=banner&utm_campaign=what_is_bitbucket">Try Bitbucket free</a></div>
      <a href="#hide" title="Don't show this again">Don't show this again</a>
    </div>
  


<div id="tabs">
  <ul class="tabs">
    <li>
      <a href="/Kunjan_Kshetri/clojure_unit/overview">Overview</a>
    </li>

    <li>
      <a href="/Kunjan_Kshetri/clojure_unit/downloads">Downloads (0)</a>
    </li>

    

    

    <li class="selected">
      
        <a href="/Kunjan_Kshetri/clojure_unit/src/cabab38ca3e6">Source</a>
      
    </li>

    <li>
      <a href="/Kunjan_Kshetri/clojure_unit/changesets">Changesets</a>
    </li>

    
      
        <li class="dropdown">
          <a href="/Kunjan_Kshetri/clojure_unit/wiki">Wiki</a>
        </li>
      
    

    
      
        <li class="dropdown">
          <a href="/Kunjan_Kshetri/clojure_unit/issues?status=new&amp;status=open">Issues (0) &raquo;</a>
          <ul>
            <li><a href="/Kunjan_Kshetri/clojure_unit/issues/new">Create new issue</a></li>
            <li><a href="/Kunjan_Kshetri/clojure_unit/issues?status=new">New issues</a></li>
            <li><a href="/Kunjan_Kshetri/clojure_unit/issues?status=new&amp;status=open">Open issues</a></li>
            <li><a href="/Kunjan_Kshetri/clojure_unit/issues?status=resolved&amp;status=invalid&amp;status=duplicate">Closed issues</a></li>
            
            <li><a href="/Kunjan_Kshetri/clojure_unit/issues">All issues</a></li>
            <li><a href="/Kunjan_Kshetri/clojure_unit/issues/query">Advanced query</a></li>
          </ul>
        </li>
      
    

    

    <li class="secondary">
      <a href="/Kunjan_Kshetri/clojure_unit/descendants">Forks/Queues (0)</a>
    </li>

    <li class="secondary">
      <a href="/Kunjan_Kshetri/clojure_unit/zealots">Followers (<span id="followers-count">1</span>)</a>
    </li>
  </ul>
</div>


  <div class="repo-menu" id="repo-menu">
    <ul id="repo-menu-links">
     
      <li>
        <a href="/Kunjan_Kshetri/clojure_unit/rss" class="rss" title="RSS feed for Clojure_Unit">RSS</a>
      </li>
      
        <li>
          <a href="/Kunjan_Kshetri/clojure_unit/pull" class="pull-request">
            pull request
          </a>
        </li>
      
      <li><a href="/Kunjan_Kshetri/clojure_unit/fork" class="fork">fork</a></li>
      
        <li><a href="/Kunjan_Kshetri/clojure_unit/hack" class="patch-queue">patch queue</a></li>
      
      <li>
        <a rel="nofollow" href="/Kunjan_Kshetri/clojure_unit/follow" class="follow">follow</a>
      </li>
      
          
      
      
        <li>
          <a class="source">get source</a>
          <ul class="downloads">
            
              <li><a rel="nofollow" href="/Kunjan_Kshetri/clojure_unit/get/cabab38ca3e6.zip">zip</a></li>
              <li><a rel="nofollow" href="/Kunjan_Kshetri/clojure_unit/get/cabab38ca3e6.tar.gz">gz</a></li>
              <li><a rel="nofollow" href="/Kunjan_Kshetri/clojure_unit/get/cabab38ca3e6.tar.bz2">bz2</a></li>
            
          </ul>
        </li>
      
    </ul>

  
    <ul class="metadata">
    
      <li class="branches">branches
        <ul>
          <li>
            <a href="/Kunjan_Kshetri/clojure_unit/src/cabab38ca3e6">default</a>
          
          </li>
        </ul>
      </li>
    
      <li class="tags">tags
        <ul>
          <li><a href="/Kunjan_Kshetri/clojure_unit/src/cabab38ca3e6">tip</a>
            </li>
        </ul>
      </li>
    </ul>
  
</div>
<div class="repo-menu" id="repo-desc">
  
    <img src="https://bitbucket-assetroot.s3.amazonaws.com:443/c/photos/2010/Dec/05/clojure_unit-logo-3484960985-9_avatar.gif" class="repo-avatar right" />
  

    <ul id="repo-menu-links-mini">
      
      <li>
        <a href="/Kunjan_Kshetri/clojure_unit/rss" class="rss" title="RSS feed for Clojure_Unit"></a>
      </li>
      
        <li>
          <a href="/Kunjan_Kshetri/clojure_unit/pull" class="pull-request" title="Pull request"></a>
        </li>
      
      <li><a href="/Kunjan_Kshetri/clojure_unit/fork" class="fork" title="Fork"></a></li>
      
        <li><a href="/Kunjan_Kshetri/clojure_unit/hack" class="patch-queue" title="Patch queue"></a></li>
      
      <li>
        <a rel="nofollow" href="/Kunjan_Kshetri/clojure_unit/follow" class="follow">follow</a>
      </li>
      
          
      
      
        <li>
          <a class="source" title="Get source"></a>
          <ul class="downloads">
            
              <li><a rel="nofollow" href="/Kunjan_Kshetri/clojure_unit/get/cabab38ca3e6.zip">zip</a></li>
              <li><a rel="nofollow" href="/Kunjan_Kshetri/clojure_unit/get/cabab38ca3e6.tar.gz">gz</a></li>
              <li><a rel="nofollow" href="/Kunjan_Kshetri/clojure_unit/get/cabab38ca3e6.tar.bz2">bz2</a></li>
            
          </ul>
        </li>
      
    </ul>

    <h3 id="repo-heading">
      <a href="/Kunjan_Kshetri">Kunjan_Kshetri</a> /
      <a href="/Kunjan_Kshetri/clojure_unit">Clojure_Unit</a>
    
    </h3>


  <p class="repo-desc-description">Unit Test for Clojure</p>


  <div id="repo-desc-cloneinfo">Clone this repository (size: 4.4 KB): <a href="#https">HTTPS</a> / <a href="#ssh">SSH</a>
    <pre id="clone-url-https">hg clone https://bitbucket.org/Kunjan_Kshetri/clojure_unit</pre>
    <pre id="clone-url-ssh">hg clone ssh://hg@bitbucket.org/Kunjan_Kshetri/clojure_unit</pre>
  </div>

  <a href="#" id="toggle-repo-content"></a>

  

</div>




      

<div id="source-path" class="layout-box">
	<a href="/Kunjan_Kshetri/clojure_unit/src">Clojure_Unit</a> /
	
		
			
				unittest.clj
			
		
		
	
</div>


<div id="source-view">
	<table class="info-table">
		<tr>
			<th>r0:cabab38ca3e6</th>
			<th>125 loc</th>
			<th>5.2 KB</th>
			<th class="source-view-links">
				<a id="embed-link" href="#" onclick="makeEmbed('#embed-link', 'https://bitbucket.org/Kunjan_Kshetri/clojure_unit/src/cabab38ca3e6/unittest.clj?embed=t');">embed</a> /
				<a href="/Kunjan_Kshetri/clojure_unit/history/unittest.clj">history</a> /
				<a href="/Kunjan_Kshetri/clojure_unit/annotate/cabab38ca3e6/unittest.clj">annotate</a> /
				<a href="/Kunjan_Kshetri/clojure_unit/raw/cabab38ca3e6/unittest.clj">raw</a> /
				<form action="/Kunjan_Kshetri/clojure_unit/diff/unittest.clj" class="source-view-form">
					
					<select name="nothing" class="smaller" disabled="disabled">
						<option>No previous changes</option>
					</select>
					
				</form>
			</th>
		</tr>
	</table>
	
		<div>
		
			<table class="highlighttable"><tr><td class="linenos"><div class="linenodiv"><pre><a href="#cl-1">  1</a>
<a href="#cl-2">  2</a>
<a href="#cl-3">  3</a>
<a href="#cl-4">  4</a>
<a href="#cl-5">  5</a>
<a href="#cl-6">  6</a>
<a href="#cl-7">  7</a>
<a href="#cl-8">  8</a>
<a href="#cl-9">  9</a>
<a href="#cl-10"> 10</a>
<a href="#cl-11"> 11</a>
<a href="#cl-12"> 12</a>
<a href="#cl-13"> 13</a>
<a href="#cl-14"> 14</a>
<a href="#cl-15"> 15</a>
<a href="#cl-16"> 16</a>
<a href="#cl-17"> 17</a>
<a href="#cl-18"> 18</a>
<a href="#cl-19"> 19</a>
<a href="#cl-20"> 20</a>
<a href="#cl-21"> 21</a>
<a href="#cl-22"> 22</a>
<a href="#cl-23"> 23</a>
<a href="#cl-24"> 24</a>
<a href="#cl-25"> 25</a>
<a href="#cl-26"> 26</a>
<a href="#cl-27"> 27</a>
<a href="#cl-28"> 28</a>
<a href="#cl-29"> 29</a>
<a href="#cl-30"> 30</a>
<a href="#cl-31"> 31</a>
<a href="#cl-32"> 32</a>
<a href="#cl-33"> 33</a>
<a href="#cl-34"> 34</a>
<a href="#cl-35"> 35</a>
<a href="#cl-36"> 36</a>
<a href="#cl-37"> 37</a>
<a href="#cl-38"> 38</a>
<a href="#cl-39"> 39</a>
<a href="#cl-40"> 40</a>
<a href="#cl-41"> 41</a>
<a href="#cl-42"> 42</a>
<a href="#cl-43"> 43</a>
<a href="#cl-44"> 44</a>
<a href="#cl-45"> 45</a>
<a href="#cl-46"> 46</a>
<a href="#cl-47"> 47</a>
<a href="#cl-48"> 48</a>
<a href="#cl-49"> 49</a>
<a href="#cl-50"> 50</a>
<a href="#cl-51"> 51</a>
<a href="#cl-52"> 52</a>
<a href="#cl-53"> 53</a>
<a href="#cl-54"> 54</a>
<a href="#cl-55"> 55</a>
<a href="#cl-56"> 56</a>
<a href="#cl-57"> 57</a>
<a href="#cl-58"> 58</a>
<a href="#cl-59"> 59</a>
<a href="#cl-60"> 60</a>
<a href="#cl-61"> 61</a>
<a href="#cl-62"> 62</a>
<a href="#cl-63"> 63</a>
<a href="#cl-64"> 64</a>
<a href="#cl-65"> 65</a>
<a href="#cl-66"> 66</a>
<a href="#cl-67"> 67</a>
<a href="#cl-68"> 68</a>
<a href="#cl-69"> 69</a>
<a href="#cl-70"> 70</a>
<a href="#cl-71"> 71</a>
<a href="#cl-72"> 72</a>
<a href="#cl-73"> 73</a>
<a href="#cl-74"> 74</a>
<a href="#cl-75"> 75</a>
<a href="#cl-76"> 76</a>
<a href="#cl-77"> 77</a>
<a href="#cl-78"> 78</a>
<a href="#cl-79"> 79</a>
<a href="#cl-80"> 80</a>
<a href="#cl-81"> 81</a>
<a href="#cl-82"> 82</a>
<a href="#cl-83"> 83</a>
<a href="#cl-84"> 84</a>
<a href="#cl-85"> 85</a>
<a href="#cl-86"> 86</a>
<a href="#cl-87"> 87</a>
<a href="#cl-88"> 88</a>
<a href="#cl-89"> 89</a>
<a href="#cl-90"> 90</a>
<a href="#cl-91"> 91</a>
<a href="#cl-92"> 92</a>
<a href="#cl-93"> 93</a>
<a href="#cl-94"> 94</a>
<a href="#cl-95"> 95</a>
<a href="#cl-96"> 96</a>
<a href="#cl-97"> 97</a>
<a href="#cl-98"> 98</a>
<a href="#cl-99"> 99</a>
<a href="#cl-100">100</a>
<a href="#cl-101">101</a>
<a href="#cl-102">102</a>
<a href="#cl-103">103</a>
<a href="#cl-104">104</a>
<a href="#cl-105">105</a>
<a href="#cl-106">106</a>
<a href="#cl-107">107</a>
<a href="#cl-108">108</a>
<a href="#cl-109">109</a>
<a href="#cl-110">110</a>
<a href="#cl-111">111</a>
<a href="#cl-112">112</a>
<a href="#cl-113">113</a>
<a href="#cl-114">114</a>
<a href="#cl-115">115</a>
<a href="#cl-116">116</a>
<a href="#cl-117">117</a>
<a href="#cl-118">118</a>
<a href="#cl-119">119</a>
<a href="#cl-120">120</a>
<a href="#cl-121">121</a>
<a href="#cl-122">122</a>
<a href="#cl-123">123</a>
<a href="#cl-124">124</a>
<a href="#cl-125">125</a>
<a href="#cl-126">126</a>
</pre></div></td><td class="code"><div class="highlight"><pre><a name="cl-1"></a><span class="c1">;; Simple Unit Test for Clojure {@Author: Kunjan  @Date: 8/20/2009}</span>
<a name="cl-2"></a><span class="p">(</span><span class="nf">ns</span> <span class="nv">unittest</span><span class="p">)</span>
<a name="cl-3"></a><span class="c1">;; ----------------------------------------------------------------------------</span>
<a name="cl-4"></a><span class="p">(</span><span class="k">defmacro </span><span class="nv">is</span> 
<a name="cl-5"></a>  <span class="s">&quot;expr : is compulsory and is the thing to be evaluated</span>
<a name="cl-6"></a><span class="s">   value      : can be optional in cases where it is a boolean check eg. (is (= 2 2))</span>
<a name="cl-7"></a><span class="s">   function   : is the optional user defined comparator function</span>
<a name="cl-8"></a><span class="s">   exception  : can be passed in if you expect the expression to throw exceptions</span>
<a name="cl-9"></a><span class="s">   timeout    : can be provided if you want to timeout a test and fail</span>
<a name="cl-10"></a><span class="s">   runafter   : is used for dependency or side effects test</span>
<a name="cl-11"></a><span class="s">                the test is run after the specified functions are run&quot;</span>
<a name="cl-12"></a>   
<a name="cl-13"></a>  <span class="p">[</span><span class="nv">expr</span> <span class="nv">&amp;</span><span class="p">[</span><span class="nv">value</span> <span class="p">{</span><span class="nv">:keys</span> <span class="p">[</span><span class="nv">function</span> <span class="nv">exception</span> <span class="nv">timeout</span> <span class="nv">run-after</span><span class="p">]</span> <span class="nv">:or</span> <span class="p">{</span><span class="nv">function</span> <span class="nv">=</span> <span class="nv">timeout</span> <span class="mi">-1</span><span class="p">}}]]</span>
<a name="cl-14"></a> <span class="o">`</span><span class="p">(</span><span class="nf">time-limited</span> <span class="nv">~timeout</span> <span class="nv">~expr</span> <span class="nv">~value</span>
<a name="cl-15"></a>   <span class="p">(</span><span class="nf">try</span>
<a name="cl-16"></a>     <span class="p">(</span><span class="nf">do</span>
<a name="cl-17"></a>     <span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">not </span><span class="p">(</span><span class="nb">nil? </span><span class="nv">~run-after</span><span class="p">))</span> <span class="nv">~run-after</span><span class="p">)</span>
<a name="cl-18"></a>     <span class="p">(</span><span class="k">let </span><span class="p">[</span><span class="nv">evaluated-expr</span><span class="o">#</span> <span class="nv">~expr</span> <span class="nv">string-expr</span><span class="o">#</span> <span class="p">(</span><span class="nb">str </span><span class="p">(</span><span class="nf">quote</span> <span class="nv">~expr</span><span class="p">))]</span>
<a name="cl-19"></a>      <span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">or </span><span class="p">(</span><span class="nb">= </span><span class="nv">evaluated-expr</span><span class="o">#</span>  <span class="nv">true</span><span class="p">)</span> <span class="p">(</span><span class="nf">~function</span> <span class="nv">evaluated-expr</span><span class="o">#</span>  <span class="nv">~value</span><span class="p">))</span>
<a name="cl-20"></a>                   <span class="nv">true</span>
<a name="cl-21"></a>       <span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">nil? </span><span class="nv">~value</span><span class="p">)</span>
<a name="cl-22"></a>         <span class="p">(</span><span class="nf">return</span> <span class="nv">string-expr</span><span class="o">#</span> <span class="p">(</span><span class="nb">not </span><span class="nv">evaluated-expr</span><span class="o">#</span><span class="p">)</span> <span class="nv">evaluated-expr</span><span class="o">#</span><span class="p">)</span>
<a name="cl-23"></a>         <span class="p">(</span><span class="nf">return</span> <span class="nv">string-expr</span><span class="o">#</span> <span class="nv">~value</span> <span class="nv">evaluated-expr</span><span class="o">#</span><span class="p">)))))</span>
<a name="cl-24"></a>      <span class="p">(</span><span class="nf">catch</span> <span class="nv">Exception</span> <span class="nv">e</span><span class="o">#</span>
<a name="cl-25"></a>        <span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">and </span><span class="p">(</span><span class="nb">not </span><span class="p">(</span><span class="nb">nil? </span><span class="nv">~exception</span><span class="p">))</span> <span class="p">(</span><span class="nb">instance? </span><span class="nv">~exception</span> <span class="nv">e</span><span class="o">#</span><span class="p">))</span>
<a name="cl-26"></a>          <span class="nv">true</span>
<a name="cl-27"></a>          <span class="p">(</span><span class="nf">return</span> <span class="p">(</span><span class="nb">str </span><span class="p">(</span><span class="nf">quote</span> <span class="nv">~expr</span><span class="p">))</span> 
<a name="cl-28"></a>            <span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">nil? </span><span class="nv">~exception</span><span class="p">)</span> <span class="s">&quot;No Exception&quot;</span> <span class="nv">~exception</span><span class="p">)</span> <span class="nv">e</span><span class="o">#</span><span class="p">))))))</span>
<a name="cl-29"></a>
<a name="cl-30"></a><span class="p">(</span><span class="k">defmacro </span><span class="nv">time-limited</span> <span class="p">[</span><span class="nv">ms</span> <span class="nv">expr</span> <span class="nv">value</span> <span class="nv">&amp;</span> <span class="nv">body</span><span class="p">]</span>
<a name="cl-31"></a>  <span class="o">`</span><span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">not </span><span class="p">(</span><span class="nb">&lt; </span><span class="nv">~ms</span> <span class="mi">0</span><span class="p">))</span>
<a name="cl-32"></a>    <span class="p">(</span><span class="k">let </span><span class="p">[</span><span class="nv">future</span><span class="o">#</span> <span class="p">(</span><span class="nf">future</span> <span class="nv">~@body</span><span class="p">)]</span>
<a name="cl-33"></a>       <span class="p">(</span><span class="nf">try</span>
<a name="cl-34"></a>         <span class="p">(</span><span class="o">.</span><span class="nv">get</span> <span class="nv">future</span><span class="o">#</span> <span class="nv">~ms</span> <span class="nv">java</span><span class="o">.</span><span class="nv">util</span><span class="o">.</span><span class="nv">concurrent</span><span class="o">.</span><span class="nv">TimeUnit/MILLISECONDS</span><span class="p">)</span>
<a name="cl-35"></a>         <span class="p">(</span><span class="nf">catch</span> <span class="nv">java</span><span class="o">.</span><span class="nv">util</span><span class="o">.</span><span class="nv">concurrent</span><span class="o">.</span><span class="nv">TimeoutException</span> <span class="nv">e</span><span class="o">#</span>
<a name="cl-36"></a>           <span class="p">(</span><span class="nf">return</span> <span class="p">(</span><span class="nb">str </span><span class="p">(</span><span class="nf">quote</span> <span class="nv">~expr</span><span class="p">))</span> <span class="nv">~value</span> <span class="p">(</span><span class="nb">str </span><span class="s">&quot;Timeout after &quot;</span> <span class="nv">~ms</span> <span class="s">&quot; ms&quot;</span><span class="p">)))))</span>
<a name="cl-37"></a>     <span class="nv">~@body</span><span class="p">))</span>
<a name="cl-38"></a>
<a name="cl-39"></a><span class="p">(</span><span class="k">defn </span><span class="nv">return</span> <span class="p">[</span><span class="nv">expr</span> <span class="nv">i-val</span> <span class="nv">u-val</span><span class="p">]</span>
<a name="cl-40"></a> <span class="p">(</span><span class="nb">list </span><span class="p">(</span><span class="nb">list </span><span class="s">&quot;\n  In:  \t\t&quot;</span>  <span class="nv">expr</span> <span class="p">)(</span><span class="nb">list </span><span class="s">&quot;\n  U Expected: \t  &quot;</span>  <span class="nv">i-val</span><span class="p">)</span>
<a name="cl-41"></a>             <span class="p">(</span><span class="nb">list </span><span class="s">&quot;\n  I Got:\t  &quot;</span> <span class="nv">u-val</span><span class="p">)))</span>
<a name="cl-42"></a>
<a name="cl-43"></a><span class="c1">;; ----------------------------------------------------------------------------</span>
<a name="cl-44"></a><span class="p">(</span><span class="k">defn </span><span class="nv">present?</span>
<a name="cl-45"></a> <span class="s">&quot;predicate checks if the value is present in the sequence</span>
<a name="cl-46"></a><span class="s">  present? : T (listof T) -&gt; boolean</span>
<a name="cl-47"></a><span class="s">  Structural recursion over a sequence. Clojure doesn&#39;t have TCO, we use recur&quot;</span>
<a name="cl-48"></a> <span class="p">[</span><span class="nv">value</span> <span class="nv">a-sequence</span><span class="p">]</span> 
<a name="cl-49"></a>        <span class="p">(</span><span class="nf">cond</span>
<a name="cl-50"></a>                <span class="p">(</span><span class="nf">empty?</span> <span class="nv">a-sequence</span><span class="p">)</span> <span class="nv">false</span>
<a name="cl-51"></a>                <span class="nv">:else</span>
<a name="cl-52"></a>                        <span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">= </span><span class="nv">value</span> <span class="p">(</span><span class="nb">first </span><span class="nv">a-sequence</span><span class="p">))</span> <span class="nv">true</span>   <span class="p">(</span><span class="nf">recur</span> <span class="nv">value</span> <span class="p">(</span><span class="nb">rest </span><span class="nv">a-sequence</span><span class="p">)))))</span>      
<a name="cl-53"></a>
<a name="cl-54"></a><span class="p">(</span><span class="k">defn </span><span class="nv">perform-tests</span>
<a name="cl-55"></a> <span class="s">&quot;performs the tests in the test bundle</span>
<a name="cl-56"></a><span class="s">  optional-para is needed to see if the tests need to halt on error</span>
<a name="cl-57"></a><span class="s">  strategy: lazy evaluation over a list of tests&quot;</span>
<a name="cl-58"></a> <span class="p">[</span><span class="nv">test-results</span> <span class="nv">optional-para</span> <span class="nv">count</span><span class="p">]</span> 
<a name="cl-59"></a>        <span class="p">(</span><span class="nf">cond</span>
<a name="cl-60"></a>         <span class="p">(</span><span class="nf">empty?</span> <span class="nv">test-results</span><span class="p">)</span> <span class="p">(</span><span class="nb">list </span><span class="s">&quot;\n---- Finished Checking -----\n&quot;</span><span class="p">)</span>
<a name="cl-61"></a>        <span class="nv">:else</span> 
<a name="cl-62"></a>         <span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">= </span><span class="nv">true</span> <span class="p">(</span><span class="nb">first </span><span class="nv">test-results</span><span class="p">))</span>
<a name="cl-63"></a>                <span class="p">(</span><span class="nf">perform-tests</span> <span class="p">(</span><span class="nb">rest </span><span class="nv">test-results</span><span class="p">)</span> <span class="nv">optional-para</span> <span class="p">(</span><span class="nb">inc </span><span class="nv">count</span><span class="p">))</span>                                   
<a name="cl-64"></a>                 <span class="p">(</span><span class="nf">cons</span>
<a name="cl-65"></a>                   <span class="p">(</span><span class="nb">list </span><span class="p">(</span><span class="nb">list </span><span class="s">&quot;\n FAILED Test #&quot;</span> <span class="nv">count</span><span class="p">)</span> <span class="p">(</span><span class="nb">first </span><span class="nv">test-results</span><span class="p">))</span>
<a name="cl-66"></a>                         <span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nf">present?</span> <span class="nv">:runall</span> <span class="nv">optional-para</span><span class="p">)</span>
<a name="cl-67"></a>                                         <span class="p">(</span><span class="nf">perform-tests</span> <span class="p">(</span><span class="nb">rest </span><span class="nv">test-results</span><span class="p">)</span> <span class="nv">optional-para</span> <span class="p">(</span><span class="nb">inc </span><span class="nv">count</span><span class="p">)))))))</span>
<a name="cl-68"></a>
<a name="cl-69"></a><span class="c1">;; ----------------------------------------------------------------------------</span>
<a name="cl-70"></a><span class="p">(</span><span class="k">defn </span><span class="nv">define-test-bundle</span>
<a name="cl-71"></a>  <span class="s">&quot;Performs the series of test.</span>
<a name="cl-72"></a><span class="s">   Header : (test-bundle test-name [optional-para] (is test1) (is test2)...)</span>
<a name="cl-73"></a><span class="s">   Example: (test-bundle &#39;my-test [:runall :time :noprint]</span>
<a name="cl-74"></a><span class="s">                                     (is (= 2 3) true)(is (= 2 2) true))</span>
<a name="cl-75"></a><span class="s">   testname is compulsory</span>
<a name="cl-76"></a><span class="s">   optional-para could be a vector containing these keywords:   </span>
<a name="cl-77"></a><span class="s">   :runall - if provided it does not halt on the first error</span>
<a name="cl-78"></a><span class="s">             Default: Stops on the first error</span>
<a name="cl-79"></a><span class="s">   :time  -  if provided profiles the running time </span>
<a name="cl-80"></a><span class="s">   :noprint- if provided returns a list of the parsable s-expression results</span>
<a name="cl-81"></a><span class="s">   :skip  -  if provided skips the current test bundle.&quot;</span>
<a name="cl-82"></a>  <span class="p">[</span><span class="nv">testname</span>  <span class="nv">&amp;</span> <span class="p">[</span><span class="nv">optional-para</span> <span class="nv">&amp;</span> <span class="nv">is-expr</span><span class="p">]]</span>
<a name="cl-83"></a>        <span class="p">(</span><span class="nb">when-not </span><span class="p">(</span><span class="nf">present?</span> <span class="nv">:skip</span> <span class="nv">optional-para</span><span class="p">)</span>
<a name="cl-84"></a>          <span class="p">(</span><span class="nf">do</span>
<a name="cl-85"></a>           <span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nf">present?</span> <span class="nv">:time</span> <span class="nv">optional-para</span><span class="p">)</span> 
<a name="cl-86"></a>                         <span class="p">(</span><span class="k">def </span><span class="nv">result</span> <span class="p">(</span><span class="nb">cons </span> <span class="nv">testname</span> <span class="p">(</span><span class="nb">time </span><span class="p">(</span><span class="nf">perform-tests</span> <span class="nv">is-expr</span> <span class="nv">optional-para</span> <span class="mi">1</span><span class="p">))))</span>
<a name="cl-87"></a>                         <span class="p">(</span><span class="k">def </span><span class="nv">result</span> <span class="p">(</span><span class="nb">cons </span><span class="nv">testname</span> <span class="p">(</span><span class="nf">perform-tests</span> <span class="nv">is-expr</span> <span class="nv">optional-para</span> <span class="mi">1</span><span class="p">))))</span>
<a name="cl-88"></a>           <span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nf">present?</span> <span class="nv">:noprint</span> <span class="nv">optional-para</span><span class="p">)</span>
<a name="cl-89"></a>                         <span class="nv">result</span>
<a name="cl-90"></a>                         <span class="p">(</span><span class="nb">print </span><span class="p">(</span><span class="nf">flatten</span> <span class="nv">result</span><span class="p">))))))</span>
<a name="cl-91"></a>
<a name="cl-92"></a><span class="c1">;; ===============           Sample test              =========================</span>
<a name="cl-93"></a><span class="p">(</span><span class="k">defn </span><span class="nv">approx-equal</span> <span class="p">[</span><span class="nv">tolerance</span><span class="p">]</span>
<a name="cl-94"></a>  <span class="s">&quot;Compares two numbers that lies within a tolerance&quot;</span>
<a name="cl-95"></a>  <span class="p">(</span><span class="k">fn </span><span class="p">[</span><span class="nv">x</span> <span class="nv">y</span><span class="p">](</span><span class="nb">or </span><span class="p">(</span><span class="nb">= </span><span class="nv">x</span> <span class="nv">y</span><span class="p">)(</span><span class="nb">= </span><span class="nv">x</span> <span class="p">(</span><span class="nb">+ </span><span class="nv">y</span> <span class="nv">tolerance</span><span class="p">))</span> <span class="p">(</span><span class="nb">= </span><span class="nv">x</span> <span class="p">(</span><span class="nb">- </span><span class="nv">y</span> <span class="nv">tolerance</span><span class="p">))</span>
<a name="cl-96"></a>        <span class="p">(</span><span class="nb">= </span><span class="nv">y</span> <span class="p">(</span><span class="nb">+ </span><span class="nv">x</span> <span class="nv">tolerance</span><span class="p">))</span> <span class="p">(</span><span class="nb">= </span><span class="nv">y</span> <span class="p">(</span><span class="nb">- </span><span class="nv">x</span> <span class="nv">tolerance</span><span class="p">)))))</span>
<a name="cl-97"></a>
<a name="cl-98"></a><span class="c1">;; Test for Side Effects</span>
<a name="cl-99"></a><span class="p">(</span><span class="k">def </span><span class="nv">aRef</span> <span class="p">(</span><span class="nb">ref </span><span class="nv">nil</span><span class="p">))</span>
<a name="cl-100"></a><span class="p">(</span><span class="k">defn </span><span class="nv">getRef</span> <span class="p">[]</span> <span class="p">(</span><span class="nb">deref </span><span class="nv">aRef</span><span class="p">))</span>
<a name="cl-101"></a><span class="p">(</span><span class="k">defn </span><span class="nv">setRef</span> <span class="p">[</span><span class="nv">new-val</span><span class="p">]</span> <span class="p">(</span><span class="nb">dosync </span><span class="p">(</span><span class="nb">ref-set </span><span class="nv">aRef</span> <span class="nv">new-val</span><span class="p">)))</span>
<a name="cl-102"></a>
<a name="cl-103"></a><span class="p">(</span><span class="nf">define-test-bundle</span> <span class="ss">&#39;my-test</span> <span class="p">[</span><span class="nv">:runall</span> <span class="nv">:time</span><span class="p">]</span>
<a name="cl-104"></a>  <span class="c1">;; Simple True Statement</span>
<a name="cl-105"></a>  <span class="p">(</span><span class="nf">is</span> <span class="p">(</span><span class="nb">= </span><span class="mi">2</span> <span class="mi">2</span><span class="p">))</span>
<a name="cl-106"></a>        <span class="p">(</span><span class="nf">is</span> <span class="p">(</span><span class="nb">instance? </span><span class="nv">clojure</span><span class="o">.</span><span class="nv">lang</span><span class="o">.</span><span class="nv">Symbol</span> <span class="ss">&#39;alphabet</span><span class="p">))</span>
<a name="cl-107"></a>  <span class="c1">;; Simple Comparisons</span>
<a name="cl-108"></a>        <span class="p">(</span><span class="nf">is</span> <span class="p">(</span><span class="nb">+ </span><span class="mi">2</span> <span class="mi">2</span><span class="p">)</span> <span class="mi">50</span><span class="p">)</span>
<a name="cl-109"></a>  <span class="p">(</span><span class="nf">is</span> <span class="p">(</span><span class="k">let </span><span class="p">[</span><span class="nv">x</span> <span class="mi">2</span><span class="p">]</span> <span class="p">(</span><span class="nb">* </span><span class="nv">x</span> <span class="nv">x</span><span class="p">))</span> <span class="mi">4</span><span class="p">)</span>
<a name="cl-110"></a>  <span class="c1">;; Compare Data Structures</span>
<a name="cl-111"></a>        <span class="p">(</span><span class="nf">is</span> <span class="p">(</span><span class="nb">map </span><span class="p">(</span><span class="nf">fn</span><span class="p">[</span><span class="nv">x</span><span class="p">](</span><span class="nf">Math/sqrt</span> <span class="nv">x</span><span class="p">))</span> <span class="p">(</span><span class="nb">list </span><span class="mi">4</span> <span class="mi">16</span><span class="p">))</span> <span class="p">(</span><span class="nb">list </span><span class="mi">2</span> <span class="mi">4</span><span class="p">))</span>
<a name="cl-112"></a>  <span class="p">(</span><span class="nf">is</span> <span class="p">{</span><span class="nv">:key</span> <span class="mi">1</span><span class="p">}</span> <span class="p">{</span><span class="nv">:key</span> <span class="mi">1</span><span class="p">})</span>
<a name="cl-113"></a>  <span class="p">(</span><span class="nf">is</span> <span class="p">(</span><span class="o">.</span><span class="nv">toUpperCase</span> <span class="s">&quot;foo&quot;</span><span class="p">)</span> <span class="s">&quot;FOo&quot;</span><span class="p">)</span>
<a name="cl-114"></a>  <span class="c1">;; User Defined Comparator Functions</span>
<a name="cl-115"></a>  <span class="p">(</span><span class="nf">is</span> <span class="mi">3</span> <span class="mi">4</span> <span class="p">{</span><span class="nv">:function</span> <span class="nv">&lt;</span><span class="p">})</span>
<a name="cl-116"></a>  <span class="p">(</span><span class="nf">is</span> <span class="mi">2</span> <span class="mf">2.1</span> <span class="p">{</span><span class="nv">:function</span> <span class="p">(</span><span class="nf">approx-equal</span> <span class="mf">0.1</span><span class="p">)})</span>
<a name="cl-117"></a>  <span class="c1">;; Exception Checks</span>
<a name="cl-118"></a>  <span class="p">(</span><span class="nf">is</span> <span class="p">(</span><span class="nb">/ </span><span class="mi">1</span> <span class="mi">0</span><span class="p">)</span> <span class="mi">1</span><span class="p">)</span>
<a name="cl-119"></a>  <span class="p">(</span><span class="nf">is</span> <span class="p">(</span><span class="nb">/ </span><span class="mi">1</span> <span class="mi">0</span><span class="p">)</span> <span class="mi">1</span> <span class="p">{</span><span class="nv">:exception</span> <span class="nv">NullPointerException</span><span class="p">})</span>
<a name="cl-120"></a>  <span class="p">(</span><span class="nf">is</span> <span class="p">(</span><span class="nb">/ </span><span class="mi">1</span> <span class="mi">0</span><span class="p">)</span> <span class="mi">1</span> <span class="p">{</span><span class="nv">:exception</span> <span class="nv">ArithmeticException</span><span class="p">})</span>
<a name="cl-121"></a>  <span class="c1">;; Timeout Tests</span>
<a name="cl-122"></a>  <span class="p">(</span><span class="nf">is</span> <span class="p">(</span><span class="nb">/ </span><span class="mi">1</span> <span class="mi">0</span><span class="p">)</span> <span class="mi">1</span> <span class="p">{</span><span class="nv">:timeout</span> <span class="mi">1</span> <span class="nv">:exception</span> <span class="nv">ArithmeticException</span><span class="p">})</span>
<a name="cl-123"></a>  <span class="p">(</span><span class="nf">is</span> <span class="p">(</span><span class="nb">reduce </span><span class="nv">*</span> <span class="p">(</span><span class="nb">range </span><span class="mi">1</span> <span class="mi">10001</span><span class="p">))</span> <span class="mi">1</span> <span class="p">{</span><span class="nv">:timeout</span> <span class="mi">1</span><span class="p">})</span>
<a name="cl-124"></a>  <span class="c1">;; Run After (Dependency or Sideffect Functions Tests)</span>
<a name="cl-125"></a>  <span class="p">(</span><span class="nf">is</span> <span class="p">(</span><span class="nf">getRef</span><span class="p">)</span> <span class="s">&quot;val2&quot;</span> <span class="p">{</span><span class="nv">:run-after</span>
<a name="cl-126"></a>                       <span class="p">(</span><span class="nf">do</span> <span class="p">(</span><span class="nf">setRef</span> <span class="s">&quot;val1&quot;</span><span class="p">)</span> <span class="p">(</span><span class="nf">setRef</span> <span class="s">&quot;val2&quot;</span><span class="p">))}))</span>
</pre></div>
</td></tr></table>
		
		</div>
	
</div>



      </div>
    </div>

  </div>

  <div id="footer">
    <ul id="footer-nav">
      <li>Copyright © 2011 <a href="http://atlassian.com">Atlassian</a></li>
      <li><a href="http://www.atlassian.com/hosted/terms.jsp">Terms of Service</a></li>
      <li><a href="http://www.atlassian.com/about/privacy.jsp">Privacy</a></li>
      <li><a href="//bitbucket.org/site/master/issues/new">Report a Bug to Bitbucket</a></li>
      <li><a href="http://confluence.atlassian.com/x/IYBGDQ">API</a></li>
      <li><a href="http://status.bitbucket.org/">Server Status</a></li>
    </ul>
    <ul id="social-nav">
      <li class="blog"><a href="http://blog.bitbucket.org">Bitbucket Blog</a></li>
      <li class="twitter"><a href="http://www.twitter.com/bitbucket">Twitter</a></li>
    </ul>
    <h5>We run</h5>
    <ul id="technologies">
      <li><a href="http://www.djangoproject.com/">Django 1.3.0</a></li>
      <li><a href="//bitbucket.org/jespern/django-piston/">Piston 0.3dev</a></li>
      <li><a href="http://www.selenic.com/mercurial/">Hg 1.8.2</a></li>
      <li><a href="http://www.python.org">Python 2.7.0</a></li>
      <li>r7990:7f15ce0aad1d | bitbucket02</li>
    </ul>
  </div>

  <script src="https://dwz7u9t8u8usb.cloudfront.net/m/f46996830fe9/js/lib/global.js"></script>






  <script src="//cdn.optimizely.com/js/4079040.js"></script>
  <script type="text/javascript">
    BB.gaqPush(['_trackPageview']);
  
    BB.gaqPush(['atl._trackPageview']);
    BB.gaqPush(['demandgen._trackPageview']);

    

    

    (function () {
        var ga = document.createElement('script');
        ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
        ga.setAttribute('async', 'true');
        document.documentElement.firstChild.appendChild(ga);
    }());
  </script>

</body>
</html>
