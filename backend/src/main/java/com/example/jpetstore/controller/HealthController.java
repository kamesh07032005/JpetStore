package com.example.jpetstore.controller;

import com.example.jpetstore.dto.HealthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthController {
    @GetMapping("/health") public ResponseEntity<HealthResponse> health() { return ResponseEntity.ok(new HealthResponse("UP")); }
}
