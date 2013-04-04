<%@ include file="../header.jsp"%>

	<div class="container">
	
		<div id="chart1" style="height:400px;width:300px; "></div>
		
		<script>		
			$.jqplot('chart1',  [[34.53, 56.32, 25.1, 18.6]], {series:[{renderer:$.jqplot.BarRenderer}]});
		</script>
				
		<ul>
			<c:forEach items="${mediasRN}" var="media">
				<li><a href="<c:url value="/" />">${media[0]}</a> (${media[1]})</li>	
			</c:forEach>
		</ul>

<%@ include file="../footer.jsp" %>