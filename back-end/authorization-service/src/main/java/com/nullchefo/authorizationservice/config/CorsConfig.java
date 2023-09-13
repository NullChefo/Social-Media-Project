package com.nullchefo.authorizationservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

@Configuration
public class CorsConfig {

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.setAllowedOrigins(List.of(
                "http://127.0.0.1:3000",
                "http://localhost:3000",
                "http://127.0.0.1:4200",
                "http://localhost:4200",
                "https://diploma-project.nullchefo.com",
                "https://diploma-project-ui.nullchefo.com",
                "https://social-media-project.nullchefo.com",
                "https://backend.nullchefo.com",
                "https://github.com",
                "https://auth.nullchefo.com",

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
				"http://api.social-media-project-java.nullchefo.com",

				"https://authorization-social-media-project-java-railway.nullchefo.com",
				"http://authorization-social-media-project-java-railway.nullchefo.com",
				"https://api-social-media-project-java-railway.nullchefo.com",
				"http://api-social-media-project-java-railway.nullchefo.com",
				"https://ui-social-media-project-java-railway.nullchefo.com",
				"http://ui-social-media-project-java-railway.nullchefo.com"


				));
        config.setAllowedHeaders(List.of("*"));
        config.setAllowedMethods(List.of("*"));
        source.registerCorsConfiguration("/**", config);
        return source;
    }

    public void corsCustomizer(HttpSecurity http) throws Exception {
        http.cors(c -> {
            CorsConfigurationSource source = s -> {
                CorsConfiguration cc = new CorsConfiguration();
                cc.setAllowCredentials(true);
                cc.setAllowedOrigins(List.of(
                        "http://127.0.0.1:3000",
                        "http://localhost:3000",
                        "http://127.0.0.1:4200",
                        "http://localhost:4200",
                        "https://diploma-project.nullchefo.com",
                        "https://diploma-project-ui.nullchefo.com",
                        "https://social-media-project.nullchefo.com",
                        "https://github.com",
                        "https://backend.nullchefo.com",
                        "https://auth.nullchefo.com",

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
						"http://api.social-media-project-java.nullchefo.com",
						"https://authorization-social-media-project-java-railway.nullchefo.com",
						"http://authorization-social-media-project-java-railway.nullchefo.com",
						"https://api-social-media-project-java-railway.nullchefo.com",
						"http://api-social-media-project-java-railway.nullchefo.com",
						"https://ui-social-media-project-java-railway.nullchefo.com",
						"http://ui-social-media-project-java-railway.nullchefo.com"


                ));
                cc.setAllowedHeaders(List.of("*"));
                cc.setAllowedMethods(List.of("*"));
                return cc;
            };
            c.configurationSource(source);
        });
    }

}
