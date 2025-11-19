package com.blogpessoal.email_service.controller;

import com.blogpessoal.email_service.model.EmailRequest;
import com.blogpessoal.email_service.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<Map<String, Object>> sendEmail(@RequestBody EmailRequest request) {
        emailService.sendEmail(request);

        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "E-mail enviado com sucesso!");
        response.put("to", request.getTo());

        return ResponseEntity.ok(response);
    }

    @GetMapping("/ping")
    public String ping() {
        return "📡 Email Service ativo e funcionando!";
    }
}
