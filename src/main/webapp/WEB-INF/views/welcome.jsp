<%-- 
    Document   : welcom
    Created on : Jan 24, 2026, 4:14:15 PM
    Author     : mottramkg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Welcome to F1 news</title>
            <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.3.0/css/bootstrap.min.css">
        </head>
        <body>
        <header>
            <div class="container mt-5">
                <div>
                    Icon :)
                </div>
                <div>
                    <a href="login" class="btn btn-primary">Login</a>
                </div>
            </div>
        </header>
            <div class="container mt-5">
                <div class="card" style="width: 30rem">
                    <div class="card-body">
                        <h1 class="card-title">Welcome to F1 news</h1>
                        <a href="news" class="btn btn-primary">
                            View F1 News    
                        </a>    
                    </div>
                </div>
               
            </div>
            
        </body>
    </html>
</f:view>
