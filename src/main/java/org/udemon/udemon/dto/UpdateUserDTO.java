package org.udemon.udemon.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
public class UpdateUserDTO {
    private String name;
    @Size(min = 8, message = "Username should have at least 8 characters")
    private String username;
    @Email(message = "Unvalid email")
    private String email;
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;
    @Past(message = "Unvalid birthdate")
    private Date birthdate;
    private boolean premium;
}
