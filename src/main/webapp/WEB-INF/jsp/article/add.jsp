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
	<h1 class="con">게시물 작성</h1>

	<script>
		function submitAddForm(form) {
			form.title.value = form.title.value.trim();
			if (form.title.value.length == 0) {
				alert('제목을 입력해주세요.');
				form.title.focus();
				return false;
			}
			form.body.value = form.body.value.trim();
			if (form.body.value.length == 0) {
				alert('내용을 입력해주세요.');
				form.body.focus();
				return false;
			}
			form.submit();
		}
	</script>

	<form class="con common-form" action="./doAdd" method="POST"
		onsubmit="submitAddForm(this); return false;">
		<div>
			<span> 제목 </span>
			<div>
				<input name="title" type="text" placeholder="제목"
					autofocus="autofocus">
			</div>
		</div>

		<div>
			<span> 내용 </span>
			<div>
				<textarea name="body" placeholder="내용"></textarea>
			</div>
		</div>

		<div>
			<span> 작성 </span>
			<div>
				<input type="submit" value="작성"> <input type="reset"
					value="취소" onclick="history.back();">
			</div>
		</div>
	</form>
</body>
</html> 