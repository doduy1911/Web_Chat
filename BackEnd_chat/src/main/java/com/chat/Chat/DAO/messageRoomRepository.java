package com.chat.Chat.DAO;

import com.chat.Chat.Entity.MessageRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface messageRoomRepository extends JpaRepository<MessageRoom, UUID> {
}
