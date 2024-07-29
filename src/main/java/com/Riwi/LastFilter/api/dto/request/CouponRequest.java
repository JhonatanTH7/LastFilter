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
    @NotNull(message = "The couponcode cannot be empty")
    private String couponCode;
    @NotNull(message = "The description cannot be empty")
    private String description;
    private Double discount;
    @NotNull(message = "The expiresdate cannot be empty")
    private LocalDateTime expiresDate;
    private Boolean isActive;
}
