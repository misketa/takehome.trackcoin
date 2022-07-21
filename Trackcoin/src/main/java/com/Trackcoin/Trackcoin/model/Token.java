package com.Trackcoin.Trackcoin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tokeni")
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "token_id", unique = true, nullable = false)
    private Long token_id;

    @Column(name = "tokenSymbol", unique = true, nullable = false)
    private String tokenSymbol;

    @Column(name = "price", unique = false, nullable = false)
    private Long price;

    @Column(name = "aboveDollar")
    private Boolean aboveDollar;


    @ManyToMany(mappedBy = "tokens")
    @JsonIgnore
    Set<User> users;
}
