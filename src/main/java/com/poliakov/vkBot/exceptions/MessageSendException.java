package com.poliakov.vkBot.exceptions;

public class MessageSendException extends RuntimeException {
    public MessageSendException(String message){
        super(message);
    }
}
