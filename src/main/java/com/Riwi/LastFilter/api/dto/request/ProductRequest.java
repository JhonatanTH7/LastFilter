package com.Riwi.LastFilter.api.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
   @NotNull(message = "The productname cannot be empty")
   private String productName;
   @NotNull(message = "The productprice cannot be empty")
   private Double productPrice; 
   private Boolean isActive;
}
