package com.jihoon.oauthback.dto.response.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.jihoon.oauthback.dto.response.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SignUpResponseDto extends ResponseDto {
  
  private SignUpResponseDto (String code, String message) {
    super(code, message);
  }

  public static ResponseEntity<SignUpResponseDto> success() {
    SignUpResponseDto result = new SignUpResponseDto("SU", "Success");
    return ResponseEntity.status(HttpStatus.OK).body(result);
  }

  public static ResponseEntity<ResponseDto> existedId() {
    ResponseDto result = new ResponseDto("EI", "Existed ID");
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
  }

}
