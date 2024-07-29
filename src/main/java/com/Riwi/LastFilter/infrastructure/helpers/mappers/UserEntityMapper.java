package com.Riwi.LastFilter.infrastructure.helpers.mappers;

import org.mapstruct.Mapper;

import com.Riwi.LastFilter.api.dto.response.UserEntityResponse;
import com.Riwi.LastFilter.domain.entities.UserEntity;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

    UserEntityResponse toEntityResponse(UserEntity userEntity);

}
