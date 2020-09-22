package org.example.firsttestedapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.example.firsttestedapp.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private HomeController controller;

    @Test
    public void ctxLoads() throws Exception{
        assertThat (controller).isNotNull();
    }
}
