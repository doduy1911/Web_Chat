package com.chat.Chat.Service.UserService;


import com.chat.Chat.DTO.User.RegisterDTO;
import com.chat.Chat.Entity.User;
import com.chat.Chat.Reponsitory.User.UserReponsitory;
import org.apache.catalina.mapper.Mapper;
import org.aspectj.bridge.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserServiceImpl implements UserService {
    private final UserReponsitory userReponsitory;
    public UserServiceImpl(UserReponsitory userReponsitory) {
        this.userReponsitory = userReponsitory;
    }

    @Override
    public User addUser(RegisterDTO dto){
        if (userReponsitory.existsByUsername(dto.getUsername())){
            throw  new ResponseStatusException(HttpStatus.BAD_REQUEST,"Tai Khoan Da Ton Tai");
        }
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        User u = userReponsitory.save(user);
        return user;


    }


}
