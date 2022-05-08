package net.peter.web.serverlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session_servlet")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        //获取sessionid
        System.out.println("sessionid =" + session.getId());
        // 创建时间
        System.out.println("getCreationTime="+session.getCreationTime());
        // 是否初次创建
        System.out.println("isNew="+session.isNew());

        //往session中存东西
        session.setAttribute("var","session name");
    }
}
