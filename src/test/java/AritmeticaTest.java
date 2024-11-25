import com.pateche.Aritmetica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AritmeticaTest {

//    @Test //El metodo fail(String)hace fallar el test.
//    public void testSuma(){
//        fail("Not yet implemented");
//    }


    @Test
    @DisplayName("2 + 1 = 3")
    public void testSuma() {
        Aritmetica aritmetica = new Aritmetica();//Creo un objeto aritmetica
        assertEquals(3, aritmetica.suma(2, 1));


    }

    @Test
    @DisplayName("20 - 10 = 10")
    public void testResta() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(10, aritmetica.resta(20, 10));

    }

    @Test
    @DisplayName("100 * 100 = 10.000")
    void testMultiplicar() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(10000F, aritmetica.multiplicar(100, 100));

    }

    @Test
    @DisplayName("150 / 12 = 12.5")
    void testDivision() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(12.5f, aritmetica.division(150, 12));
    }

}
