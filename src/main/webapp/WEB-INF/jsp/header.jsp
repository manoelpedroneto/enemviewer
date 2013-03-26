<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
  <head>
    <title>Enem Viewer</title>

    <!-- styles -->
    <link href="../bootstrap/css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 20px;
      }
	.thumbnails img {
		height: 169px;
		width: 128px;
	}

    </style>
    <link href="../bootstrap/css/bootstrap-responsive.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    
    <!-- JQPlot -->
    <!--[if lt IE 9]><script language="javascript" type="text/javascript" src="../jquery/excanvas.js"></script><![endif]-->
	<script type="text/javascript" src="../jquery/jquery.min.js"></script>
	<script type="text/javascript" src="../jquery/jquery.jqplot.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../jquery/jquery.jqplot.css" />
	
	<script type="text/javascript" src="../jquery/plugins/jqplot.cursor.min.js"></script>
	<script type="text/javascript" src="../jquery/plugins/jqplot.highlighter.min.js"></script>

	<script type="text/javascript" src="../jquery/plugins/jqplot.dateAxisRenderer.min.js"></script>
	<script type="text/javascript" src="../jquery/plugins/jqplot.barRenderer.min.js"></script>
	<script type="text/javascript" src="../jquery/plugins/jqplot.categoryAxisRenderer.min.js"></script>
	<script type="text/javascript" src="../jquery/plugins/jqplot.pointLabels.min.js"></script>
	
  </head>

  <body>

