package net.peter.web.serverlet;

import net.peter.web.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mocklogin")
public class mocklogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");

        if (name.equals("peter") && pwd.equals("123")){
            User user = new User();
            user.setName(name);
            user.setId(578);
            user.setHost("Rutgers.edu");
            req.getSession().setAttribute("usertable",user);

            req.getRequestDispatcher("/user/user.jsp").forward(req,resp);
        }
        else{
            req.setAttribute("wrong","wrong password");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
