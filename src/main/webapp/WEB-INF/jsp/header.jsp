<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
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
  
    <div class="navbar  navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="<c:url value="/home/index"/>">Enem Viewer</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li><a href="<c:url value="/home/index"/>"><i class="icon-home"></i> Home</a></li>
              <li><a href="<c:url value="/painel/chart"/>"><i class="icon-folder-close"> </i> Painel</a></li>
              <li class="dropdown">
				  <a class="dropdown-toggle" data-toggle="dropdown" href="#"><i class="icon-eye-open"></i> Visualizar Dados<span class="caret"></span></a>
				  <ul class="dropdown-menu">
				    <li><a href="<c:url value="/visualizador/sexo"/>"><i class="icon-filter"></i> Agrupados por Sexo</a></li>
				    <li><a href="<c:url value="/visualizador/idade"/>"><i class="icon-filter"></i> Agrupados por Idade</a></li>
				  </ul>
			  </li>
              <li><a href="<c:url value="/graficos/form"/>"><i class="icon-signal"> </i> Gráficos</a></li>
              <li><a href="<c:url value="/ajuda/ajuda"/>"><i class="icon-question-sign"> </i> Ajuda</a></li>              
            
            </ul>
            
            <c:if test="${usuario != null}">
	            <ul class="nav pull-right">
	            	<li><a href="<c:url value="/"/>"><i class="icon-user"> </i>${usuario.nome}</a></li>
	            </ul>
            </c:if>
            
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

