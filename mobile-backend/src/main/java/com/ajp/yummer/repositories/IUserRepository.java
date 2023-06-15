package com.ajp.yummer.repositories;

import com.ajp.yummer.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alaa Jawhar
 */
public interface IUserRepository extends JpaRepository<User, Long> {

}
