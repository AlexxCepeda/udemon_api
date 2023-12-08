package org.udemon.udemon.mapper;


import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.udemon.udemon.dto.CreateUserDTO;
import org.udemon.udemon.dto.UserDTO;
import org.udemon.udemon.models.User;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper {
    UserDTO toDTO(User model);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "premium", defaultValue = "false")
    User toModel(CreateUserDTO dto);


}
