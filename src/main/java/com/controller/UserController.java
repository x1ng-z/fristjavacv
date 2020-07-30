package com.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzx
 * @version 1.0
 * @date 2020/7/28 15:34
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/insertuser")
    public String insertuser(){
        User user=new User();
        user.setUsename("admin");
        user.setPassword("123456");

        userService.insertuse(user);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("pkuse",user.getPkuse());
        return jsonObject.toJSONString();
    }


    @RequestMapping("/finduser/{pkuse}")
    public String finduser(@PathVariable("pkuse") int id){
        User user=userService.finduser(id);

//        JSONObject jsonObject=JSONObject.toJSON(user);

//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("pkuse",user.getPkuse());
//        jsonObject.put("password",user.getPassword());
//        jsonObject.put("usename",user.getUsename());
        return JSON.toJSONString(user);
    }


    @RequestMapping("/deleteuser/{pkuse}")
    public String deleteuser(@PathVariable("pkuse") int id){
        userService.deleteuse(id);
        return "success";
    }



}
