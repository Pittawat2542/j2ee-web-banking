<%-- 
    Document   : index
    Created on : Apr 11, 2019, 12:16:55 PM
    Author     : pittawat.pete
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="components/header.jsp"%>

<main role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <div class="container text-center">
            <img class="d-block mx-auto mb-3" src="assets/img/main.png">
            <p class="lead">Bank! is the most innovative banking experience that you never seen before. We will bring you into the new world of financial management with effortless as everything will be at your fingertips.</p>
            <p><a class="btn btn-primary btn-lg" href="${request.getAttribute("javax.servlet.forward.request_uri")}register.jsp" role="button">Register Now!</a></p>
        </div>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <img class="img-fluid" src="assets/img/feature1.png">
            </div>
            <div class="col-md-6">
                <h2 class="mb-3">Saving Account</h2>
                <p>We only provide you a saving account as we believe in minimal
                    ism. So, you do not need to break through the clutter to or 
                    other complex things. Only the saving account will serve you 
                    the best!</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut 
                    lacus eros, malesuada sed aliquet nec, tincidunt et enim. 
                    Pellentesque euismod augue sem. Integer sit amet bibendum 
                    sapien. Aliquam malesuada ligula vitae nibh pellentesque, 
                    in fermentum ligula ultricies. Aliquam et est tellus. Cras a
                    est quis lorem pellentesque bibendum. Nullam porta lobortis 
                    lectus a faucibus.</p>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <h2 class="mb-3">Everything on the cloud!</h2>
                <p>Some word explain about the bank that we are the great. We are 
                the best. We are number one in the world!</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut 
                    lacus eros, malesuada sed aliquet nec, tincidunt et enim. 
                    Pellentesque euismod augue sem. Integer sit amet bibendum 
                    sapien. Aliquam malesuada ligula vitae nibh pellentesque, 
                    in fermentum ligula ultricies. Aliquam et est tellus. Cras a
                    est quis lorem pellentesque bibendum. Nullam porta lobortis 
                    lectus a faucibus.</p>
            </div>
            <div class="col-md-6"><img class="img-fluid" src="assets/img/feature2.png"></div>
        </div>
        <div class="row bg-warning mt-5 mb-5 p-5 text-center">
            <div class="col-md-4"><img class="img-fluid mb-3" style="width: 50%" src="assets/img/1.png"><h3>First Function</h3><p>Some description Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p></div>
            <div class="col-md-4"><img class="img-fluid mb-3" style="width: 50%" src="assets/img/2.png"><h3>Second Function</h3><p>Some description Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p></div>
            <div class="col-md-4"><img class="img-fluid mb-3" style="width: 50%" src="assets/img/3.png"><h3>Third Function</h3><p>Some description Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p></div>
        </div>

    </div> <!-- /container -->

</main>

<%@include file="components/footer.jsp"%>