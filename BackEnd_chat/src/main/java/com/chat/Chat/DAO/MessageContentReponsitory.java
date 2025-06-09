package com.chat.Chat.DAO;

import com.chat.Chat.Entity.MessageContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface MessageContentReponsitory extends JpaRepository<MessageContent , UUID> {
}
