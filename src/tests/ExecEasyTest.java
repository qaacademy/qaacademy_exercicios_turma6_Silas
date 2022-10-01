package tests;

import exercicios_easy.Exec2;
import exercicios_easy.Exec4;
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
     public void testeDobro(){
         Exec4 exec4 = new Exec4();
        int dobro =  exec4.calcularDobro(5);
        assertEquals("O dobro é invalido",10,dobro);
     }


}
