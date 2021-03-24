package com.poliakov.vkBot.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientInfoDto {

    @JsonProperty("button_actions")
    private List<String> button_actions;

    @JsonProperty("keyboard")
    private Boolean keyboard;

    @JsonProperty("inline_keyboard")
    private Boolean inline_keyboard;

    @JsonProperty("carousel")
    private Boolean carousel;

    @JsonProperty("lang_id")
    private Integer lang_id;
}
