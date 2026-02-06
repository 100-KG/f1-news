<%-- 
    Document   : login
    Created on : Jan 29, 2026, 9:18:34 PM
    Author     : mottramkg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Login</title>
        </head>
        <body>
            
            <div class="container mt-5 card">
                <h1>LOGIN PAGE</h1>
                <div>
                    <form action="/auth/checkLogin" method="POST">
                        <div class="container mt-5">
                            Username: <input type="text" name="username" placeholder="Enter username..."/>
                            Password: <input type="password" name="password" placeholder="Enter password"/>
                            <input type="submit" value="Submit"/>
                        </div>
                    </f>
                </div>
            </div>
        </body>
    </html>
</f:view>
