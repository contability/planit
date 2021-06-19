<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui" %>

<script type="text/javascript" src="<c:url value='/js/manage/user/userList.js' />"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div id="div_user_list">
		<table id="tbl_user_list" class="tbl_basic">
			<colgroup>
				<col width="25%">
				<col width="25%">
				<col width="25%">
				<col width="*">
			</colgroup>
			<thead>
				<tr>
					<td>아이디</td>
					<td>이름</td>
					<td>유저타입</td>
					<td>사용여부</td>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	
	</div>
	
</body>
</html>