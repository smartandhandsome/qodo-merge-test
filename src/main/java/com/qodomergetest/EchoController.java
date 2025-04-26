package com.qodomergetest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EchoController {

    @GetMapping("/echo")
    public ResponseEntity<String> get(@RequestBody String request) {
        return ResponseEntity.ok(request);
    }

    @GetMapping("/upper")
    public ResponseEntity<String> getUpper(@RequestBody String request) {
        return ResponseEntity.ok(request.toUpperCase());
    }

}
