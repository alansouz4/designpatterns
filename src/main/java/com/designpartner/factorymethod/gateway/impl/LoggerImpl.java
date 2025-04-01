package com.designpartner.factorymethod.gateway.impl;

import com.designpartner.factorymethod.gateway.LoggerPrinter;

import java.util.logging.Level;

public class LoggerImpl implements LoggerPrinter {

    java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoggerImpl.class.getName());

    private String message;

    public LoggerImpl(String message) {
        this.message = message;
    }

    @Override
    public boolean print(String message) {
        logger.log(Level.INFO, "Logging message: " + message);
        return true;
    }

}
