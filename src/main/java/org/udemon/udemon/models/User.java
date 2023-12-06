package org.udemon.udemon.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 45, nullable = false)
    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Username is required")
    @Column(length = 20, nullable = false, unique = true)
    private String username;

    @NotBlank(message = "Email is required and valid")
    @Email(message = "Email is required and valid")
    @Column(unique = true)
    private String email;

    @Column
    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password should have at least 8 characters")
    private String password;

    @Column
    @Temporal(TemporalType.DATE)
    @Past
    private Date birthdate;

    @Column
    private boolean premium;

}
