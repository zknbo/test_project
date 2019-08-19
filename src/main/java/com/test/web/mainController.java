package com.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaye.zhang
 * @PackName com.test.web
 * @Description mainController
 * @createdate 2019-08-19 18:59
 */
@RestController
@RequestMapping("/Main")
public class mainController {

    @GetMapping("/")
    public String helloWorld(){
        return "hello world";
    }
}
