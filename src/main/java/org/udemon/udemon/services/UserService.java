package org.udemon.udemon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.udemon.udemon.dto.CreateUserDTO;
import org.udemon.udemon.dto.UserDTO;
import org.udemon.udemon.mapper.UserMapper;
import org.udemon.udemon.models.User;
import org.udemon.udemon.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserMapper mapper;

    public List<UserDTO> findAll(){
        return repository.findAll().stream().map(mapper::toDTO).toList();
    }

    public UserDTO save(CreateUserDTO data){
        User entity = repository.save(mapper.toModel(data));
        return mapper.toDTO(entity);
    }
}
