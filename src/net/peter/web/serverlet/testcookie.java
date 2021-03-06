package net.peter.web.serverlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="cookieServlet",urlPatterns = {"/get_cookie_test"})
public class testcookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies){
            System.out.println(cookie.getDomain());
            System.out.println(cookie.getName());
            System.out.println(cookie.getValue());
        }
    }
}

