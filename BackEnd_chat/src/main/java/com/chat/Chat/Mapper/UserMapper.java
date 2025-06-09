package com.chat.Chat.Mapper;

import com.chat.Chat.DTO.UserDTO;
import com.chat.Chat.Entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {
    public UserDTO toDTO(final UserDTO userDTO , final User user) {
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setStatus(user.getStatus());
        userDTO.setAvatarUrl(user.getAvatarUrl());
        return userDTO;
    }

    public User toEntity(final UserDTO userDTO , final User user) {
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setStatus(userDTO.getStatus());
        user.setAvatarUrl(userDTO.getAvatarUrl());
        return user;
    }

}
