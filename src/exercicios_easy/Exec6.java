package exercicios_easy;

import javax.swing.*;

//6-) Faça um algoritmo para ler duas notas, calcular a média.
//E SE - a média > 5 Exibir aprovado;
//SE a média < que 5 exibir reprovado;
//Se media = 5 exibir exame.
public class Exec6 {
    public static void main(String[] args) {
        int nota1, nota2, media;
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota"));
        media = (nota1 + nota2) / 2;
        if (media > 5) {
            System.out.println(media);
            System.out.println("Aprovado");
        }
        if (media < 5) {
            System.out.println(media);
            System.out.println("Reprovado");
        }
        if (media == 5) {
            System.out.println(media);
            System.out.println("Exame");
        }
    }
}
