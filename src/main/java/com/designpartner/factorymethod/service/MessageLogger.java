package com.designpartner.factorymethod.service;

import com.designpartner.factorymethod.gateway.LoggerPrinter;

public abstract class MessageLogger {

    protected abstract LoggerPrinter createLogger();

    public boolean sendLogger(String message) {
        return createLogger().print(message);
    }

}
