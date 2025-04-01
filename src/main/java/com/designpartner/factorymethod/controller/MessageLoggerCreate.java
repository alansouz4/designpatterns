package com.designpartner.factorymethod.controller;

import com.designpartner.factorymethod.gateway.impl.LoggerImpl;
import com.designpartner.factorymethod.gateway.LoggerPrinter;
import com.designpartner.factorymethod.service.MessageLogger;

public class MessageLoggerCreate extends MessageLogger {

    private String message;

    public MessageLoggerCreate(String message) {
        this.message = message;
    }

    @Override
    protected LoggerPrinter createLogger() {
        return new LoggerImpl(message);
    }

}
