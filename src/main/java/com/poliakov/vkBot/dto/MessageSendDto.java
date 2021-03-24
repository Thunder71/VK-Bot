package com.poliakov.vkBot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Builder
@Data
@JsonPropertyOrder(alphabetic = true)
@EqualsAndHashCode(exclude = "randomId")
public class MessageSendDto implements Serializable {

    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("random_id")
    private Long randomId;

    @JsonProperty("peer_id")
    private Long peerId;

    @JsonProperty("domain")
    private String domain;

    @JsonProperty("chat_id")
    private Long chatId;

    @JsonProperty("message")
    private String message;

    @JsonProperty("lat")
    private Double lat;

    @JsonProperty("long")
    private Double longField;

    @JsonProperty("attachment")
    private String attachement;

    @JsonProperty("reply_to")
    private Long replyTo;

    @JsonProperty("forward_messages")
    private String fowMess;

    @JsonProperty("sticker_id")
    private Long stickerId;

    @JsonProperty("group_id")
    private Long groupId;

    @JsonProperty("payload")
    private Long payload;

    @JsonProperty("dont_parse_links")
    private Integer dontParseLinks;
}
