package com.rujal.multitenent.controller;

import com.rujal.multitenent.dto.UserDto;
import com.rujal.multitenent.domain.UserDetail;
import com.rujal.multitenent.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserDto userDto){
        UserDetail userDetail = UserDetail.builder().email(userDto.getEmail())
                .password(userDto.getPassword())
                .enable(true)
                .username(userDto.getName())
                .name(userDto.getName())
                .build();
//        userDetail.setDataSourceConfig(userDto.getDataSourceConfig());
        userService.save(userDetail);
        return ResponseEntity.ok("Saved User");
    }

    @GetMapping
    public ResponseEntity<?> getUser(){
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

}
