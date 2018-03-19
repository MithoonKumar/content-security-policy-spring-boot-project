package com.example.contentsecuritypolicy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class controller {
    @RequestMapping(method = RequestMethod.GET, value = "/index")
    public String method (HttpServletResponse response) {
        response.setHeader("Content-Security-Policy", "default-src 'self' https://cdn.ravenjs.com/");
        return "index";
    }
}
