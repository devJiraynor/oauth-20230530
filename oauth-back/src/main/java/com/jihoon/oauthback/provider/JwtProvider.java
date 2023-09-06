package com.jihoon.oauthback.provider;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtProvider {
  
  private final String SECRET_KEY = "P!ssw0rd";

  public String create(String id) {

    Date expiredDate = Date.from(Instant.now().plus(1, ChronoUnit.HOURS));

    String jwt = Jwts.builder()
      .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
      .setSubject(id).setIssuedAt(new Date()).setExpiration(expiredDate)
      .compact();

    return jwt;

  }

  public String validate(String jwt) {

    Claims payload = null;

    try {
      payload = Jwts.parser()
        .setSigningKey(SECRET_KEY)
        .parseClaimsJws(jwt).getBody();
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    }

    return payload.getSubject();

  }

}
