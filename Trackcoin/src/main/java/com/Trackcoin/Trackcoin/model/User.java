package com.Trackcoin.Trackcoin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false)
    private Long user_id;

    @Column(name = "name", unique = false, nullable = false)
    private String name;

    @Column(name = "lastname", unique = false, nullable = false)
    private String lastname;

    @Column(name = "username", unique = false, nullable = false)
    private String username;

    @ManyToMany
    @JoinTable(
            name = "token_user",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "token_id"))
    Set<Token> tokens;
}
