package exemplos;

public class MetodosComParametrosMain {

    public static void main(String[] args) {
//        soma(10,8);
//        sub(10,8);
//        escreverNomeSobrenome("Silas","Leão");
//        String corJuntas =  juntarCores("Azul","Amarelo");
//        System.out.println(corJuntas);
       // System.out.println(calcularPorcetagemPor100(50));
        int[] x = criarVetorNumero(10,20);
        System.out.println(x[0] +" "+ x[1]);
    }
    public static void soma(int num1, int num2){
        System.out.println("A Soma é" + (num1+num2));
    }

    public static void sub(int num1, int num2){
        System.out.println("A subtração é" + (num1-num2));
    }

    public static void escreverNomeSobrenome(String nome, String sobreNome){
        System.out.println("O nome é: " + nome + sobreNome);

    }

    public static String juntarCores(String cor1, String cor2){
        return cor1+cor2;
    }

    public static double calcularPorcetagemPor100(double num1){
        return num1/100;
    }

    public static int[] criarVetorNumero(int num1, int num2){
        int[] vetor = new int[2];
        vetor[0] = num1;
        vetor[1] = num2;
        return vetor;
    }
}
