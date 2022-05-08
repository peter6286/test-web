package net.peter.web.serverlet;

import net.peter.web.domain.Config;
import net.peter.web.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/Forward")
public class webforward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("we are forwarding the request");
        Config config = (Config) req.getServletContext().getAttribute("config");
        System.out.println(config.getTopic());


        User user = new User();
        user.setHost("rutgers.edu");
        user.setId(578);
        user.setName("shuorong");
        req.setAttribute("user",user);
        //req.getRequestDispatcher("/index.jsp").forward(req,resp);
        //请求内部的
        response.sendRedirect("/index.jsp");
        //请求外部的，一定要加上http的前缀
        //response.sendRedirect("http://Google.com");
    }
}
