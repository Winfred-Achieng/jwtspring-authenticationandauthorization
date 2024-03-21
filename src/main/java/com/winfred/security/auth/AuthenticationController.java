package com.winfred.security.auth;

import com.winfred.security.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthenticationController {

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> register (@RequestBody RegisterRequest request){
     return null;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<ApiResponse> register (@RequestBody AuthenticationRequest request){
        return null;
    }
}
