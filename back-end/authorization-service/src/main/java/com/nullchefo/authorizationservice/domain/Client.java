package com.nullchefo.authorizationservice.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
// TODO fix
@Entity
@Table(name = "client")
@Getter
@Setter
public class Client {
    @Id
    private String id;

    @Column(nullable = true, length = 9999)
    private String clientId;
    private Instant clientIdIssuedAt;
    @Column(length = 9999)
    private String clientSecret;
    @Column(length = 9999)
    private Instant clientSecretExpiresAt;
    @Column(length = 9999)
    private String clientName;
    @Column(length = 9999)
    private String clientAuthenticationMethods;
    @Column(length = 9999)
    private String authorizationGrantTypes;
    @Column(length = 9999)
    private String redirectUris;
    @Column(length = 9999)
    private String scopes;
    @Column(length = 9999)
    private String clientSettings;
    @Column(length = 9999)
    private String tokenSettings;

}


