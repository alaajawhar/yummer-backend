package com.ajp.yummer.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Alaa Jawhar
 */
@EnableJpaRepositories(basePackages = {"com.ajp.repositories"})
@EntityScan(basePackages = {"com.ajp.entity"})
public class JpaConfig {
}
