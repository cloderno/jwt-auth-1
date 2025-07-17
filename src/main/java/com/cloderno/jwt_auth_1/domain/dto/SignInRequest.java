package com.cloderno.jwt_auth_1.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "SignIn request")
public class SignInRequest {
    @Schema
    @NotBlank(message = "Username must not be empty")
    @Size(min = 5, max = 50, message = "Username must contain from 5 to 10 characters")
    private String username;

    @Schema
    @NotBlank(message = "Password must not be empty")
    @Size(min = 8, max = 255, message = "Password must contain from 8 to 255 characters")
    private String password;
}
