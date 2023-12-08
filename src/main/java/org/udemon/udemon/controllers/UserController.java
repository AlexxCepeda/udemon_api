package org.udemon.udemon.controllers;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.udemon.udemon.dto.CreateUserDTO;
import org.udemon.udemon.dto.UserDTO;
import org.udemon.udemon.services.UserService;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserDTO> findAll(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO save(@Valid @RequestBody CreateUserDTO data){
        return service.save(data);
    }
}
