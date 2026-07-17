package com.ompatil.projects.vynce.mapper;

import com.ompatil.projects.vynce.dto.auth.SignupRequest;
import com.ompatil.projects.vynce.dto.auth.UserProfileResponse;
import com.ompatil.projects.vynce.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);

}