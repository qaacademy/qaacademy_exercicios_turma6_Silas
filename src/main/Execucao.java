package main;

import exemplos.Caneta;
import exemplos.MetodosSemMain;
import exercicios_easy.Exec2;
import exercicios_easy.Exec3_1;
import exercicios_easy.Exec4;
import exercicios_easy.Exec5;
import exercicios_medium.Exec1;

public class Execucao {
    public static void main(String[] args) {
        Exec5 exec5 = new Exec5();
        int num1 = 3, num2 =3, num3 = 3;
        System.out.println("A soma é " +exec5.somar(num1,num2,num3));
        System.out.println("A sub é " +exec5.sub(num1,num2,num3));
        System.out.println("A mult é " +exec5.mult(num1,num2,num3));
        System.out.println("A media é " +exec5.media(num1,num2,num3));
//        Exec4 exec4 = new Exec4();
//        System.out.println("O dobro é: " + exec4.calcularDobro(10));
//        Exec1 exec1 = new Exec1();
//        exec1.exibirParImpar();

//        String valor;
//        Exec3_1 exec3_1 = new Exec3_1();
//        valor = exec3_1.inverterNomes("Silas", "Leão");
//        System.out.println(valor);
//        Exec2 exec2 = new Exec2();
//        System.out.println(exec2.exibirPalavra("TESTE"));
//        Caneta caneta = new Caneta();
//        caneta.inserirMarca("Palmeirex");
//        caneta.trocaCor("ROSA");
//        System.out.println("Cor Atual " + caneta.mostrarCorAtual());
//        caneta.rabiscar();
//        caneta.pintar();
//        caneta.escrever("Aula de Automação");
    }
}
