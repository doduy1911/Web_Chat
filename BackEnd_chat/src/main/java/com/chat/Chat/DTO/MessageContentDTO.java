package com.chat.Chat.DTO;

import com.chat.Chat.Enum.MessageType;
import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MessageContentDTO {
    private UUID id;
    private String content;
    private LocalDateTime dataSent;
    private MessageType messageType;
    private UUID messageRoomId;
    private String sender;

}
