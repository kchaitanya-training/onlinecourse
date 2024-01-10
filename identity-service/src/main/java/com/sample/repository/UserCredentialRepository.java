package com.sample.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.entity.UserCredential;

public interface UserCredentialRepository extends JpaRepository<UserCredential, Integer>{

	  Optional<UserCredential> findByName(String username);
}
