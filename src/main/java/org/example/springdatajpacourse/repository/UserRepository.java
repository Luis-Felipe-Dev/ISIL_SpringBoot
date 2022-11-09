package org.example.springdatajpacourse.repository;

import org.example.springdatajpacourse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
