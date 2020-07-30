package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zzx
 * @version 1.0
 * @date 2020/7/21 16:47
 */
@Controller
public class IndexController {
//    @RequestMapping("/test")
//    public ModelAndView test(){
//        Map<String,String> result=new HashMap<>();
//        result.put("key","value");
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("index");
//        modelAndView.addObject("result",result);
//        return modelAndView;
//    }

    @RequestMapping("/test")
    @ResponseBody
    public String index(){
        return "success";
    }
}
