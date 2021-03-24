package com.poliakov.vkBot.service;

import com.poliakov.vkBot.dto.CallbackDto;
import com.poliakov.vkBot.dto.MessageSendDto;
import org.springframework.stereotype.Component;

@Component
public class MessageSendConverter {

    public MessageSendDto callbackDtoToMessageSendDto(CallbackDto callbackDto){
        return MessageSendDto.builder()
                .peerId(callbackDto.getObject().getMessage().getPeerId().longValue())
                .message("Вы сказали: ".concat(callbackDto.getObject().getMessage().getText()))
                .groupId(callbackDto.getGroupId())
                .build();
    }
}
