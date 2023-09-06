package com.jihoon.oauthback.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
  private String code;
  private String message;

  public static ResponseEntity<ResponseDto> databaseError() {
    ResponseDto result = new ResponseDto("DE", "Database Error.");
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
  }
}
