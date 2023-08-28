package com.nullchefo.gatewayservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.cors.CorsConfiguration;

import java.util.List;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {
    @Bean
    SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
                .csrf().disable()
                .cors().configurationSource(request -> {
                    CorsConfiguration configuration = new CorsConfiguration();
                    configuration.setAllowedOrigins(List.of(
                            "http://127.0.0.1:4200",
                            "https://diploma-project.nullchefo.com",
                            "https://diploma-project-ui.nullchefo.com",
                            "http://localhost:4200",
                            "http://authorization:9000",
                            "https://auth.nullchefo.com",
                            "https://backend.nullchefo.com",
                            "https://social-media-project.nullchefo.com",
							"https://smp-java-gateway-service.icyisland-40395fb3.westeurope.azurecontainerapps.io",
							"http://smp-java-gateway-service.icyisland-40395fb3.westeurope.azurecontainerapps.io",

							"https://social-media-project.nullchefo.com",
							"https://authorization.social-media-project.nullchefo.com",
							"https://smp-java-authorization-service.icyisland-40395fb3.westeurope.azurecontainerapps.io",
							"https://smp-java-front-end.icyisland-40395fb3.westeurope.azurecontainerapps.io",
							"https://smp-java-gateway-service.icyisland-40395fb3.westeurope.azurecontainerapps.io",
							"https://smp-java-mail-send-service.icyisland-40395fb3.westeurope.azurecontainerapps.io",
							"https://smp-java-social-media-service.icyisland-40395fb3.westeurope.azurecontainerapps.io",

							"https://social-media-project-java.nullchefo.com",
							"https://api.social-media-project-java.nullchefo.com",
							"https://authorization.social-media-project-java.nullchefo.com",
							"http://social-media-project-java.nullchefo.com",
							"http://authorization.social-media-project-java.nullchefo.com",
							"http://api.social-media-project-java.nullchefo.com"

							));
                    configuration.setAllowedMethods(List.of("*"));
                    configuration.setAllowedHeaders(List.of("*"));
                    return configuration;
                }).and()

                //		http
                //				.csrf(csrf -> csrf.csrfTokenRepository(
                //						CookieServerCsrfTokenRepository.withHttpOnlyFalse()))
                //				.build();

                //				.securityMatcher(new NegatedServerWebExchangeMatcher(
                //						pathMatchers("/api/**")))

                // OR

                // .csrf()
                //        .requireCsrfProtectionMatcher(new NegatedServerWebExchangeMatcher(
                //            pathMatchers("/api/**/register")))

                // OR

                //		.csrf().requireCsrfProtectionMatcher(getURLsForDisabledCSRF())
                //		.and()

                .authorizeExchange()
                .pathMatchers(
                        "/actuator/**",
                        "/fallback/**",
                        "/user/**",
                        "/api/social-media/swagger/**",
                        "/api/user/swagger/**",
                        "/api/mail-send/swagger/**",
                        "/api/mail-process/swagger/**",
                        "/webjars/**",
                        "/swagger-ui/**",
                        "/favicon.ico",
                        "/v1/api-docs/**",
                        "/mail-send/v1/api-docs/**",
                        "/mail-process/v1/api-docs/**",
                        "/authorization/v1/api-docs/**",
                        "/car-history/v1/api-docs/**",
                        "/social-media/v1/api-docs/**",
                        "/social-media/v2/user/management/*",
                        "/user/v1/api-docs/**",
                        "/swagger-ui.html",
                        "/v1/api-docs/**",
                        "/authorization/**"
                ).permitAll()
                .anyExchange()
                .authenticated()
                .and()

                .oauth2ResourceServer().jwt();
        return http.build();
    }

}

