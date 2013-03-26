<%@ include file="../header.jsp"%>

	Realizando testes de acesso ao banco...

	<table>
		<thead>
			<tr style="font-weight: bold;">
				<td>Inscrição</td>
				<td>Sexo</td>
			</tr>
		</thead>
	
		<c:forEach items="${inscricoes}" var="inscricao">
			<tr>
				<td><a href="<c:url value="/" />">${inscricao.id}</a></td>
				<td>${inscricao.sexo}</td>
			</tr>
		</c:forEach>
	</table>
	
<%@ include file="../footer.jsp" %>      

