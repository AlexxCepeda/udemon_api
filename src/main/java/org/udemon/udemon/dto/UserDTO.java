package org.udemon.udemon.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {

    @Schema(description = "Identificador del usuario", example = "20")
    private long id;

    @Schema(description = "Nombre del usuario", example = "John Doe")
    private String name;

    @Schema(description = "Nombre personalizado del usuario", example = "JohnDoe")
    private String username;
    @Schema(description = "Email del usuario", example = "johndoe@correo.com")
    private String email;
//    private String password;
    @Schema(description = "Fecha de nacimiento del usuario", example = "1999/12/12")
    private Date birthdate;

    @Schema(description = "Estado del usuario premium", example = "false")
    private boolean premium;
}
