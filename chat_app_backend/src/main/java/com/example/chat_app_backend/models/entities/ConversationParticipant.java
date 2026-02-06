package com.example.chat_app_backend.models.entities;

import com.example.chat_app_backend.models.constants.ParticipantRole;
import com.example.chat_app_backend.models.entities.composite_key.ConversationParticipantId;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(schema = "friend", name = "conversation_participants")
public class ConversationParticipant {
    @EmbeddedId
    private ConversationParticipantId id;

    @MapsId("conversationId")
    @ManyToOne
    @JoinColumn(name = "conversation_id")
    private Conversations conversations;

    @MapsId("userId")
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private ParticipantRole role;

    private LocalDateTime joinedAt;

}
