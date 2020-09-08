package com.kukespace.sample.actuator.endpoint;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author chensk
 * @date 2020/8/25
 */
public class CustomServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
