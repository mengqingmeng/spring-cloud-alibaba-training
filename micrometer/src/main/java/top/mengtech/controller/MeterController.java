package top.mengtech.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.mengtech.api.HelloWorldApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("meter")
public class MeterController {
    private final HelloWorldApi helloWorldApi;

    public MeterController(HelloWorldApi helloWorldApi) {
        this.helloWorldApi = helloWorldApi;
    }

    @GetMapping("/helloTest")
    public String hello(@RequestParam("username") String username){
        String response = helloWorldApi.helloTest(username);
        log.info("hello world api response:{}",response);
        return response;
    }

    @GetMapping("/hello2")
    @ResponseBody
    public List<String> hello2(@RequestParam("hello") String hello){

        List<String> res = new ArrayList<>();
        res.add("test1");
        res.add("test2");
        res.add(hello);
        return res;
    }
}
