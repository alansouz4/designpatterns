package com.designpartner;

import com.designpartner.factorymethod.CalculadoraDeImpostos;
import com.designpartner.factorymethod.controller.MessageLoggerCreate;

import javax.swing.*;

public class FactoryMethodApplication {

    public static void main(String[] args) {

        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos(new MessageLoggerCreate("Calculando imposto para o valor R$ "));

        final String message =
            JOptionPane.showInputDialog(null, "Digite o valor:");

        calculadoraDeImpostos.calcular(Double.parseDouble(message));

        JOptionPane.showConfirmDialog(null, "Imposto calculado com sucesso? ");
    }

}