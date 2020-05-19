package com.vitanum.eurekaservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EurekaServiceApplicationTests {

    @Value("${eureka.client.fetch-registry}")
    private String fetchRegistry;

    @Value("${eureka.client.register-with-eureka}")
    private String registerWithEureka;

    @Test
    public void contextLoads() {
        assertEquals("false", fetchRegistry);
        assertEquals("false", registerWithEureka);
    }
}
