package com.security.app.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.app.security.entity.User;
import com.security.app.security.repository.UserRepository;
import com.security.app.security.user.CustomUserDetails;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
// UserDetailsService는 AuthenticationProvider에 의해 호출되고 
// 시스템 상에 인증 정보가 존재한다면 이를 UserDetails에 담아 반환
public class JpaUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("조회 실패"));

        return new CustomUserDetails(user);
    }
}