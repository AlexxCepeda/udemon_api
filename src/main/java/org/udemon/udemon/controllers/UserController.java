package org.udemon.udemon.controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.udemon.udemon.dto.CreateUserDTO;
import org.udemon.udemon.dto.UpdateUserDTO;
import org.udemon.udemon.dto.UserDTO;
import org.udemon.udemon.services.UserService;

import java.util.List;

@Tag(name = "Endpoints para usuarios", description = "CRUD para usuarios")
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService service;

    @Operation(summary = "Obtiene toda la lista de usuarios disponibles")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserDTO> findAll(){
        return service.findAll();
    }

    @Operation(summary = "Obtiene un usuario dado por un ID")
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO findById(@PathVariable long id) throws Exception {
        return service.findById(id);
    }

    @Operation(summary = "Crea un nuevo usuario")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO save(@Valid @RequestBody CreateUserDTO data){
        return service.save(data);
    }


    @Operation(summary = "TODAVIA EN DESARROLLO. Actualiza parcialmente un usuario")
    @PatchMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateById(@PathVariable long id, @Valid @RequestBody UpdateUserDTO data) throws Exception {
        service.update(id,data);
    };

    @Operation(summary = "Elimina un usuario a tráves del ID")
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable long id) throws Exception{
        service.delete(id);
    }


}
