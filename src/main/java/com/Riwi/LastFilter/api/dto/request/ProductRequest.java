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
   @NotNull(message = "the ProductName not empy")
   private String productName;
   @NotNull(message = "the productPrice not empy")
   private Double productPrice; 
   private Boolean isActive;
}
