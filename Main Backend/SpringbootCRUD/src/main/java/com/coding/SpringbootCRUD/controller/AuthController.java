package com.coding.SpringbootCRUD.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> req) {

        if ("admin@gmail.com".equals(req.get("email"))) {
            return Map.of("role", "ADMIN", "token", "admin-token");
        }
        return Map.of("role", "USER", "token", "user-token");
    }
}
