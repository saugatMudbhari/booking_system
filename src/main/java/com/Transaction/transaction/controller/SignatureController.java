package com.Transaction.transaction.controller;

import com.Transaction.transaction.service.SignatureService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secret")
@RequiredArgsConstructor
public class SignatureController {
    private final SignatureService service;

    @GetMapping("/generateSignature")
    public String generateSignature(
            @RequestParam int total_cost, @RequestParam String transaction_uuid) {
        // Construct the input string similar to the JavaScript example
        String inputString = String.format(
                "total_amount=%d,transaction_uuid=%s,product_code=EPAYTEST",
                total_cost, transaction_uuid);

        // Call the createSig function and return the generated signature
        return service.createSig(inputString);
    }
}