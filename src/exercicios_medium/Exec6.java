package exercicios_medium;

//6-) Faça um algoritmo para ler um número inteiro, calcular e exibir o Fatorial do número digitado. Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3).. *(10-1) = 3.628.800
public class Exec6 {
    public static void main(String[] args) {
        int fat=10, i=0, fatFixo =0;
        i = fat;
        fatFixo =fat;
        while(i>1){
            fat = fat*(i-1);
                i--;
        }
        System.out.println("O fatorial de : " + fatFixo + " é "+ fat);
    }
}
