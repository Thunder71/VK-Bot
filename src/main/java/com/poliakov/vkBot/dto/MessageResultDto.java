package com.poliakov.vkBot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageResultDto {

    @JsonProperty("peer_id")
    private Long peerId;

    @JsonProperty("message_id")
    private Long messageId;

    private MessagesError error;
}
