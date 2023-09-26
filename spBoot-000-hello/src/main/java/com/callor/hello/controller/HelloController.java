package com.callor.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class HelloController {
    @RequestMapping(value="/",method= RequestMethod.GET)
    public String hello() {

        log.debug("여기는 Hello Controller 입니다");
        return "hello";

    }
}
