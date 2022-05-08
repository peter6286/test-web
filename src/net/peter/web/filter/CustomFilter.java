package net.peter.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;


//@WebFilter(filterName ="xxx",urlPatterns = {"/*"},initParams = {
//        @WebInitParam(name="encoding",value = "UTF-8"),
//        @WebInitParam(name = "loginPage",value = "/login.jsp")
//},dispatcherTypes = {DispatcherType.REQUEST,DispatcherType.FORWARD})
public class CustomFilter implements Filter {

    private FilterConfig filterConfig;

    private  String encoding;

    private String loginPage;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CustomFilter init");
        this.filterConfig = filterConfig;

        String filterNmae = filterConfig.getFilterName();
        System.out.println("filterName="+filterNmae);

        this.encoding = filterConfig.getInitParameter("encoding");
        this.loginPage = filterConfig.getInitParameter("loginPage");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("CustomFilter doFilter");

        request.setCharacterEncoding(encoding);
        response.setCharacterEncoding(encoding);
        response.setContentType("text/html;charset=utf-8");
        //让请求继续往下
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("CustomFilter destroy");

    }
}
