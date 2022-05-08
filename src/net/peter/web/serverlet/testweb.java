package net.peter.web.serverlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "testweb",urlPatterns = {"/test"})
public class testweb extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<div> testweb get 的网站 </div>");

        ServletContext servletContext = req.getServletContext();
        String appInfo = (String)  servletContext.getAttribute("appinfo");
        System.out.println("appinfo="+appInfo);
    }
}
