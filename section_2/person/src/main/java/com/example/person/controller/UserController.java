package com.example.person.controller;

import com.example.person.model.dto.request.UserRequestDto;
import com.example.person.model.entity.User;
import com.example.person.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final IUserService userService;

    @PostMapping("/save")
    public ResponseEntity<String> saveUser(@RequestBody UserRequestDto userRequestDto){
        String response = userService.saveUser(userRequestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/all")
    public List<User> allUsers(){
        return userService.getAllUser();
    }



}
