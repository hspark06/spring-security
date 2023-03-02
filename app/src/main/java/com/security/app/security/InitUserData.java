// package com.security.app.security;

// import org.springframework.stereotype.Component;

// import com.security.app.enums.EncryptionAlgorithm;
// import com.security.app.security.entity.Authority;
// import com.security.app.security.entity.User;
// import com.security.app.security.repository.AuthorityRepository;
// import com.security.app.security.repository.UserRepository;

// import jakarta.annotation.PostConstruct;
// import lombok.RequiredArgsConstructor;

// @Component
// @RequiredArgsConstructor
// public class InitUserData {
    
//     private final UserRepository userRepository;
//     private final AuthorityRepository authorityRepository;

//     @PostConstruct
//     public void setInitUserData() {

//         User user = User.builder()
//                     .username("abc")
//                     .password("$2a$10$8SltI0Jht3aZC.LNkfPZ1OeKh.iAAtVmnh.SkJpF1nqaH0RfIBOye") // 1234
//                     //.algorithm(EncryptionAlgorithm.BCRYPT)
//                     .build();

//         Authority authority = Authority.builder()
//                     .name("read")
//                     .user(user)
//                     .build();

//         userRepository.save(user);
//         authorityRepository.save(authority);
//     }
// }
