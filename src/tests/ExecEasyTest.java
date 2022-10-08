package tests;

import exercicios_easy.*;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExecEasyTest {

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
         assertEquals("Media invalida ",9, result3);
     }

     @Test
    public void testarMedia(){
         Exec6 exec6 = new Exec6();
         assertEquals("Media invalida", "Aprovado",exec6.calcularMedia(10,10) );
     }

}
