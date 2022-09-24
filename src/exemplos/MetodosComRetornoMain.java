package exemplos;

import javax.swing.*;

public class MetodosComRetornoMain {
    public static void main(String[] args) {
//        System.out.println(saoPaulo());
//        System.out.println(cotia());
//        System.out.println(itapevi());
//        System.out.println(barueri());
//        System.out.println(osasco());

        String text1 = saoPaulo();
        String text2 = barueri();
        String text3 = osasco();
        String text4 = itapevi();
        String text5 = cotia();
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
        System.out.println(text5);
    }

    public static String saoPaulo(){
        return "saoPaulo";
    }
    public static String cotia(){
        return "cotiabla";
    }
    public static String osasco(){
        return "osasco";
    }
    public static String barueri(){
        return "barueri";
    }
    public static String itapevi(){
        return "itapevi";
    }
}
