package com.ecommerce.shop.business.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "eshop")
public class AppProperties {

    private Security security;

    public static class Security {
        private String jwtSecret;
        private Long jwtExpirationMs;
        private Long jwtRefreshExpirationMs;

        public String getJwtSecret() {
            return jwtSecret;
        }

        public void setJwtSecret(String jwtSecret) {
            this.jwtSecret = jwtSecret;
        }

        public Long getJwtExpirationMs() {
            return jwtExpirationMs;
        }

        public void setJwtExpirationMs(Long jwtExpirationMs) {
            this.jwtExpirationMs = jwtExpirationMs;
        }

        public Long getJwtRefreshExpirationMs() {
            return jwtRefreshExpirationMs;
        }

        public void setJwtRefreshExpirationMs(Long jwtRefreshExpirationMs) {
            this.jwtRefreshExpirationMs = jwtRefreshExpirationMs;
        }
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }
}
