package com.Riwi.LastFilter.api.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponsResponse {
    private long id;
    private String couponCode;
    private String description;
    private LocalDateTime expiresDate;
    private Double discount;
}
