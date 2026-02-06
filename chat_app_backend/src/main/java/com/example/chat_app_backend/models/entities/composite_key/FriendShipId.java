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
public class FriendShipId implements Serializable {
    private Long requesterId;
    private Long addresseeId;
}
