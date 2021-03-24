package com.poliakov.vkBot.service;

import com.poliakov.vkBot.dto.CallbackDto;

public interface CallbackService {
    String requestCallback(CallbackDto callbackDto);
}
