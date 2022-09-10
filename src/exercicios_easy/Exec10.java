package exercicios_easy;

import javax.swing.*;

//10-)Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros e o total com juros. Considerando que a remuneração será no regime de juros simples.
public class Exec10 {
    public static void main(String[] args) {

        double investimento, taxa = 0.05, valorJuros = 0, valorTotal = 0;
        int i = 1;
        investimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o inestmento"));
        while(i <= 10) {
            valorJuros = investimento * taxa + valorJuros;
            i = i + 1;
        }
        System.out.println("Valor dos juros "+ valorJuros);
        System.out.println("Valor investimento " + investimento);
        System.out.println("Valor total " + (valorJuros + investimento));
    }
}
