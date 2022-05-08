package net.peter.web.serverlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/loginpage")
public class loginPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("we are forwarding the request");
        //req.setAttribute("name","peter");
        //req.getRequestDispatcher("/index.jsp").forward(req,resp);

        req.getRequestDispatcher("/WEB-INF/admin.jsp").forward(req,response);

    }
}