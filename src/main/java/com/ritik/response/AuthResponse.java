package com.ritik.response;

import com.ritik.model.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {

    public String jwt;

    public String message;

    private USER_ROLE role;
}
