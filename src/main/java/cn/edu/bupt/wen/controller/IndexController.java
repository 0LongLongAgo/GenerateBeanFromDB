package cn.edu.bupt.wen.controller;

import cn.edu.bupt.wen.model.UserExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){

        return "index";
    }
}