package com.epafra.nms.Filter;
import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.imageio.spi.ServiceRegistry;
import java.io.IOException;

//import javax.xml.crypto.dsig.spec.XPathType;
@Component
@Order(1)
public class MyFilter_1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 1 is called...");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
