package exercicios_easy;

import exercicios_medium.Exec1;

import javax.swing.*;

//2-) Faça um algoritmo para ler e exibir uma palavra
public class Exec2 {
    public static void main(String[] args) {
       // Declarar variável do tipo texto palavra;
        String palavra;
        //palavra  = Ler (“Curso”);
        palavra = JOptionPane.showInputDialog("Digte sua palavraa aqui!");
        //Exibir: “A palavra é: ” + varPalavra;
        System.out.println("A Palavra é: " + palavra);
    }
}

//Inicio do algoritmo
//        Declarar variável do tipo texto varPalavra;
//        varPalavra  = Ler (“Curso”);
//        Exibir: “A palavra é: ” + varPalavra;
//        Fim do algoritmo


