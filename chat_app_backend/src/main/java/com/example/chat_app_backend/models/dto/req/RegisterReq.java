package com.example.chat_app_backend.models.dto.req;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RegisterReq {
    @NotBlank(message = "fullName can't be not empty")
    private String fullName;
    @NotBlank(message = "username can't be not empty")
    private String username;
    @NotBlank(message = "password can't be not empty")
    private String password;
}
