package com.security.app.security.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(	name = "users", 
		uniqueConstraints = { 
			@UniqueConstraint(columnNames = "username"),
			@UniqueConstraint(columnNames = "email") 
		})
public class User {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
    private Long id;

    @Column(name="username", nullable = false)
    @NotBlank
	@Size(max = 20)
    private String username;

    @NotBlank
	@Size(max = 50)
	@Email
	private String email;
    
    @Column(name="password", nullable = false)
    @NotBlank
	@Size(max = 120)
	private String password;

    @Setter
	@Builder.Default
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(	name = "user_roles", 
				joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "user_id")},
				inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "role_id")})
	private Set<Role> roles = new HashSet<>();
    
    // @Enumerated(EnumType.STRING)
    // private EncryptionAlgorithm algorithm;

    // @Builder.Default
    // @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    // private List<Authority> authorities = new ArrayList<>();

    // public static User createFamily(CreateUserRequest dto) {
    //     return User.builder()
    //             .username(dto.getUserName())
    //             .password(dto.getUserName())
    //             .build();
    // }

    // public void insertAuthority(Authority authority) {
    //     authorities.add(authority);
    // }

    // @CreationTimestamp
    // @Column(nullable = false, length = 20, updatable = false)
    // private LocalDateTime createdAt;

    // @UpdateTimestamp
    // @Column(length = 20)
    // private LocalDateTime updatedAt;
}
