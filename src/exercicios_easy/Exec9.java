package exercicios_easy;

import javax.swing.*;

//9-)Faça um algoritmo para ler um número inteiro entre: 1 e 10, calcular e exibir a tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 = 100.
public class Exec9 {
    public String[] calcularTabuada(int num1) {
        String[] tabuada = new String[10];
        int i =0;
        while (i <= 11){
            tabuada[i] = num1+ " x " + i + " = " + num1 *i ;
            i++;
        }
        return tabuada;
    }
}
