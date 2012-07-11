<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta http-equiv="Content-Type"	content="text/html;	charset=UTF-8">
	<meta charset="utf-8">
	<title>Spring education</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="HTML5	base Spring	code education">
	<meta name="author"	content="euiseok.yang@gmail.com">

	<!-- Le styles -->
	<link href="http://twitter.github.com/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
	<style type="text/css">
	  body {
		padding-top: 60px;
		padding-bottom:	40px;
	  }
	  .sidebar-nav {
		padding: 9px 0;
	  }
	</style>
	<link href="http://twitter.github.com/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">

	<!-- Le	HTML5 shim,	for	IE6-8 support of HTML5 elements	-->
	<!--[if	lt IE 9]>
	  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

	<!-- Le	fav	and	touch icons	-->
	<!-- Favicon -->
	<link rel="shortcut	icon" href="http://twitter.github.com/bootstrap/assets/ico/favicon.ico">
	<!-- Apple icon	-->
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-144-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-114-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-72-precomposed.png">
	<link rel="apple-touch-icon-precomposed" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-57-precomposed.png">
  </head>

  <body>
	<!-- nav -->
	<div class="navbar navbar-fixed-top">
	  <div class="navbar">
	    <div class="navbar-inner">
	      <div class="container">
	        <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
	          <span class="icon-bar"></span>
	          <span class="icon-bar"></span>
	          <span class="icon-bar"></span>
	        </a>
	        <a class="brand" href="/spring">Spring</a>
	        <div class="nav-collapse">
	          <ul class="nav">
	            <li class="active"><a href="#">Home</a></li>
	            <li><a href="#">Link</a></li>
	            <li><a href="#">Link</a></li>
	            <li><a href="#">Link</a></li>
	            <li class="dropdown">
	              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
	              <ul class="dropdown-menu">
	                <li><a href="#">Action</a></li>
	                <li><a href="#">Another action</a></li>
	                <li><a href="#">Something else here</a></li>
	                <li class="divider"></li>
	                <li class="nav-header">Nav header</li>
	                <li><a href="#">Separated link</a></li>
	                <li><a href="#">One more separated link</a></li>
	              </ul>
	            </li>
	          </ul>
	          <form class="navbar-search pull-left" action="">
	            <input type="text" class="search-query span2" placeholder="Search">
	          </form>
	          <ul class="nav pull-right">
	            <li><a href="#">Link</a></li>
	            <li class="divider-vertical"></li>
	            <li class="dropdown">
	              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
	              <ul class="dropdown-menu">
	                <li><a href="#">Action</a></li>
	                <li><a href="#">Another action</a></li>
	                <li><a href="#">Something else here</a></li>
	                <li class="divider"></li>
	                <li><a href="#">Separated link</a></li>
	              </ul>
	            </li>
	          </ul>
	        </div><!-- /.nav-collapse -->
	      </div>
	    </div><!-- /navbar-inner -->
	  </div><!-- /navbar -->
	</div>

	<div class="container-fluid">
	  <div class="row-fluid">
		<div class="span12">
		  <div class="page-header">
		    <h1>Log in</h1>
		  </div>
		  <div class="row-fluid">
			<form class="well form-inline">
			  <label>User name</label>
			  <input type="text" class="input-small" placeholder="Email">
			  <input type="password" class="input-small" placeholder="Password">
			  <label class="checkbox">
			    <input type="checkbox"> Remember me
			  </label>
			  <button type="submit" class="btn">Sign in</button>
			</form>
		  </div><!--/row-->
		</div><!--/span-->
	  </div><!--/row-->

	  <hr>

	  <footer>
		<p>Â© euiseok.yang 2012</p>
	  </footer>

	</div><!--/.fluid-container-->

	<!-- Le	javascript
	================================================== -->
	<!-- Placed	at the end of the document so the pages	load faster	-->
	<script	src="resources/js/jquery.js"></script>
	<script	src="resources/js/bootstrap-transition.js"></script>
	<script	src="resources/js/bootstrap-alert.js"></script>
	<script	src="resources/js/bootstrap-modal.js"></script>
	<script	src="resources/js/bootstrap-dropdown.js"></script>
	<script	src="resources/js/bootstrap-scrollspy.js"></script>
	<script	src="resources/js/bootstrap-tab.js"></script>
	<script	src="resources/js/bootstrap-tooltip.js"></script>
	<script	src="resources/js/bootstrap-popover.js"></script>
	<script	src="resources/js/bootstrap-button.js"></script>
	<script	src="resources/js/bootstrap-collapse.js"></script>
	<script	src="resources/js/bootstrap-carousel.js"></script>
	<script	src="resources/js/bootstrap-typeahead.js"></script>
  </body>
</html>
