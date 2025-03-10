package top.mengtech.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "provider")
public interface HelloWorldApi {

    @GetMapping("hello/test")
    String helloTest(@RequestParam("username") String username);
}
