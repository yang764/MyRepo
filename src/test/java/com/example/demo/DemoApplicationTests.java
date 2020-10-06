package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;


@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

        assertThat("abcd").as("校验abc").isEqualTo("abcd");
        assertEquals(5, 5);

    }

}
