package xyz.ak81.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: helloworld
 * @description:
 * @author: Mr.Liao
 * @create: 2020-02-14 22:45
 **/
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
}
