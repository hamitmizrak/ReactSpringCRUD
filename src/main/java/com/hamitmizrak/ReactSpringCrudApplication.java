package com.hamitmizrak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//Auditing aktif etmek için // Update/insert kim ve ne zaman yaptını kayıtını tutan Entity sınıfı
@EnableJpaAuditing
@SpringBootApplication
(exclude =
{
org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)
public class ReactSpringCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactSpringCrudApplication.class, args);
    }

}
