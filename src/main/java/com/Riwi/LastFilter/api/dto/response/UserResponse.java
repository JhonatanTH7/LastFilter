package com.Riwi.LastFilter.api.dto.response;

import java.util.List;

import com.Riwi.LastFilter.api.dto.response.basic.UserBasicResponse;
import com.Riwi.LastFilter.domain.entities.RedemptionEntity;

public class UserResponse extends UserBasicResponse{
    private List<RedemptionEntity> redemptions;
}
