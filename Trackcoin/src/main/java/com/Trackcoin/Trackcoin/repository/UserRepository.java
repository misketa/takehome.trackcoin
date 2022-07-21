package com.Trackcoin.Trackcoin.repository;

import com.Trackcoin.Trackcoin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(Long user_id);
}
