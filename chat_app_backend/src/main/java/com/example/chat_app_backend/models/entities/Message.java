package com.example.chat_app_backend.models.entities;

import com.example.chat_app_backend.models.constants.MessageType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(schema = "room", name = "message")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Message {
    @Id
    @Column(name = "message_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "conversation_id")
    private Conversations conversations;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    private String content;

    private MessageType type;

    private LocalDateTime createdAt;
}
