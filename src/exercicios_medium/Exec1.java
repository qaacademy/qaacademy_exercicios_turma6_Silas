package exercicios_medium;

//1-) Faça um algoritmo para verificar e exibir de 0 a 100, quais são os números Pares e ímpares.
public class Exec1 {
    private String teste;
    public static void main(String[] args) {
        int i = 0;
        while (i<=100){
            if(i % 2 ==0){
                System.out.println(i % 2);
                System.out.println("O numero é : "+ i + " é par");
            }else{
                System.out.println(i % 2);
                System.out.println("O numero é : "+ i + " é impar");
            }
            i++;
        }
    }
}
