/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joaomota.retornoboletofuncional;

import java.util.List;
import java.util.function.Function;

/**
 *
 * @author joaoh
 */
public class ProcessarBoleto {
    private Function<String, List<Boleto>> leituraRetorno;

    public ProcessarBoleto(Function<String, List<Boleto>> leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(String arquivo) {
        List<Boleto> boletos = leituraRetorno.apply(arquivo);
        boletos.stream().forEach(System.out::println);
    }
}
