package com.example.chat_app_backend.models.services.impl;

import com.example.chat_app_backend.exceptions.HttpBadRequest;
import com.example.chat_app_backend.models.dto.req.LoginReq;
import com.example.chat_app_backend.models.dto.req.RegisterReq;
import com.example.chat_app_backend.models.dto.res.JwtRes;
import com.example.chat_app_backend.models.entities.User;
import com.example.chat_app_backend.models.repositories.IUserRepository;
import com.example.chat_app_backend.models.services.IAuthService;
import com.example.chat_app_backend.security.jwts.JwtService;
import com.example.chat_app_backend.security.principals.MyUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements IAuthService
{
    private final IUserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    @Override
    public void register(RegisterReq req)
    {
        User user = User.builder()
                .fullName(req.getFullName())
                .username(req.getUsername())
                .password(passwordEncoder.encode(req.getPassword()))
                .build();
        userRepository.save(user);
    }

    @Override
    public JwtRes login(LoginReq req)
    {
        Authentication authentication;
        try
        {
            authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword()));
        }
        catch (AuthenticationException e)
        {
            throw new HttpBadRequest("Username or password is incorrect");
        }

        MyUserDetails userDetails = (MyUserDetails) authentication.getPrincipal();

        return JwtRes.builder()
                .accessToken(jwtService.generateToken(userDetails.getUsername()))
                .build();
    }


}