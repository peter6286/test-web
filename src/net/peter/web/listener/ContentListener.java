package net.peter.web.listener;

import net.peter.web.domain.Config;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContentListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Listner Initialized");
        ServletContext servletContext = sce.getServletContext();
        String url = servletContext.getInitParameter("url");
        String  topic = servletContext.getInitParameter("topic");

        Config config = new Config();
        config.setTopic(topic);
        config.setUrl(url);

        servletContext.setAttribute("config",config);

        servletContext.setAttribute("onlineNum",0);

        servletContext.setAttribute("totalVisit",0);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Listner destroyed");

    }
}
