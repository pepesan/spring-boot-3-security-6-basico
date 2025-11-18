package com.cursosdedesarrollo.springboot3security6basico.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                // CSRF: lo desactivamos solo para la consola de H2
                .csrf(csrf -> csrf
                        .ignoringRequestMatchers("/h2-console/**")
                )

                // Permitir que H2 se muestre dentro de frames
                .headers(headers -> headers
                        .frameOptions(frame -> frame.sameOrigin())
                )

                // Autorizaciones
                .authorizeHttpRequests(auth -> auth
                        // Consola H2 sin autenticación
                        .requestMatchers("/h2-console/**").permitAll()

                        // (Opcional) recursos estáticos públicos
                        .requestMatchers(
                                "/css/**",
                                "/js/**",
                                "/images/**",
                                "/webjars/**"
                        ).permitAll()

                        // El resto, autenticado
                        .anyRequest().authenticated()
                )

                // Login por formulario (usa el login por defecto de Spring Security)
                .formLogin(form -> form
                        .permitAll()
                )

                // Logout por defecto
                .logout(logout -> logout
                        .permitAll()
                );

        return http.build();
    }
}
