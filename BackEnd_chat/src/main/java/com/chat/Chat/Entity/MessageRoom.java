package com.chat.Chat.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "message_room")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class MessageRoom {
    @Id
    @GeneratedValue(generator = "UUID",strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private Boolean isGroup;

    @CreatedDate
    private LocalDateTime createDate;

    @ManyToOne
    @JoinColumn(name = "createdBy")
    private User createdBy;

    @OneToMany(mappedBy = "messageRoom" , cascade = CascadeType.ALL)
    private List<MessageRoomMember>  members;

    @OneToMany(mappedBy = "messageRoom" , cascade = CascadeType.ALL)
    private List<MessageContent> messageContents;


}
