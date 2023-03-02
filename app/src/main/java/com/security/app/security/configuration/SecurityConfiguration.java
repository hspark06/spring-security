package com.security.app.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.password.NoOpPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfiguration {
    
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // @Bean
    // public UserDetailsService userDetailsService() {
    //     CustomUser user1 = new CustomUser("abc", "1234", new CustomGrantedAuthority("read"));
    //     CustomUser user2 = new CustomUser("dsic", "1234", new CustomGrantedAuthority("read"));
    //     return new InMemoryUserDetailsService(List.of(user1, user2));
    // }

    // @Bean
    // public UserDetailsService userDetailsService(DataSource dataSource) {
    //     JdbcUserDetailsManager userDetailsManager = new JdbcUserDetailsManager(dataSource);

    //     CustomUser customUser = new CustomUser("abc", "1234", new CustomGrantedAuthority("read"));
    //     userDetailsManager.createUser(customUser);

    //     return userDetailsManager;
    // }

    // @Bean
    // public PasswordEncoder passwordEncoder() {
    //     //NoOpPasswordEncoder : 비밀번호를 암호화하지 않는 형태
    //     return NoOpPasswordEncoder.getInstance();
    // }

    // @Bean
    // public SCryptPasswordEncoder sCryptPasswordEncoder() {
    //     return new SCryptPasswordEncoder();
    // }
}
