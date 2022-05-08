package net.peter.web.listener;


import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class RequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("结束");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("开始");
        Integer totalVisit = (Integer)sre.getServletContext().getAttribute("totalVisit");
        System.out.println("历史访问次数"+totalVisit);
        totalVisit++;
        sre.getServletContext().setAttribute("totalVisit",totalVisit);

    }
}