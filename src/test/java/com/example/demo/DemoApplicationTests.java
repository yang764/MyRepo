package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;


@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

        assertThat("abcd").as("校验abc").isEqualTo("abcd");

    }

}
