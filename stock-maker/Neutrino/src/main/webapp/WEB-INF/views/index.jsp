<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta http-equiv="Content-Type"	content="text/html;	charset=UTF-8">
	<meta charset="utf-8">
	<title>Spring education</title>
	<!-- viewport :	Webkit 기반	브라우져의 설정	/ Device 설정에	기반 -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="HTML5	base Spring	code education">
	<meta name="author"	content="euiseok.yang@gmail.com">

	<!-- Le styles -->
	<link href="${pageContext.servletContext.contextPath}/resources/css/bootstrap.css" rel="stylesheet">
	<style type="text/css">
	  body {
		padding-top: 60px;
		padding-bottom:	40px;
	  }
	  .sidebar-nav {
		padding: 9px 0;
	  }
	</style>
	<link href="${pageContext.servletContext.contextPath}/resources/css/bootstrap-responsive.css" rel="stylesheet">

	<!-- Le	HTML5 shim,	for	IE6-8 support of HTML5 elements	-->
	<!--[if	lt IE 9]>
	  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

	<!-- Le	fav	and	touch icons	-->
	<!-- Favicon -->
	<link rel="shortcut	icon" href="http://twitter.github.com/bootstrap/assets/ico/favicon.ico">
	<!-- Apple icon	-->
	<!-- 변경해야 함!!! -->
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-144-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-114-precomposed.png">
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-72-precomposed.png">
	<link rel="apple-touch-icon-precomposed" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-57-precomposed.png">
  </head>

  <body>
	<!-- nav -->
	<div class="navbar navbar-fixed-top">
	  <div class="navbar-inner">
		<div class="container-fluid">
		  <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		  </a>
		  <a class="brand" href="/spring">Spring</a>
		  <div class="btn-group	pull-right">
			<a class="btn dropdown-toggle" data-toggle="dropdown" href="">
			  <i class="icon-user"></i>User Name
			  <span	class="caret"></span>
			</a>
			<ul	class="dropdown-menu">
			  <li><a href="login">Login</a></li>
			  <li class="divider"></li>
			  <li><a href="signUp">Sign Up</a></li>
			</ul>
		  </div>
		  <div class="nav-collapse">
			<ul	class="nav">
			  <li class="active"><a	href="#">Home</a></li>
			  <li><a href="#about">About</a></li>
			  <li><a href="#contact">Contact</a></li>
			</ul>
		  </div><!--/.nav-collapse -->
		</div>
	  </div>
	</div>

	<div class="container-fluid">
	  <div class="row-fluid">
		<div class="span3">
		  <div class="well sidebar-nav">
			<ul	class="nav nav-list">
			  <li class="nav-header">Sidebar</li>
			  <li class="active"><a	href="#">Link</a></li>
			  <li><a href="#">Link</a></li>
			  <li><a href="#">Link</a></li>
			  <li><a href="#">Link</a></li>
			  <li class="nav-header">Sidebar</li>
			  <li><a href="#">Link</a></li>
			  <li><a href="#">Link</a></li>
			  <li><a href="#">Link</a></li>
			  <li><a href="#">Link</a></li>
			  <li><a href="#">Link</a></li>
			  <li><a href="#">Link</a></li>
			  <li class="nav-header">Sidebar</li>
			  <li><a href="#">Link</a></li>
			  <li><a href="#">Link</a></li>
			  <li><a href="#">Link</a></li>
			</ul>
		  </div><!--/.well -->
		</div><!--/span-->
		<div class="span9">
		  <div class="hero-unit">
			<h1>Hello, Spring</h1>
			<p>Spring initiative</p>
			<p><a class="btn btn-primary btn-large">Learn more »</a></p>
		  </div>
		  <div class="row-fluid">
			<div class="span4">
			  <h2>Heading</h2>
			  <p>Donec id elit non mi porta	gravida	at eget	metus. Fusce dapibus, tellus ac	cursus commodo,	tortor mauris condimentum nibh,	ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis	euismod. Donec sed odio	dui. </p>
			  <p><a	class="btn"	href="http://twitter.github.com/bootstrap/examples/fluid.html#">View details »</a></p>
			</div><!--/span-->
			<div class="span4">
			  <h2>Heading</h2>
			  <p>Donec id elit non mi porta	gravida	at eget	metus. Fusce dapibus, tellus ac	cursus commodo,	tortor mauris condimentum nibh,	ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis	euismod. Donec sed odio	dui. </p>
			  <p><a	class="btn"	href="http://twitter.github.com/bootstrap/examples/fluid.html#">View details »</a></p>
			</div><!--/span-->
			<div class="span4">
			  <h2>Heading</h2>
			  <p>Donec id elit non mi porta	gravida	at eget	metus. Fusce dapibus, tellus ac	cursus commodo,	tortor mauris condimentum nibh,	ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis	euismod. Donec sed odio	dui. </p>
			  <p><a	class="btn"	href="http://twitter.github.com/bootstrap/examples/fluid.html#">View details »</a></p>
			</div><!--/span-->
		  </div><!--/row-->
		  <div class="row-fluid">
			<div class="span4">
			  <h2>Heading</h2>
			  <p>Donec id elit non mi porta	gravida	at eget	metus. Fusce dapibus, tellus ac	cursus commodo,	tortor mauris condimentum nibh,	ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis	euismod. Donec sed odio	dui. </p>
			  <p><a	class="btn"	href="http://twitter.github.com/bootstrap/examples/fluid.html#">View details »</a></p>
			</div><!--/span-->
			<div class="span4">
			  <h2>Heading</h2>
			  <p>Donec id elit non mi porta	gravida	at eget	metus. Fusce dapibus, tellus ac	cursus commodo,	tortor mauris condimentum nibh,	ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis	euismod. Donec sed odio	dui. </p>
			  <p><a	class="btn"	href="http://twitter.github.com/bootstrap/examples/fluid.html#">View details »</a></p>
			</div><!--/span-->
			<div class="span4">
			  <h2>Heading</h2>
			  <p>Donec id elit non mi porta	gravida	at eget	metus. Fusce dapibus, tellus ac	cursus commodo,	tortor mauris condimentum nibh,	ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis	euismod. Donec sed odio	dui. </p>
			  <p><a	class="btn"	href="http://twitter.github.com/bootstrap/examples/fluid.html#">View details »</a></p>
			</div><!--/span-->
		  </div><!--/row-->
		</div><!--/span-->
	  </div><!--/row-->

	  <hr>

	  <footer>
		<p>© euiseok.yang@gmail.com 2012</p>
	  </footer>

	</div><!--/.fluid-container-->

	<!-- Javascript
	================================================== -->
	<!-- Placed	at the end of the document so the pages	load faster	-->
	<script	src="${pageContext.servletContext.contextPath}/resources/js/jquery.js"></script>
	<script	src="${pageContext.servletContext.contextPath}/resources/js/bootstrap-transition.js"></script>
	<script	src="${pageContext.servletContext.contextPath}/resources/js/bootstrap-alert.js"></script>
	<script	src="${pageContext.servletContext.contextPath}/resources/js/bootstrap-modal.js"></script>
	<script	src="${pageContext.servletContext.contextPath}/resources/js/bootstrap-dropdown.js"></script>
	<script	src="${pageContext.servletContext.contextPath}/resources/js/bootstrap-scrollspy.js"></script>
	<script	src="${pageContext.servletContext.contextPath}/resources/js/bootstrap-tab.js"></script>
	<script	src="${pageContext.servletContext.contextPath}/resources/js/bootstrap-tooltip.js"></script>
	<script	src="${pageContext.servletContext.contextPath}/resources/js/bootstrap-popover.js"></script>
	<script	src="${pageContext.servletContext.contextPath}/resources/js/bootstrap-button.js"></script>
	<script	src="${pageContext.servletContext.contextPath}/resources/js/bootstrap-collapse.js"></script>
	<script	src="${pageContext.servletContext.contextPath}/resources/js/bootstrap-carousel.js"></script>
	<script	src="${pageContext.servletContext.contextPath}/resources/js/bootstrap-typeahead.js"></script>
  </body>
</html>
