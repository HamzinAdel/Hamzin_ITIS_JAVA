<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">

    <link href="/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="/js/bootstrap.min.js"></script>

</head>
<body>
<nav class="navbar navbar-toggleable-md navbar-inverse bg-inverse">
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
            data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false"
            aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="#">Navbar</a>

    <div class="collapse navbar-collapse">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login">Login</a>
            </li>
        </ul>

<#if isAuthenticated == true>
        <form action="/logout" class="form-inline my-2 my-md-0">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Logout</button>
        </form>
</#if>

    </div>
</nav>

</body>
</html>
