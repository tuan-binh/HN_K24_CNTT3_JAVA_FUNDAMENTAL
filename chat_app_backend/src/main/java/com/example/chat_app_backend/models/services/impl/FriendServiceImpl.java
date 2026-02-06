package com.example.chat_app_backend.models.services.impl;

import com.example.chat_app_backend.models.repositories.IFriendShipRepository;
import com.example.chat_app_backend.models.services.IFriendService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FriendServiceImpl implements IFriendService {
    private final IFriendShipRepository friendShipRepository;
}
