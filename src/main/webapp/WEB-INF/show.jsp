<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Omikuji</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<h1>Here's Your Omikuji!</h1>
	<h3>In ${number} years, you will live in ${city} with ${person} as your roommate, 
	${hobby} for a living. The next time you see a ${livingThing}, you will 
	have good luck. Also, ${compliment}</h3>
	<a id="link1" href="/daikichi/omikuji">Go Back</a>

</body>
</html>