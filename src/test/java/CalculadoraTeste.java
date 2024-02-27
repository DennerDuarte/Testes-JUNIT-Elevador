import fiap.com.br.Model.Calculadora;
import org.junit.Test;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTeste {
    //Instanciando a calculadora para utilizar a classe

    private Calculadora calc;

    @Before
    public void setUp() throws Exception{
        calc = new Calculadora();
        //Instanciando a classe soma para utilizar os metodos soma e subtrair
    }

    @Test
    public void TesteSomar30com12(){
        double soma = calc.somar(30.0,12.0);
        //Declarando variaveis que eu irei testar no metodo soma
        assertEquals(42.0, soma);
        //Realizando a comparação entre o valor esperado e o valor real
    }

    @Test
    public void TesteSubtrair19de8(){
        double subtrair = calc.subtrair(19.0,8.0);
        assertEquals(11,subtrair);
    }
}
