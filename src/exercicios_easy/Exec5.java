package exercicios_easy;

import javax.swing.*;

//5-) Faça um algoritmo para ler três números inteiros, armazenar em variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números digitados.
public class Exec5 {//inicio classe

    public int somar(int num1, int num2, int num3){
       return num1+num2+num3;
    }
    public int sub(int num1, int num2, int num3){
        return num1-num2-num3;
    }
    public int mult(int num1, int num2, int num3){
        return num1*num2*num3;
    }
    public int media(int num1, int num2, int num3){
        int soma = num1+num2+num3;
        return soma/3;
    }

//    public static void main(String[] args) {
//        int numero1, numero2,numero3, soma,sub,mult,media;
//        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
//        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o seggundo número"));
//        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
//        soma = numero1 + numero2 + numero3;
//        sub = numero1 - numero2 - numero3;
//        mult = numero1 * numero2 * numero3;
//        media = soma / 3;
//
//        System.out.println("A soma é: "+ soma);
//        System.out.println("A subtração é: "+ sub);
//        System.out.println("A multiplicacao é: "+ mult);
//        System.out.println("A media é: %.2f"+ media);
//    }


}//fim classe

//    Inicio Algoritmo
//
//    Declarar variáveis numéricas: numero1, numero2 e numero3;
//        Declarar variáveis numéricas: soma, subtração, multiplicação, media;
//
//        numero1 = Ler(10);
//        numero2 = Ler(20);
//        numero3 = Ler(30);
//
//        soma = numero1 + numero2 + numero3;
//        subtracao = numero1 - numero2 - numero3;
//        multiplicacao = numero1 * numero2 * numero3;
//        media = soma / 3;
//
//
//        Exibir: “A soma dos números digitados é: ”+soma;
//        Exibir: subtração;
//        Exibir: multiplicacao;
//        Exibir: media;

