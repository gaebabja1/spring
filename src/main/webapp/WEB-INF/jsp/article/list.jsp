<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<%@ page import="com.example.starter.dto.Article"%>
<%
	List<Article> list = (List<Article>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커뮤니티 사이트 - 게시물 작성</title>
<link rel="stylesheet" href="/resource/common.css">
</head>
<body>
	<h1 class="con">게시물 리스트</h1>
	<h2 class="con">전체 게시물 개수 : ${totalCount}</h2>
	
	<div class="con">
		<c:forEach items="${list}" var="article">
			<section>
				<a href="./detail?id=${article.id}">번호 : ${article.id}, 제목 : ${article.title}</a>
			</section>
			<hr>
		</c:forEach>
	</div>

	<div class="btns con">
		<a href="./add">게시물 추가</a>
	</div>
</body>