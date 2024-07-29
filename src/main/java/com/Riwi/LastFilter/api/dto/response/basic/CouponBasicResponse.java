package com.Riwi.LastFilter.api.dto.response.basic;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponBasicResponse {
    private Long id;
    private String couponCode;
    private String description;
    private Double discount;
    private LocalDateTime expiresDate;
}