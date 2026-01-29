<%-- 
    Document   : bootstrapREF
    Created on : Jan 25, 2026, 10:13:50 PM
    Author     : mottramkg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Bootstrap REF</title>
            <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.3.0/css/bootstrap.min.css">
        </head>
        <body>
            <div class="container-md border">
                <div class="row">
                    <div class="col-lg-12 col-sm-8">Col 1</div>
                    <div class="col-lg-8 col-sm-6">Col 2</div>
                    <div class="col-lg-4 col-sm-2">Col 3</div>
                    <div class="col-lg-12 col-sm-8">Col 4</div>
                </div>
            </div>
            <div class="container-md border">
            <div class="row justify-content-start">
              <div class="col-4">
                One of two columns
              </div>
              <div class="col-4">
                One of two columns
              </div>
            </div>
            <div class="row justify-content-center">
              <div class="col-4">
                One of two columns
              </div>
              <div class="col-4">
                One of two columns
              </div>
            </div>
            <div class="row justify-content-end">
              <div class="col-4">
                One of two columns
              </div>
              <div class="col-4">
                One of two columns
              </div>
            </div>
            <div class="row justify-content-around">
              <div class="col-4">
                One of two columns
              </div>
              <div class="col-4">
                One of two columns
              </div>
            </div>
            <div class="row justify-content-between">
              <div class="col-4">
                One of two columns
              </div>
              <div class="col-4">
                One of two columns
              </div>
            </div>
          </div>
        </body>
    </html>
</f:view>

        <style>
            [class*="col"]{
                padding: 1rem;
                background-color: #33b5e5;
                border: 2px solid #fff;
                color: #fff;
            }
        </style>