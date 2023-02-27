package com.security.app.security.user;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomGrantedAuthority implements GrantedAuthority {

    private final String authority;
    
    @Override
    public String getAuthority() {
        return authority;
    }
}
