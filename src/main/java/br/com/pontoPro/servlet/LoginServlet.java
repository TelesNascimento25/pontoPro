package br.com.pontoPro.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pontoPro/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String USUARIO_PADRAO = "admin";
    private static final String SENHA_PADRAO = "admin123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (USUARIO_PADRAO.equals(username) && SENHA_PADRAO.equals(password)) {
            request.setAttribute("mensagemSucesso", "Login realizado com sucesso!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/login.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("mensagemErro", "Usuário ou senha incorretos");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/login.jsp");
            dispatcher.forward(request, response);
        }
    }
}

