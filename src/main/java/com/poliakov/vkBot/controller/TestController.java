package com.poliakov.vkBot.controller;

import com.poliakov.vkBot.dto.CallbackDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {


    @PostMapping
    public @ResponseBody CallbackDto request(@RequestBody CallbackDto callbackDto){
        return callbackDto;
    }
}
