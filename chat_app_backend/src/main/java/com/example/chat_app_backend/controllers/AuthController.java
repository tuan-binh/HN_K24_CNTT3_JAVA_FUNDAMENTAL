package com.example.chat_app_backend.controllers;

import com.example.chat_app_backend.models.dto.req.LoginReq;
import com.example.chat_app_backend.models.dto.req.RegisterReq;
import com.example.chat_app_backend.models.dto.wrapper.DataRes;
import com.example.chat_app_backend.models.services.IAuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController
{
    private final IAuthService authService;

    /**
     * @param req LoginReq
     * @apiNote handle login with { username , password }
     */
    @PostMapping("/login")
    public ResponseEntity<?> handleLogin(@Valid @RequestBody LoginReq req)
    {
        return ResponseEntity.ok().body(
                DataRes.builder()
                        .status(HttpStatus.OK)
                        .code(200)
                        .data(authService.login(req))
                        .build()
        );
    }

    /**
     * @param req FormRegister
     * @apiNote handle register with { fullName , username , password }
     */
    @PostMapping("/register")
    public ResponseEntity<?> handleRegister(@Valid @RequestBody RegisterReq req)
    {
        authService.register(req);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                DataRes.builder()
                        .status(HttpStatus.CREATED)
                        .code(201)
                        .data("Register successfully")
                        .build()
        );
    }

}