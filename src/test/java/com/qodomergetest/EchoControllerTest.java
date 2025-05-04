package com.qodomergetest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EchoControllerTest {

    @Autowired
    private EchoController echoController;

    @Test
    void get() {
        ResponseEntity<String> hello = echoController.get("Hello");
        assertEquals("Hello", hello.getBody());
    }

    @Test
    void getUpper() {
        ResponseEntity<String> hello = echoController.getUpper("Hello");
        assertEquals("HELLO", hello.getBody());
    }

    @Test
    void getLower() {
        ResponseEntity<String> hello = echoController.getLower("Hello");
        assertEquals("hello", hello.getBody());
    }
}
