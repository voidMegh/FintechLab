package com.MIT.FIS10.repository;

import com.MIT.FIS10.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
