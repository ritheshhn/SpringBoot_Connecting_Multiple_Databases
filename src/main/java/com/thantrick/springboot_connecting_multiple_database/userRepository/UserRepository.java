package com.thantrick.springboot_connecting_multiple_database.userRepository;

import com.thantrick.springboot_connecting_multiple_database.userEntity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
