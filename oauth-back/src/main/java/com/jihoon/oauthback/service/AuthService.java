package com.jihoon.oauthback.service;

import org.springframework.http.ResponseEntity;

import com.jihoon.oauthback.dto.request.auth.SignUpRequestDto;
import com.jihoon.oauthback.dto.response.auth.SignUpResponseDto;

public interface AuthService {
  
  ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);

}
