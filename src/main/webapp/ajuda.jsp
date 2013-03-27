<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Enem Viewer</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- styles -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 20px;
}

.thumbnails img,img.thumbnail {
	height: 250px;
	width: 300px;
}
</style>
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
	      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	    <![endif]-->
</head>

<body>

	 <div class="navbar  navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="index.jsp">Enem Viewer</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li><a href="<c:url value="/"/>"><i class="icon-home"></i> Home</a></li>
              <li><a href="<c:url value="/painel/chart"/>"><i class="icon-folder-close"> </i> Painel</a></li>
              <li><a href="<c:url value="/visualizador/form"/>"><i class="icon-eye-open"> </i> Visualizar Dados</a></li>
              <li><a href="<c:url value="/graficos/form"/>"><i class="icon-signal"> </i> Gráficos</a></li>
              <li  class="active"><a href="<c:url value="/ajuda.jsp"/>"><i class="icon-question-sign"> </i> Ajuda</a></li>              
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

	<div class="container">

		<br />
		<h3>Ajuda</h3>
		<div class="row-fluid">
			<div class="pagination-centered">Maecenas
				dictum tortor et libero mollis accumsan. Nunc gravida, sem vel
				feugiat tincidunt, risus tellus interdum neque, eu congue dui erat
				bibendum arcu. Donec orci massa, sollicitudin at tempus vitae,
				lacinia vitae turpis. Vestibulum volutpat, lectus sit amet
				suscipit faucibus, ligula est imperdiet magna, id pulvinar turpis
				mauris tempor arcu. Curabitur vitae ipsum sit amet velit ultricies
				sollicitudin. Praesent sed felis dolor, eu ultrices enim. In hac
				habitasse platea dictumst. Mauris at consectetur quam.
			</div>
		</div>

		<hr>
		
<%@ include file="footer.jsp" %>   