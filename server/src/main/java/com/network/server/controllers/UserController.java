package com.network.server.controllers;

import com.network.server.dtos.UserCreateDto;
import com.network.server.dtos.UserDto;
import com.network.server.entities.User;
import com.network.server.services.UserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/network")
@CrossOrigin
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public UserDto getOneUser(@PathVariable("id") int id) {
        User user = userService.getOneUser(id).orElseThrow();
        return new UserDto(user.getFirstName(), user.getLastName());
    }

    @PostMapping("/register")
    public void createUser(@RequestBody @Valid UserCreateDto userCreateDto) {
        userService.createUser(userCreateDto);
    }

}
