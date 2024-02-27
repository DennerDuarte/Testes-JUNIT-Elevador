import fiap.com.br.Model.*;
import org.junit.Test;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ElevadorTeste {

    private Calculadora calc;
    private Elevador elevador;

    @Before
    public void setUp() throws Exception{
        calc = new Calculadora();
        elevador = new Elevador();
    }

    @Test
    public void TestarPeso100Com75(){
        elevador.setCargaAtual(100);
        //Settando peso do elevador atual
        Pessoa p = new Pessoa("Denner", 75.00);
        //Instanciando pessoa e seu peso
        elevador.setCargaAtual(elevador.entrarNoElevador(p.getPeso()));
        //Eu setto o valor da carga atual como a soma do peso elevador + o peso da pessoa

        assertEquals(175.00, elevador.getCargaAtual());
    }

    @Test
    public void TestarPeso100Menos75(){
        elevador.setCargaAtual(100);
        Pessoa p = new Pessoa("Denner", 75.00);
        elevador.setCargaAtual(elevador.sairDoElevador(p.getPeso()));

        assertEquals(25.00, elevador.getCargaAtual());
    }

    @Test
    public void TestarAvaliarPeso(){
        elevador.setCargaAtual(100);
        //Settando a carga no elevador
        Pessoa p = new Pessoa("NhoNho", 150.0);
        //settando o peso da pessoa
        elevador.setCargaAtual(elevador.entrarNoElevador(p.getPeso()));
        //settando o valor atual do elevador para realizar comparação
        boolean Alerta = elevador.avaliarPeso(elevador.getCargaAtual());
        // realizando o teste do Alert para avaliar pesoa(Neste caro, true está certo)
        assertTrue(Alerta);
    }
}
