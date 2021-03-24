package com.poliakov.vkBot.service;

import com.poliakov.vkBot.config.VkConfigProperties;
import com.poliakov.vkBot.dto.CallbackDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.security.InvalidParameterException;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class RequestCallbackService implements CallbackService{

    private final MessageSendConverter converter;
    private final VkConfigProperties vkConfigProperties;

    private final VkMessageSender sender;
    @Override
    public String requestCallback(CallbackDto callbackDto) {
        validateSecret(callbackDto);
        switch (Objects.requireNonNull(callbackDto.getType())){
            case confirmation:{
                return vkConfigProperties.getConfirmation();
            }
            case message_new:{

                sender.send(converter.callbackDtoToMessageSendDto(callbackDto));
                return "ок";
            }
            case message_reply:{
                return "ок";
            }
            default:{
                throw  new UnsupportedOperationException("Service support only 'message_new' callback type");
            }
        }
    }

    private void validateSecret(CallbackDto callbackDto){
        if(!vkConfigProperties.getSecret().equals(callbackDto.getSecret())){
            throw new InvalidParameterException("Invalid secret");
        }
    }
}
