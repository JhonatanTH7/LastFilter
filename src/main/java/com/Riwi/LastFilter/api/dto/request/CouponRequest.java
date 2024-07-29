package com.Riwi.LastFilter.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CouponRequest {
    @NotNull(message = "the couponCode not empy")
    private String couponCode;
    @NotNull(message = "the description not empy")
    private String description;
    private Double discount;
    @NotNull(message = "the expiresDate not empy")
    private LocalDateTime expiresDate;
    private Boolean isActive;
}
