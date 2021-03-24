package com.poliakov.vkBot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;

@PropertySource("classpath:vk.properties")
@ConfigurationProperties(prefix = "vk.api")
@Component
@Data
public class VkConfigProperties {

    @NotBlank
    private String accessToken;

    @NotBlank
    private String v;

    @NotBlank
    private String secret;

    @NotBlank
    private String confirmation;
}
