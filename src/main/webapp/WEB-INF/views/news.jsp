<%-- 
    Document   : news-page
    Created on : Jan 24, 2026, 3:41:43 PM
    Author     : mottramkg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>F1 News</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.3.0/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-5">
            <br>
            <form action="searchNews" method="POST">
                <div class="search-bar">
                    <h2>Search:</h2>
                    <input type="text" name="searchInput" placeholder="Enter keywords..."/>    
                    <input type="submit" value="Submit" class="btn btn-primary"/>                       
                </div>
            </form>
        </div>
        <div class="container mt-5">
            
        </div>
    </body>
</html>
