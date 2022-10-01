package exercicios_easy;

import javax.swing.*;

//6-) Faça um algoritmo para ler duas notas, calcular a média.
//E SE - a média > 5 Exibir aprovado;
//SE a média < que 5 exibir reprovado;
//Se media = 5 exibir exame.
public class Exec6 {
    public String calcularMedia(int nota1, int nota2) {
        int media;
        String retorno = "";
        media = (nota1 + nota2) / 2;
        if (media > 5) {
            retorno = "Aprovado";
        }
        if (media < 5) {
            retorno = "Reprovado";
        }
        if (media == 5) {
            retorno = "Exame";
        }
        return retorno;
    }
}
