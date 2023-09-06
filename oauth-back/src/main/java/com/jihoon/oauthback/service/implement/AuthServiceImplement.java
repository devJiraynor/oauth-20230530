package com.jihoon.oauthback.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jihoon.oauthback.dto.request.auth.SignUpRequestDto;
import com.jihoon.oauthback.dto.response.ResponseDto;
import com.jihoon.oauthback.dto.response.auth.SignUpResponseDto;
import com.jihoon.oauthback.repository.UserRepository;
import com.jihoon.oauthback.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImplement implements AuthService {

  private final UserRepository userRepository;
  
  @Override
  public ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto) {

    String id = dto.getId();

    try {

      boolean hasId = userRepository.existsById(id);
      if (hasId) return SignUpResponseDto.existedId();

      

    } catch(Exception exception) {
      exception.printStackTrace();
      return ResponseDto.databaseError();
    }

    return SignUpResponseDto.success();

  }
  
}
