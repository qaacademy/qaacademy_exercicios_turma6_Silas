package exercicios_easy;

import javax.swing.*;

//9-)Faça um algoritmo para ler um número inteiro entre: 1 e 10, calcular e exibir a tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 = 100.
public class Exec9 {
    public static void main(String[] args) {
        int num1=0, i =1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        while (i <= 10){
            System.out.println(num1+ " x " + i + " = " + num1 *i );
            i++;
        }
    }
}
