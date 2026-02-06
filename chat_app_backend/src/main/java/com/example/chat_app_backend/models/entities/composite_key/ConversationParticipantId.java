package com.example.chat_app_backend.models.entities.composite_key;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ConversationParticipantId implements Serializable {
    private Long conversationId;
    private Long userId;
}
