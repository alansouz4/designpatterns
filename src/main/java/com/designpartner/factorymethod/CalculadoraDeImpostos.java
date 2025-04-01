package com.designpartner.factorymethod;

import com.designpartner.factorymethod.service.MessageLogger;

public class CalculadoraDeImpostos {

    private final MessageLogger logger;

    public CalculadoraDeImpostos(MessageLogger logger) {
        this.logger = logger;
    }

    public void calcular(double valor) {

        logger.sendLogger("Calculando imposto para o valor R$" + valor);
    }
}
