package com.chat.Chat.Mapper;

import com.chat.Chat.DTO.MessageRoomDTO;
import com.chat.Chat.Entity.MessageRoom;
import com.chat.Chat.Entity.User;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageRoomMapper {
    private final com.chat.Chat.DAO.userRepository userRepository;

    public MessageRoomDTO toDTO(final MessageRoom messageRoom, final MessageRoomDTO messageRoomDTO) {
        messageRoomDTO.setId(messageRoom.getId());
        messageRoomDTO.setName(messageRoom.getName());
        messageRoomDTO.setIsGroup(messageRoom.getIsGroup());
        messageRoomDTO.setCreatedDate(messageRoom.getCreateDate());
        messageRoomDTO.setCreatedById(messageRoom.getCreatedBy().getUsername());
        return messageRoomDTO;
    }


    public MessageRoom toEntity(final MessageRoomDTO messageRoomDTO, final MessageRoom messageRoom) {
        messageRoom.setId(messageRoomDTO.getId());
        messageRoom.setName(messageRoomDTO.getName());
        messageRoom.setIsGroup(messageRoomDTO.getIsGroup());
        messageRoom.setCreateDate(messageRoomDTO.getCreatedDate());
        final User createdBy = messageRoomDTO.getCreatedById() == null ? null : userRepository.findById(messageRoomDTO.getCreatedById())
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        messageRoom.setCreatedBy(createdBy);
        return messageRoom;
    }
}
