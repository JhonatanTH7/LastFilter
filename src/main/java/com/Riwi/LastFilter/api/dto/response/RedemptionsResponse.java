package com.Riwi.LastFilter.api.dto.response;

import com.Riwi.LastFilter.api.dto.response.basic.RedemptionsBasicResponse;
import com.Riwi.LastFilter.api.dto.response.basic.UserBasicResponse;
import com.Riwi.LastFilter.domain.entities.UserEntity;

public class RedemptionsResponse extends RedemptionsBasicResponse{
    private UserBasicResponse user;
}
