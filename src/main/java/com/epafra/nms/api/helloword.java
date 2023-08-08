package com.epafra.nms.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloword{
    @RequestMapping(value="/hello")
    public String sayHello(){

        return "hello guys";
    }
}
