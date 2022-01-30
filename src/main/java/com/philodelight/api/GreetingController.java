package com.philodelight.api;

import com.philodelight.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    
    private static final String template = "hello %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value ="name", defaultValue = "world") String name){
        return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }
    
}
