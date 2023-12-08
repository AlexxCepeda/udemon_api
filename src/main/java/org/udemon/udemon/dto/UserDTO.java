package org.udemon.udemon.dto;


import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {

    private long id;
    private String name;
    private String username;
    private String email;
    private String password;
    private Date birthdate;
    private boolean premium;
}
