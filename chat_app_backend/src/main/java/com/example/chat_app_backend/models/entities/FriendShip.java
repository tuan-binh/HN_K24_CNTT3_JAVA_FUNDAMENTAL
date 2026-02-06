package com.example.chat_app_backend.models.entities;

import com.example.chat_app_backend.models.constants.FriendShipStatus;
import com.example.chat_app_backend.models.entities.composite_key.FriendShipId;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(schema = "friend", name = "friendships")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class FriendShip {

    @EmbeddedId
    private FriendShipId id;

    @MapsId("requesterId")
    @ManyToOne
    @JoinColumn(name = "requester_id")
    private User requester;

    @MapsId("addresseeId")
    @ManyToOne
    @JoinColumn(name = "addressee_id")
    private User addressee;

    @Enumerated(EnumType.STRING)
    private FriendShipStatus status;

    private LocalDateTime createdAt;
}
