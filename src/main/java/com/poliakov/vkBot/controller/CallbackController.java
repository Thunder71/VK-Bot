package com.poliakov.vkBot.controller;

import com.poliakov.vkBot.dto.CallbackDto;
import com.poliakov.vkBot.service.CallbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequiredArgsConstructor
@RequestMapping("/vkBot")
public class CallbackController {

    private final CallbackService callbackService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<String> requestCallback(@RequestBody CallbackDto callbackDto){
        return new ResponseEntity<>(callbackService.requestCallback(callbackDto), HttpStatus.OK);
    }

}
