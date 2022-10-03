<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Omikuji Form</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<div class="content">
		<h1>Send an Omikuji!</h1>
		<form class="form" action="/daikichi/omikuji/submit" method="POST">
			<label>Pick any number from 5 to 25</label>
			<br>
			<input type="number" name="number">
			<br>
			<label>Enter the name of any city</label>
			<br>
			<input type="text" name="city">
			<br>
			<label>Enter of the name of any real person</label>
			<br>
			<input type="text" name="person">
			<br>
			<label>Enter professional endeavor or hobby:</label>
			<br>
			<input type="text" name="hobby">
			<br>
			<label>Enter any type of any living thing</label>
			<br>
			<input type="text" name="livingThing">
			<br>
			<label>Say something nice to someone:</label>
			<br>
			<textarea type="text" name="compliment"></textarea>
			<br>
			<p>Send and show a friend</p>
			<input type="submit" value="Send"/>
		</form>
	</div>
	
</body>
</html>