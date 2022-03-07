package com.example.pingpartner.controller;

import com.example.pingpartner.dto.UserDTO;
import com.example.pingpartner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void saveUser(@RequestBody UserDTO userDTO) {
        this.userService.saveUser(userDTO);
    }

    @GetMapping
    public List<UserDTO> findAllUsers() {
        return this.userService.findAllUser();
    }
}
