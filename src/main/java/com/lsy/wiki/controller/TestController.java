package com.lsy.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * GET, POST, PUT, DELETE
     *
     * /user?id=1
     * /user/1n
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
