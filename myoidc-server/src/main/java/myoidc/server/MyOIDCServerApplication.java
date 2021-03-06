package myoidc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot bootstrap
 */
@SpringBootApplication
public class MyOIDCServerApplication {


    /**
     * Do not run it directly
     *
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(MyOIDCServerApplication.class, args);
    }
}
