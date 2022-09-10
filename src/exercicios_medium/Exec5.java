package exercicios_medium;

import javax.swing.*;

//5-)  Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5 números digitados, é o menor.
public class Exec5 {
    public static void main(String[] args) {
        int i = 1, num = 0, menor=0;
        while(i <= 5){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            if(num < menor || i == 1){
                menor = num;
            }
            i++;
        }
        System.out.println("O numero menor é : " + menor);
    }
}
