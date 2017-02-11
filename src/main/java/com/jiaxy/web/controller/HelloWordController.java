package com.jiaxy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Title: <br>
 * <p>
 * Description: <br>
 * <p>
 * </p>
 * <br>
 *
 * @author <a href=mailto:taobaorun@gmail.com>taobaorun</a>
 *         <br>
 * @since 2017/1/14 23:44
 */
@Controller
@RequestMapping("/hello")
public class HelloWordController {


    @RequestMapping
    public String helloWord() {
        return "index";
    }

}
