package com.poliakov.vkBot.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.poliakov.vkBot.enums.CallbackType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CallbackDto {

    @JsonProperty("type")
    private CallbackType type;

    @JsonProperty("object")
    private ObjectDto object;

    @JsonProperty("group_id")
    private Long groupId;

    @JsonProperty("event_id")
    private String eventId;

    @JsonProperty("secret")
    private String secret;
}
