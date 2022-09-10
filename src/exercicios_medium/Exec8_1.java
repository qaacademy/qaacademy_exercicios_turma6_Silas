package exercicios_medium;

import javax.swing.*;

public class Exec8_1 {
    public static void main(String[] args) {
        int num = 0;
        String meses[] = new String[12];
        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junho";
        meses[6] = "Julho";
        meses[7] = "Agosto";
        meses[8] = "Setembro";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês: "));
      int i = num-1;
       System.out.println("O Mês é: " + meses[i] );
    }
}
