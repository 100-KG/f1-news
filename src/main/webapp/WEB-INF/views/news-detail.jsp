<%-- 
    Document   : news-detail
    Created on : Jan 24, 2026, 8:55:31 PM
    Author     : mottramkg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>${title}</title>
            <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.3.0/css/bootstrap.min.css">
        </head>
        <body>
            <div class="container mt-5">
                <h1>${title}</h1>
                <div class="description-n-date">
                    <h3>${description}</h3>
                    <h5>${dayCreated} -  ${author}</h3>
                </div>
                <div class="content-paras">
                    <p>${content}</p>
                </div>
            </div>
        </body>
    </html>
</f:view>
