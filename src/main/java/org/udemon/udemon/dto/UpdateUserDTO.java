package org.udemon.udemon.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
public class UpdateUserDTO {
    @Schema(description = "Nombre del usuario", example = "John Doe Actualizado")
    private String name;

    @Schema(description = "Username del usuario", example = "newjohndoe")
    @Size(min = 8, message = "Username should have at least 8 characters")
    private String username;

    @Schema(description = "Email del usuario", example = "johnnuevo@correo.com")
    @Email(message = "Unvalid email")
    private String email;
    @Schema(description = "Contraseña del usuario", example = "newpassword")
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;
    @Schema(description = "Fecha de nacimiento del usuario", example = "1998/12/12")
    @Past(message = "Unvalid birthdate")
    private Date birthdate;

    @Schema(description = "Status premium del usuario", example = "true")
    private boolean premium;
}
