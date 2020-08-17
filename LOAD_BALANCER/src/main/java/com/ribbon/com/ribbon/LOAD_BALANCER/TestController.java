package com.ribbon.com.ribbon.LOAD_BALANCER;

import com.ribbon.com.ribbon.LOAD_BALANCER.config.FiegnClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
@RequestMapping("/load")
public class TestController {
    @Autowired
    FiegnClass fiegnClass;

    @GetMapping("/test")
    public String returnTest() {
        return fiegnClass.returnMessage();
    }
}
