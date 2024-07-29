package com.Riwi.LastFilter.api.dto.response.basic;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserBasicResponse {
    private Long id;
    private String email;
    private String name;
}
