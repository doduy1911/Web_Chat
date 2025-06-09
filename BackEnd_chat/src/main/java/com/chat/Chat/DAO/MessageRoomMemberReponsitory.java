package com.chat.Chat.DAO;

import com.chat.Chat.Entity.MessageRoomMember;
import com.chat.Chat.Entity.MessageroomMenberKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRoomMemberReponsitory extends JpaRepository<MessageRoomMember, MessageroomMenberKey> {
}
