package com.poliakov.vkBot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MessagesError {

    @JsonProperty("error_code")
    private Long errorCode;

    @JsonProperty("error_msg")
    private String errorMsq;
}
