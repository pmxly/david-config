package org.david.config;

import org.hzero.autoconfigure.config.EnableHZeroConfig;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.config.ConfigServerAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableHZeroConfig
@EnableDiscoveryClient
@SpringBootApplication(exclude = {ConfigServerAutoConfiguration.class})
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}


