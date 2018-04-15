<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<body>
		lista de ajustes
		<ul>
			<table border="1">
		        <c:forEach var="ajuste" items="${ajustes}">
		           
		        </c:forEach>
	        </table>
	    </ul>
		
		<form action="dashBoard" method="post"> 
			<input type="submit" value="NOVO AJUSTE"> 
		</form> 
		
		<form action="logout" method="post"> 
			<input type="submit" value="SAIR"> 
		</form>	
	</body>
</html>