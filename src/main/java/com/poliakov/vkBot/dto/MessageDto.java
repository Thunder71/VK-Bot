package com.poliakov.vkBot.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageDto {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("date")
    private Integer date;

    @JsonProperty("peer_id")
    private Integer peerId;

    @JsonProperty("from_id")
    private Integer fromId;

    @JsonProperty("text")
    private String text;

    @JsonProperty("random_id")
    private Integer randomId;


}
