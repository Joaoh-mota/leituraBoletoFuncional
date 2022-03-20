
import com.joaomota.retornoboletofuncional.LeituraRetorno;
import com.joaomota.retornoboletofuncional.ProcessarBoleto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author joaoh
 */
public class Principal {
    public static void main(String[] args) {
        ProcessarBoleto processarBancoBradesco = new ProcessarBoleto(LeituraRetorno::lerBancoBradesco);
        String boletoBradesco = Principal.class.getResource("bradesco-1.csv").getPath();
        System.out.println("Lendo arquivo: "+boletoBradesco);
        processarBancoBradesco.processar(boletoBradesco);
    }       
}
