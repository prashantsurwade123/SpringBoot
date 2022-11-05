package com.circuitBreakerDemo.circuitBreaker;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {

    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "fallBackMethod")
    public String greeting(){

        String s = null;
        s.length();
        return "Hello";
    }

    public String fallBackMethod(){
        return  "fall back method";
    }
}
