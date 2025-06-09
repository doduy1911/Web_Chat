package com.chat.Chat.Entity;

import com.chat.Chat.Enum.UserStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserStatus status;
    private LocalDateTime lastLogin = LocalDateTime.now();
    private String avatarUrl;
    @OneToMany(mappedBy = "createdBy")
    private List<MessageRoom> messagesRoom;

    @OneToMany(mappedBy = "user")
    private List<MessageRoomMenber> messagesRoomMembers;
}
