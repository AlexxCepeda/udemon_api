package org.udemon.udemon.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
public class CreateUserDTO {
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Username is required")
    @Size(min = 8, message = "Username should have at least 8 characters")
    private String username;
    @NotBlank(message = "Email is required")
    @Email(message = "Unvalid email")
    private String email;
    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;
    @Past(message = "Unvalid birthdate")
    private Date birthdate;
    private boolean premium;
}
