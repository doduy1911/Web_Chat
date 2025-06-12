package com.chat.Chat.Controller.User;

import com.chat.Chat.DTO.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "${api.prefix}/users")
public class UserController {
//    @PostMapping
//    public ResponseEntity<UserDTO> login(@RequestBody final UserDTO userDTO){
//
//    }
}
