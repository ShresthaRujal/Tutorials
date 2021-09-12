package com.rujal.multitenent;

import io.gitlab.rujal_sh.annotation.Database_Based_MultiTenancy;
import io.gitlab.rujal_sh.annotation.Schema_Based_MultiTenancy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Database_Based_MultiTenancy(basePackages = "com.rujal")
@EnableJpaRepositories
public class MultiTenantApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiTenantApplication.class, args);
    }

}
