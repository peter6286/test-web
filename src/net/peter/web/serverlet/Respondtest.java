package net.peter.web.serverlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

@WebServlet("/Respondtest")
public class Respondtest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");

        //response.addHeader("name","java");
        //response.addHeader("name","python");
        //response.setHeader("age","18");
        //response.setStatus(1000);
        response.setHeader("Content-Type","text/html;charset=utf-8");
        String data = "今天天气挺好hey";

        //两种方法 字节输出和字符输出
        //OutputStream outputStream = response.getOutputStream();
        //byte [] bytes = data.getBytes("UTF-8");
        //outputStream.write(bytes);

        PrintWriter myprint = response.getWriter();
        myprint.write(data);
    }
}
