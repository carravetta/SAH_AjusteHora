<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>
	${usuarioLogado}
		<form action="adicionarController" method="Post">
		    Nome do Trabalhador: <input type="text" name="nome" /><br />
		    Horas: <input type="number" name="horas" /><br />
		    Minutos: <input type="number" name="minutos" /><br />
	    <input type="submit" value="Enviar"/>
    </form>
	</body>
</html>