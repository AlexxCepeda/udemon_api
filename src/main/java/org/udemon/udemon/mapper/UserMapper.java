package org.udemon.udemon.mapper;


import org.mapstruct.*;
import org.udemon.udemon.dto.CreateUserDTO;
import org.udemon.udemon.dto.UpdateUserDTO;
import org.udemon.udemon.dto.UserDTO;
import org.udemon.udemon.models.User;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {
    UserDTO toDTO(User model);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "premium", defaultValue = "false")
    User toModel(CreateUserDTO dto);

    @Mapping(target = "id", ignore = true)
    void update(@MappingTarget User user, UpdateUserDTO data);

}
