package org.udemon.udemon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.udemon.udemon.dto.CreateUserDTO;
import org.udemon.udemon.dto.UpdateUserDTO;
import org.udemon.udemon.dto.UserDTO;
import org.udemon.udemon.exceptions.UserNotFoundException;
import org.udemon.udemon.mapper.UserMapper;
import org.udemon.udemon.models.User;
import org.udemon.udemon.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserMapper mapper;

    public List<UserDTO> findAll(){
        return repository.findAll().stream().map(mapper::toDTO).toList();
    }

    public UserDTO findById(long id) throws UserNotFoundException {
        Optional<User> result = repository.findById(id);
        if (!result.isPresent()) {
            throw new UserNotFoundException(id);
        }
        User user = result.get();
        return mapper.toDTO(user);
    }

    public UserDTO save(CreateUserDTO data){
        User entity = repository.save(mapper.toModel(data));
        return mapper.toDTO(entity);
    }

    public void update(long id, UpdateUserDTO data) throws UserNotFoundException {
        Optional<User> result = repository.findById(id);

        if (!result.isPresent()) {
            throw new UserNotFoundException(id);
        }
        User user = result.get();

        // Aplicar los cambios al user
        mapper.update(user, data);

        repository.save(user);
    }

    public void delete(long id) throws UserNotFoundException{
        Optional<User> result = repository.findById(id);
        if (!result.isPresent()) {
            throw new UserNotFoundException(id);
        }
        repository.deleteById(id);
    }
}
