package net.peter.web.serverlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//@WebServlet(value = "/Userweb")
//@WebServlet(name = "Userweb",urlPatterns = {"/user2","/user3"})
@WebServlet(name = "Userweb",urlPatterns = {"/peteruser/login"})
public class Userweb extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");

        resp.setContentType("text/html;charset=utf-8");

        if (username.equals("peter")&& pwd.equals("123")){
            resp.getWriter().write("success");
        }else{
            resp.getWriter().write("fail");
        }
    }
}
