package com.Riwi.LastFilter.infrastructure.abstract_services;

import com.Riwi.LastFilter.api.dto.request.CouponRequest;
import com.Riwi.LastFilter.api.dto.response.CouponsResponse;
import com.Riwi.LastFilter.infrastructure.abstract_services.HTTPGenerics.Create;
import com.Riwi.LastFilter.infrastructure.abstract_services.HTTPGenerics.Delete;
import com.Riwi.LastFilter.infrastructure.abstract_services.HTTPGenerics.Update;

public interface ICouponService extends Create<CouponRequest, CouponsResponse>,
    Update<CouponRequest, CouponsResponse, Long>,
        Delete<Long> {
  
}
