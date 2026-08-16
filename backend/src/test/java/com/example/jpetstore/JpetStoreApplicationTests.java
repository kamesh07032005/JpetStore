package com.example.jpetstore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class JpetStoreApplicationTests {
    @Autowired TestRestTemplate rest;
    @Test void healthEndpointReturnsUp() {
        assertThat(rest.getForObject("/api/health", String.class)).contains("UP");
    }
}
