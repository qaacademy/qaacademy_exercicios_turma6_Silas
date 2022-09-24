package exercicios_medium;

import javax.swing.*;

//2-) Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros, e o total. Considerando que a remuneração será no regime de juros compostos.
public class Exec2 {
    public static void main(String[] args) {
        double valorInv = 0, taxajuros = 0.05, valorJuros = 0, valorTotal = 0;
        int i = 1;
        valorInv = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de investimento: "));
        while (i <= 10) {
            valorJuros = ((valorJuros + valorInv) * taxajuros) + valorJuros;
            i++;
        }
        valorTotal = valorInv + valorJuros;
        System.out.println("Valor investido " + valorInv);
        System.out.println("Valor juros " + valorJuros);
        System.out.println("Valor total: " + valorTotal);

    }
}