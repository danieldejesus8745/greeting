package com.greeting.controllers;

import com.greeting.dto.UserDTO;
import com.greeting.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    private ResponseEntity<List<UserDTO>> getUsers() {
        List<UserDTO> usersDTO = userService.getUsers();
        return ResponseEntity.ok(usersDTO);
    }

}
