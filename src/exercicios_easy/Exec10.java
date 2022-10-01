package exercicios_easy;

import javax.swing.*;

//10-)Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros e o total com juros. Considerando que a remuneração será no regime de juros simples.
public class Exec10 {
    public String calcularInvestimento(double investimento) {
        double taxa = 0.05, valorJuros = 0, valorTotal = 0;
        int i = 1;
        while(i <= 10) {
            valorJuros = investimento * taxa + valorJuros;
            i = i + 1;
        }
        return "Valor dos juros "+ valorJuros + " Valor investimento " + investimento + " Valor total " + (valorJuros + investimento) ;
    }
}
