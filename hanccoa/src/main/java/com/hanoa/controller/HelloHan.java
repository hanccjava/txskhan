package com.hanoa.controller;

import com.hanoa.controller.dao.vo.LeaderProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by hpy on 2018/1/4.
 */

@RestController
public class HelloHan {
    @Resource
    private LeaderProperties leaderProperties;
    @RequestMapping(value = "login" ,method = RequestMethod.GET)
    public String loginSay(){
        return "欢迎加入韩氏控股集团" ;
    }
}
