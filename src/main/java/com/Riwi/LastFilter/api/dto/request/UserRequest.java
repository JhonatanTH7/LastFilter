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
    @NotNull(message = "the name not empy")
    private String name;
    @NotNull(message = "the email not empy")
    private String email;
    @NotNull(message = "the password not empy")
    private String password;
    private Boolean isActive;
}
