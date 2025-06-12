package com.chat.Chat.Service.UserService;

import com.chat.Chat.DTO.User.RegisterDTO;
import com.chat.Chat.Entity.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {
    User addUser(RegisterDTO registerDTO);
}
