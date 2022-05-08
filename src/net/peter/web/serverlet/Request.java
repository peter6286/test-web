package net.peter.web.serverlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/request")
public class Request extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("getContextPath="+request.getContextPath());
        System.out.println("URL getRequestURL="+request.getRequestURL()) ;
        System.out.println(" getRequestURI="+request.getRequestURI());
        System.out.println(" getQueryString="+request.getQueryString());
        System.out.println(" getRemoteAddr="+request.getRemoteAddr()) ;
        System.out.println(" getRemotePort="+request.getRemotePort()) ;
        //获取请求头
        System.out.println(" getHeader(Accept)="+request.getHeader("Accept")) ;
        //获取请求参数
        System.out.println(" getParameter="+request.getParameter("userName"));
        String[] sport = request.getParameterValues("sport");
        System.out.println(" getParameterValues="+sport.toString());
        Map<String,String[]> map = request.getParameterMap();
        System.out.println(" getParameterMap="+map.toString());


    }
}
