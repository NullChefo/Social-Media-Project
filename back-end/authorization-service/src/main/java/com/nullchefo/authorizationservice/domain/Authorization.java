package com.nullchefo.authorizationservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "authorizations", indexes = {
        @Index(name = "idx_authorization_attributes", columnList = "attributes")
})
@Getter
@Setter
public class Authorization {
    @Id
    //	@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String registeredClientId;
    private String principalName;
    private String authorizationGrantType;
    private String authorizedScopes;
    // TODO fix
    private String attributes;
    private String state;

    private String authorizationCodeValue;
    private Instant authorizationCodeIssuedAt;
    private Instant authorizationCodeExpiresAt;
    private String authorizationCodeMetadata;

    private String accessTokenValue;
    private Instant accessTokenIssuedAt;
    private Instant accessTokenExpiresAt;
    private String accessTokenMetadata;
    private String accessTokenType;
    private String accessTokenScopes;
    private String refreshTokenValue;
    private Instant refreshTokenIssuedAt;
    private Instant refreshTokenExpiresAt;
    private String refreshTokenMetadata;
    private String oidcIdTokenValue;
    private Instant oidcIdTokenIssuedAt;
    private Instant oidcIdTokenExpiresAt;
    private String oidcIdTokenMetadata;
    private String oidcIdTokenClaims;

}


