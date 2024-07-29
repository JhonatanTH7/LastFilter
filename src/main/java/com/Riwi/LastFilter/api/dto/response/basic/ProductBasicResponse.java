package com.Riwi.LastFilter.api.dto.response.basic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductBasicResponse {
    private Long id;
    private String productName;
    private Double ProductPrice;
}
