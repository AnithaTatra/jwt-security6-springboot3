package com.authorization.jwttoken.service;

import com.authorization.jwttoken.dto.request.SignInRequest;
import com.authorization.jwttoken.dto.request.SignUpRequest;
import com.authorization.jwttoken.dto.response.JwtAuthenticationResponse;

public interface AuthenticationService {

    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);
}
