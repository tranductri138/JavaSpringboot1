package com.example.manageremp.jwt;

import org.springframework.beans.factory.annotation.Value;

public class JwtTokenProvider {

    @Value("${security.jwt.token.secret-key:secret-key}")
    private String secretKey;

    // cafi time 1h
    @Value("${security.jwt.token.expire-length:3600000}")
    private long validityInMilliseconds = 3600000; // 1h

//    private
}
