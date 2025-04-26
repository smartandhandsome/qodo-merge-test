package com.qodomergetest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EchoController {

    @PostMapping("/echo")
    public ResponseEntity<String> get(@RequestBody String request) {
        return ResponseEntity.ok(request);
    }

    @PostMapping("/upper")
    public ResponseEntity<String> getUpper(@RequestBody String request) {
        return ResponseEntity.ok(request.toUpperCase());
    }

    @PostMapping("/lower")
    public ResponseEntity<String> getLower(@RequestBody String request) {
        return ResponseEntity.ok(request.toLowerCase());
    }

}
