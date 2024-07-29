package com.Riwi.LastFilter.infrastructure.abstract_services;

import com.Riwi.LastFilter.api.dto.request.UserRequest;
import com.Riwi.LastFilter.api.dto.response.UserResponse;
import com.Riwi.LastFilter.infrastructure.abstract_services.HTTPGenerics.Create;

public interface IUserService extends Create<UserRequest, UserResponse>{
  
}
