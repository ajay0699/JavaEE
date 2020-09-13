<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <% ArrayList arr=(ArrayList)request.getAttribute("myList");%> 


<c:forEach var="x" items="<%=arr %>">
	${x}
</c:forEach>