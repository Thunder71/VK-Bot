package com.poliakov.vkBot.service;

import com.poliakov.vkBot.dto.MessageResultDto;
import com.poliakov.vkBot.dto.MessageSendDto;
import com.poliakov.vkBot.dto.MessagesError;
import com.poliakov.vkBot.exceptions.MessageSendException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.net.URI;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class VkMessageSender {

    private final RestTemplate restTemplate = new RestTemplate();
    private final VkUriCreator vkUriCreator;

    public void send(MessageSendDto messageSendDto){
        messageSendDto.setRandomId((long)messageSendDto.hashCode());
        URI uri = vkUriCreator.create(messageSendDto);
        ResponseEntity<MessageResultDto> responseEntity = restTemplate.postForEntity(uri, null, MessageResultDto.class);
        validateResponse(responseEntity);

    }

    private void validateResponse(ResponseEntity<MessageResultDto> responseEntity){
        MessagesError error = Objects.requireNonNull(responseEntity.getBody().getError());
        if(error != null && error.getErrorCode() != null){
            throw new MessageSendException(error.getErrorMsq());
        }
    }

}
