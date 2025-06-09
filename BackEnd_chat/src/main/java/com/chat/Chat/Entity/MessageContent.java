package com.chat.Chat.Entity;

import com.chat.Chat.Enum.MessageType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "message_content")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class MessageContent {
    @Id
    @GeneratedValue(generator = "UUID" , strategy = GenerationType.AUTO)
    private UUID id;
    private String content;
    @CreatedDate
    private LocalDateTime dataSent;
    @Enumerated(EnumType.STRING)
    private MessageType messageType;

    @ManyToOne
    @JoinColumn(name = "message_room_id" )
    private MessageRoom messageRoom;

    @ManyToOne
    @JoinColumn(name = "username")
    private User user;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDataSent() {
        return dataSent;
    }

    public void setDataSent(LocalDateTime dataSent) {
        this.dataSent = dataSent;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public MessageRoom getMessageRoom() {
        return messageRoom;
    }

    public void setMessageRoom(MessageRoom messageRoom) {
        this.messageRoom = messageRoom;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
