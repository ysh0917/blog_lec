package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpControllerTest {
    @GetMapping("/http/get")
    public String getTest() {
        return "get 요청";
    }
    @GetMapping("/http/post")
    public String postTest() {
        return "post 요청";
    }
    @GetMapping("/http/put")
    public String putTest() {
        return "put 요청";
    }
    @GetMapping("/http/delete")
    public String deleteTest() {
        return "delete 요청";
    }
}
