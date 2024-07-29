package com.Riwi.LastFilter.api.dto.request;

import jakarta.persistence.Column;
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
    @Column(length = 150)
    @NotNull(message = "The name cannot be empty")
    private String name;
    @Column(length = 150)
    @NotNull(message = "The email cannot be empty")
    private String email;
    @Column(length = 150)
    @NotNull(message = "The password cannot be empty")
    private String password;
    private Boolean isActive;
}
