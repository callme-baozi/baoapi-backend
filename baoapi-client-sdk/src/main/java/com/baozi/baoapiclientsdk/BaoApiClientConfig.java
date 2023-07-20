package com.baozi.baoapiclientsdk;

import com.baozi.baoapiclientsdk.client.BaoApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * baoApi 客户端配置
 *

 */
@Configuration
@ConfigurationProperties("baoapi.client")
@Data
@ComponentScan
public class BaoApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public BaoApiClient baoApiClient() {
        return new BaoApiClient(accessKey, secretKey);
    }

}
