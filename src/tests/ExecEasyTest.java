package tests;

import exercicios_easy.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExecEasyTest {
     String teste;
    @Test
     public void testeDeJuncaoPalavra(){
        Exec2 exec2 = new Exec2();
        String retorno = exec2.exibirPalavra("Bolsolula");
        assertEquals("O texto é: Bolsolula", retorno);
     }
     @Test
     public void testaTrocaPalavra(){
         Exec3_1 exec3_1 = new Exec3_1();
         String result = exec3_1.inverterNomes("Silas", "Leao");
        assertEquals("O nome é: LeaoSilas",result);
     }
      @Test
     public void testeDobro(){
         Exec4 exec4 = new Exec4();
        int dobro =  exec4.calcularDobro(15);
        assertEquals("O dobro é invalido",30,dobro);
     }
     @Test
     public void testeMatematico(){
         Exec5 exec5 = new Exec5();
         int result = exec5.somar(10,5,10);
         assertEquals(25, result);
         int result1 = exec5.sub(10,5,10);
         assertEquals(-5, result1);
         int result2 = exec5.mult(10,5,10);
         assertEquals(500, result2);
         int result3 = exec5.media(10,5,10);
         assertEquals("Media invalida ",8, result3);
     }

     @Test
    public void testarMedia(){
         Exec6 exec6 = new Exec6();
         assertEquals("Media invalida", "Aprovado",exec6.calcularMedia(10,10) );
         assertEquals("Media invalida", "Reprovado",exec6.calcularMedia(2,2) );
         assertEquals("Media invalida", "Exame",exec6.calcularMedia(5,5) );
     }

     @Test
    public void calcularInss(){
        Exec7 exec7 = new Exec7();
        String result = exec7.calcularInss(2000);
        assertEquals("inss invalido","O inss é: 180.0",result);
     }

     @Test
    public void testImposto(){
        Exec8 exec8 = new Exec8();
        String result = exec8.calcularImposto(1000);
        assertEquals("Salario invalido", "Isento de imposto de renda",result);
         String result1 = exec8.calcularImposto(3000);
         String esperado = "Salario Bruto:  "+ 3000.0 + " - Salario Liquido:  " +  2904.8 + " - Imposto a pagar:  " +  95.19999999999999;
         assertEquals("Salario invalido", esperado,result1);
     }
     @Test
    public void testValorJuros(){
        Exec10 exec10 = new Exec10();
       String result =  exec10.calcularInvestimento(1000);
       String esperado = "Valor dos juros "+ 500.0 + " Valor investimento " + 1000.0 + " Valor total " + 1500.0 ;
       assertEquals(esperado,result);
     }

     @Test
    public void testSoma(){
        Exec11 exec11 = new Exec11();
        String result = exec11.somaais2Cemvezes(0);
        assertEquals("A soma é 200", result);
     }

}
