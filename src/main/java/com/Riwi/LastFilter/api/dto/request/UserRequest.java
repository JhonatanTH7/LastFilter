package com.Riwi.LastFilter.api.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {
    @NotNull(message = "The name cannot be empty")
    private String name;
    @NotNull(message = "The email cannot be empty")
    private String email;
    @NotNull(message = "The password cannot be empty")
    private String password;
    private Boolean isActive;
}
