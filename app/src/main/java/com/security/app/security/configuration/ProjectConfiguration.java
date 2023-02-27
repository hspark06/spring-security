package com.security.app.security.configuration;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.password.NoOpPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// @EnableWebSecurity
public class ProjectConfiguration {
    // @Bean
    // public UserDetailsService userDetailsService() {
    //     return new InMemoryUserDetailsManager();
    // }

    // @Bean
    // public PasswordEncoder passwordEncoder() {
    //     return NoOpPasswordEncoder.getInstance();
    // }

    // permitAll() : 경로 상의 모든 접근을 승인합니다. 로그인하지 않은 회원도 접근할 수 있습니다.
    // denyAll()   : 경로 상의 모든 접근을 승인하지 않습니다.
    // hasAuthority(String authority) 
    // - 매개변수로 주어진 권한만 접근 승인합니다. 
    // - 만약 hasAuthority("READ")와 같이 코드를 작성하면 READ 권한을 가진 회원만 접근할 수 있습니다.
    // hasAnyAuthority(String... authorities) 
    // - 매개변수로 주어진 하나 이상의 권한을 접근 승인합니다.
    // access(String attribute) 
    // - access는 조금 독특한 메소드로 Spring Expression Language(SpEL)을 매개변수로 받습니다. 
    // - 위의 설명한 네 메소드보다 조금 더 세밀한 권한 설정이 가능하지만 상대적으로 읽기 어렵기 때문에 꼭 필요한 경우에만 
    //   사용하는 것이 권장됩니다.

    // @Bean
    // public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

    //     http.httpBasic();
    //     //http.authorizeRequests().anyRequest().permitAll();
    //     //http.authorizeRequests().anyRequest().denyAll();
    //     //http.authorizeRequests().anyRequest().hasAuthority("WRITE");
    //     //http.authorizeRequests().anyRequest().hasAnyAuthority("WRITE", "READ");
    //     //http.authorizeRequests().anyRequest().access("hasAuthority('WRITE') and !hasAuthority('DELETE')");
    //     return http.build();
    // }
}
