package main;

import exemplos.Caneta;
import exemplos.MetodosSemMain;

public class Execucao {
    public static void main(String[] args) throws Exception {
        Caneta caneta = new Caneta();
        caneta.inserirMarca("Palmeirex");
        caneta.trocaCor("ROSA");
        System.out.println("Cor Atual " + caneta.mostrarCorAtual());
        caneta.rabiscar();
        caneta.pintar();
        caneta.escrever("Aula de Automação");

    }
}
