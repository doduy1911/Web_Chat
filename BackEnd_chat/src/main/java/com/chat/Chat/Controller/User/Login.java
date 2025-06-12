package com.chat.Chat.Controller.User;

import com.chat.Chat.DTO.User.RegisterDTO;
import com.chat.Chat.DTO.User.UserDTO;
import com.chat.Chat.Service.UserService.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Login {
    private final UserService userService;

    public Login(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> addUser(@RequestBody RegisterDTO dto) {
        userService.addUser(dto);
        return ResponseEntity.ok("oke");
    }

}
