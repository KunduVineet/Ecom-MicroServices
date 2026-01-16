package com.ecom.userservice.Model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "build")
@Configuration
@Data
public class BuildInfo {
    private String id;
    private String version;
    private String name;
}
