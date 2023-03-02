package com.security.app.security.authentication;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.security.app.security.service.JpaUserDetailsService;
import com.security.app.security.user.CustomUserDetails;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final JpaUserDetailsService jpaUserDetailsService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        CustomUserDetails customUserDetails = jpaUserDetailsService.loadUserByUsername(username);
        return checkPassword(customUserDetails, password, bCryptPasswordEncoder);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class
                .isAssignableFrom(authentication);
    }

    private Authentication checkPassword(CustomUserDetails customUserDetails, String rawPassword, PasswordEncoder passwordEncoder) {

        if (passwordEncoder.matches(rawPassword, customUserDetails.getPassword())) {
            return new UsernamePasswordAuthenticationToken(
                    customUserDetails.getUsername(),
                    customUserDetails.getPassword(),
                    customUserDetails.getAuthorities());
        }

        throw new BadCredentialsException("Bad credentials");
    }
}
