package com.poliakov.vkBot.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectDto {

    @JsonProperty("message")
    private MessageDto message;

    @JsonProperty("client_info")
    private ClientInfoDto clientInfo;
}
