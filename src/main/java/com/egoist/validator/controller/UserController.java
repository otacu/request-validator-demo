package com.egoist.validator.controller;

import com.egoist.validator.request.UserAddRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {
    @PostMapping("user/add")
    public void addUser(@Validated @RequestBody UserAddRequest request) {
        int i = 1/0;
        log.info(request.toString());
    }
}
