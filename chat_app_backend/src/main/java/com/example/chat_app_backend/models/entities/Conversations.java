package com.example.chat_app_backend.models.entities;

import com.example.chat_app_backend.models.constants.ConversationType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(schema = "room",name = "conversations")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Conversations {
    @Id
    @Column(name = "conversation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ConversationType type;

    private String name;

    private LocalDateTime createdAt;
}
