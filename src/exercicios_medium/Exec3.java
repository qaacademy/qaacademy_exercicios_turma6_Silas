package exercicios_medium;

//3-) Faça um algoritmo para calcular e exibir a soma de todos os números de 0 a 1000. E parar se caso a soma atingir 1500(Ou mais).
//EX: 0 +1, 1+2, 3+4.. 1500
public class Exec3 {
    public static void main(String[] args) {
        int soma =0 , i = 0;
        while (i <=1000){
            soma = soma+i;
            if (soma >=1500){
                break;
            }
            System.out.println(soma);
            i++;
        }
    }
}
