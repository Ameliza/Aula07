
import com.sun.prism.impl.ps.CachingRoundRectRep;
import org.junit.Test;
import poo.Carro;

import static junit.framework.TestCase.assertEquals;

/**
 * Classe para realizar testes de unidade e verificar a corretude das soluções desenvolvidas pelos alunos
 *
 * Alguns exemplos de como usar JUnit podem ser obtidos aqui: https://github.com/junit-team/junit4/wiki/Assertions
 */
public class TesteDeValidacao {

    @Test
    public void exercicio01(){

        Carro c = new Carro();

        c.definirVelocidade(200);
        assertEquals("falha no Carro", (float)200, c.acelerar(200));
        assertEquals("falha no Carro", (float)0, c.acelerar(-200));
        assertEquals("falha no Carro", (float)-200, c.acelerar(-400));
        assertEquals("falha no Carro", (float)200, c.acelerar(600));
        c.definirVelocidade(-200);
        assertEquals("falha no Carro", (float)50, c.acelerar(250));
    }
}