package com.boot.shop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test1")
    public UserDto test(){
        UserDto userDto =  new UserDto();
        userDto.setAge(21);
        userDto.setName("Pants");

        return userDto;
    }
}
