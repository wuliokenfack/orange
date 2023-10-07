package com.user.service.controller;

import com.user.service.dto.UserRequestRecord;
import com.user.service.model.User;
import com.user.service.service.impl.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody UserRequestRecord userRequestRecord){
        return ResponseEntity.ok(userService.createUser(userRequestRecord));
    }
}
