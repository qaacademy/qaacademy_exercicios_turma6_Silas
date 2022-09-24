package exercicios_easy;
import exemplos.MetodosComParametrosMain;

import javax.swing.*;

//4-)  Faça um algoritmo para ler um número inteiro,
//armazenar em uma variável, calcular o dobro, e exibir.
public class Exec4 { //inicio da classe
    public static void main(String[] args) {
        //    Declarar variável do tipo numérico: numero;
        int num1;
        // numero = Ler ();
           num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        //        Exibir: numero*2;
        System.out.println("O dobro é " + num1*2);

    }


} //fim da classe
//
//    Inicio Algoritmo
///    Declarar variável do tipo numérico: numero;
//        numero = Ler (10);
//        Exibir: numero*2;
//        Fim Algoritmo



