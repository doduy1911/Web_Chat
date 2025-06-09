package com.chat.Chat.DAO;

import com.chat.Chat.Entity.MessageRoomMenber;
import com.chat.Chat.Entity.MessageroomMenberKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MessageRoomMemberReponsitory extends JpaRepository<MessageRoomMenber, MessageroomMenberKey> {
}
