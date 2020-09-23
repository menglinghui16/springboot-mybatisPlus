package com.tankehui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: menglh
 * @Description:
 * @Date: 2020/9/23 22:04
 */
@Controller
public class TestController {
    @RequestMapping("/hello")
    public String myhome(HttpServletResponse res, HttpSession session) throws IOException {
        System.out.println("spring  boot springMvc 马克-to-win!");
        session.setAttribute("user","马克-to-win 马克java社区创始人");
        return "result";
        /*下列不能再用了，在Thymeleaf框架中，sendRedirect不能跳到templates目录里的html*/
        //    res.sendRedirect("result.html");
    }




}
