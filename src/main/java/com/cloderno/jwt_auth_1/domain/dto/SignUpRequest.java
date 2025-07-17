package com.cloderno.jwt_auth_1.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "SignUp request")
public class SignUpRequest {
    @Schema(description = "Username", example = "Example")
    @Size(min = 5, max = 50, message = "Username must contain from 5 to 50 characters")
    @NotBlank(message = "Username must not be empty")
    private String username;

    @Schema(description = "Email address", example = "example@gmail.com")
    @Size(min = 5, max = 255, message = "Email address must contain from 5 to 255 characters")
    @NotBlank(message = "Email must not be empty")
    @Email(message = "Email address must be in the format user@example.com")
    private String email;

    @NotBlank(message = "Password must not be empty")
    @Size(max = 255, message = "Password length must not exceed 255 characters")
    private String password;
}