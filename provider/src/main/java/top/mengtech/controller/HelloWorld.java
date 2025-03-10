package top.mengtech.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.mengtech.api.HelloWorldApi;

@RestController
@Slf4j
@RequestMapping("hello")
public class HelloWorld implements HelloWorldApi {

    @GetMapping("/test")
    public String helloTest(@RequestParam("username") String username){
        log.info("this is hello test:{}",username);
        if (username.length() == 2){
            throw new RuntimeException("名字长度为2");
        }
        return "hello " + username;
    }
}
