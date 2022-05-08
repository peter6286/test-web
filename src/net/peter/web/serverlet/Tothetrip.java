package net.peter.web.serverlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Tothetrip",urlPatterns = {"/trip1","/trip2"})
public class Tothetrip extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<div> 我要去伦敦 </div>");

        ServletContext servletContext = req.getServletContext();
        String url = servletContext.getInitParameter("England");
        System.out.println(url);

        servletContext.setAttribute("appinfo","emma");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<div> peter 从伦敦回来的</div>");
    }


    public void destroy() {
        System.out.println("Serverlet结束了");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Serverlet开始了");
    }

}
