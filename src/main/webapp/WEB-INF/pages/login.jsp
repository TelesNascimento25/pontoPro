<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login pontoPro</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet">
 	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
</head>

<body>

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body p-5">

                        <div class="logo-container mb-4 <% if (request.getAttribute("mensagemErro") != null || request.getAttribute("mensagemSucesso") != null) { %>alert-space<% } %>">
                      <img src="${pageContext.request.contextPath}/resources/images/logo.jpg" alt="Logo pontoPro" class="mb-4" style="width: 100px; height: 100px; display: block; margin: auto;">
                        </div>
                        
                        <h2 class="card-title text-center mb-4">Login</h2>

						<div class="alert alert-danger text-center mt-2 <% if (request.getAttribute("mensagemErro") == null) { %>d-none<% } %> alert-space" role="alert">
                            <%= request.getAttribute("mensagemErro") %>
                        </div>

                        <div class="alert alert-success text-center mt-2 <% if (request.getAttribute("mensagemSucesso") == null) { %>d-none<% } %> alert-space" role="alert">
                            <%= request.getAttribute("mensagemSucesso") %>
                        </div>

                        <form id="loginForm" method="post" action="<%= request.getContextPath() %>/pontoPro/login">
                            <div class="mb-3">
                                <label for="username" class="form-label">Usuário:</label>
                                <input type="text" class="form-control" id="username" name="username" required>
                            </div>

                            <div class="mb-3">
                                <label for="password" class="form-label">Senha:</label>
                                <input type="password" class="form-control" id="password" name="password" required>
                            </div>

                            <div class="mb-3 form-check">
                                <input type="checkbox" class="form-check-input" id="rememberMe">
                                <label class="form-check-label" for="rememberMe">Lembrar-me</label>
                            </div>
                            <div class="d-grid">
                                <button type="submit" class="btn btn-primary">Entrar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
