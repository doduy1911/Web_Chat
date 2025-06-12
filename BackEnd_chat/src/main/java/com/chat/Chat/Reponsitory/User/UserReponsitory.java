package com.chat.Chat.Reponsitory.User;

import com.chat.Chat.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReponsitory extends JpaRepository<User,String> {
    boolean existsByUsername(String username);
}
