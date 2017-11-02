package org.xfs.core.platform.config.init;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public class SystemInit implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        Map<String, String> map = System.getenv();
        System.out.println("-------------begin init -------------------");
        String os = map.get("OS") == null ? "linux" : map.get("OS").toString();
        System.out.println("os is:" + os);

        //
    }
}
