package com.example.chat_app_backend.models.services;

import com.example.chat_app_backend.models.entities.FriendShip;

public interface IFriendService {

    FriendShip requestFriendShip(Long friendId);

    FriendShip acceptFriendShip(Long friendId);

    FriendShip cancelFriendShip(Long friendId);

}
