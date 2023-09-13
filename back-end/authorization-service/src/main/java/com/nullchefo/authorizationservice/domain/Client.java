package com.nullchefo.authorizationservice.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "client")
@Getter
@Setter
public class Client {
    @Id
    private String id;

    @Column(nullable = true, length = 9000)
    private String clientId;
	@Column(length = 9000)
    private Instant clientIdIssuedAt;
	@Column(length = 9000)
    private String clientSecret;
	@Column(length = 9000)
    private Instant clientSecretExpiresAt;
	@Column(length = 9000)
    private String clientName;
	@Column(length = 9000)
    private String clientAuthenticationMethods;
	@Column(length = 9000)
    private String authorizationGrantTypes;
	@Column(length = 9000)
    private String redirectUris;
	@Column(length = 9000)
    private String scopes;
    @Column(length = 9000)
    private String clientSettings;
    @Column(length = 9000)
    private String tokenSettings;

}


