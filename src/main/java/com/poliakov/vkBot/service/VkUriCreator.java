package com.poliakov.vkBot.service;

import com.poliakov.vkBot.config.VkConfigProperties;
import com.poliakov.vkBot.dto.MessageSendDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
@RequiredArgsConstructor
public class VkUriCreator {

    private final VkConfigProperties vkConfigProperties;

    public URI create(MessageSendDto messageSendDto){

        return UriComponentsBuilder.fromHttpUrl("https://api.vk.com/method/messages.send")
                .queryParam("access_token", vkConfigProperties.getAccessToken())
                .queryParam("v", vkConfigProperties.getV())
                .queryParam("peer_id", messageSendDto.getPeerId())
                .queryParam("random_id", messageSendDto.getRandomId())
                .queryParam("message", messageSendDto.getMessage())
                .queryParam("group_id", messageSendDto.getGroupId())
                .build()
                .toUri();
    }

}
