package com.epafra.nms.Filter;
import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

//import javax.xml.crypto.dsig.spec.XPathType;
@Component
@Order(2)
public class MyFilter__2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 2 is called...");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
