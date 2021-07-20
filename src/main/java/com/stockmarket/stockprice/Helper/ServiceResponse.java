package com.stockmarket.stockprice.Helper;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@AllArgsConstructor
public class ServiceResponse {
    private final HttpStatus status;
    private final Object body;

    public ResponseEntity<?> getResponse() {
        return ResponseEntity.status(status).body(body);
    }

    public ResponseEntity<?> getResponse(HttpHeaders httpHeaders) {
        return ResponseEntity.status(status).headers(httpHeaders).body(body);
    }
}
