package com.chat.Chat.Mapper;

import com.chat.Chat.DAO.MessageRoomReponsitory;
import com.chat.Chat.DAO.UserReponsitory;
import com.chat.Chat.DTO.MessageContentDTO;
import com.chat.Chat.Entity.MessageContent;
import com.chat.Chat.Entity.MessageRoom;
import com.chat.Chat.Entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageContentMapper {
    private final MessageRoomReponsitory messageRoomReponsitory;
    private final UserReponsitory userReponsitory;

    public MessageContentDTO toDTO(final MessageContent messageContent, final MessageContentDTO messageContentDTO) {
        messageContentDTO.setId(messageContent.getId());
        messageContentDTO.setContent(messageContent.getContent());
        messageContentDTO.setDataSent(messageContent.getDataSent());
        messageContentDTO.setMessageType(messageContent.getMessageType());
        messageContentDTO.setMessageRoomId(messageContent.getMessageRoom().getId());
        messageContentDTO.setSender(messageContent.getUser().getUsername());
        return messageContentDTO;
    }
    public MessageContent toEntity(final MessageContentDTO messageContentDTO , final MessageContent messageContent) {
        messageContent.setId(messageContentDTO.getId());
        messageContent.setContent(messageContentDTO.getContent());
        messageContent.setDataSent(messageContentDTO.getDataSent());
        messageContent.setMessageType(messageContentDTO.getMessageType());
        final MessageRoom messageRoom = messageContentDTO.getMessageRoomId() == null ? null : messageRoomReponsitory.findById(messageContentDTO.getMessageRoomId()).orElseThrow(() -> new RuntimeException("MessageRoom not found"));
        messageContent.setMessageRoom(messageRoom);
        final User user = messageContentDTO.getSender() == null ? null :userReponsitory.findById(messageContentDTO.getSender()).orElseThrow(() -> new RuntimeException("User not found"));
        messageContent.setUser(user);
        return messageContent;
    }
}
