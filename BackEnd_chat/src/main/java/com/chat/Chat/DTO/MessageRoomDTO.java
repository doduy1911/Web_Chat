package com.chat.Chat.DTO;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MessageRoomDTO {
    private UUID id;
    private String name;
    private Boolean isGroup;
    private LocalDateTime createdDate;
    private UUID createdById;

}
