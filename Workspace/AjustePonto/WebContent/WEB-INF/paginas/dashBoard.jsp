<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<body>
		lista de ajustes
		<ul>
			<table border="1">
			<tr>
				<th>Trabalhador</th>
			    <th>Data</th>
			    <th>Data Inicial</th> 
			    <th>Data Final</th>
			    <th>Justificativa</th>
			    <th>Status</th>
			    <th>ID</th>
			  </tr>
		        <c:forEach items="${ajustes}" var="ajuste">
		        	<tr>
		        		<td>${ajuste.usuario.nome}</td>
					    <td>${ajuste.data}</td>
					    <td>${ajuste.horaInicial}</td>
					    <td>${ajuste.horaFinal}</td>
					    <td>${ajuste.justificativa}</td>
					    <td>${ajuste.status}</td>
					    <td>${ajuste.id}</td>
					</tr>
		        </c:forEach>
		        
	        </table>
	    </ul>
		
		<form action="dashBoard" method="post"> 
			<input type="submit" value="NOVO AJUSTE"> 
		</form> 
		
		<form   action="aprovarAjuste" method="post">
			ID do Ajuste para Aprovar/Reprovar: <input type="number" name="ajusteAprovar" required="true"/>
			<input type="submit" value="APROVAR/REPROVAR"> 
		</form>
		
		<form action="logout" method="post"> 
			<input type="submit" value="SAIR"> 
		</form>	
	</body>
</html>