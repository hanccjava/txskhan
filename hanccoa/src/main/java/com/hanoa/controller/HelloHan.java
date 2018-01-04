package com.hanoa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by txsk on 2018/1/4.
 */
@RestController
public class HelloHan {
    @RequestMapping(value = "login" ,method = RequestMethod.GET)
    public String loginSay(){
        return "欢迎加入韩氏控股集团";
    }
}
