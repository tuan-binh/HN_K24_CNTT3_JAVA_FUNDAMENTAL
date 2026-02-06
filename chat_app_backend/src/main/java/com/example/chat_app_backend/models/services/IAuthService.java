package com.example.chat_app_backend.models.services;

import com.example.chat_app_backend.models.dto.req.LoginReq;
import com.example.chat_app_backend.models.dto.req.RegisterReq;
import com.example.chat_app_backend.models.dto.res.JwtRes;

public interface IAuthService {
    void register(RegisterReq req);

    JwtRes login(LoginReq req);
}
