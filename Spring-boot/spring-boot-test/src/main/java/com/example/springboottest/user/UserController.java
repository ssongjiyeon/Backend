package com.example.springboottest.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }

    @PostMapping("/users")
    public @ResponseBody User test(@RequestBody User user) { // @ResponseBody 생략 가능, RestController을 사용했기때문
        return null;
    }

    @PostMapping("/users/create")
    public User create(@RequestBody User user) {
        return user;
    }
}
