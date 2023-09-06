package com.jihoon.oauthback.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jihoon.oauthback.dto.request.auth.SignUpRequestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="user")
@Table(name="user")
public class UserEntity {
  @Id
  private String id;
  private String profileImage;

  public UserEntity(SignUpRequestDto dto) {
    this.id = dto.getId();
    this.profileImage = dto.getProfileImage();
  }

}
