import com.pateche.Example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

public class ExampleTest {


    @Test
    void testSumar() {

        Example example = new Example();

        int numberA = 30;
        int numberB = 30;

        int result = example.sumar(numberA, numberB);

        assertNotNull(result);
        assertEquals(60, result);


    }

    @Test
    void testCheckPositivo() {

        Example example = new Example();

        int number = 10;

        boolean result = example.checkPositivo(number);

        assertTrue(result);


    }

    @Test
    public void testCheckPositivoError() {

        Example example = new Example(); //Instancia de la clase Example

        int numero = 10;

        boolean result = example.checkPositivo(numero);

        //Metodo para verificar que se lance una excepcion. Pasamos number como argumento al metodo checkPositivo
//        assertThrows(IllegalArgumentException.class, () -> {
//            example.checkPositivo(number);
//        });

        //Nota: si se lanza la excepcion el test pasa, si no se lanza el test falla.

    }

    @Test
    public void testContieneElemento() {

        Example example = new Example();

        // Given
        List<String> apellidos = Arrays.asList("Jobs", "Tolvards", "Gosling");
//        String elemento = "Jobs";

        // When
        boolean result = example.contieneElemento(apellidos);
        System.out.println("¿Contiene 'Jobs'? " + result);

        // Then
        assertTrue(result);


    }

    @Test
    @DisplayName("Pasamos un texto y deberia devolver el mismo al reverso")
    public void testRevertirCadena() {
        // Given
        Example example = new Example();
        String cadena = "James Gosling is truly Amazing";

        // When
        String result = example.revertirCadena(cadena);

        // Then
        assertNotEquals("James Gosling is truly Amazing", result);
//        System.out.println(result);
    }


    @Test
    public void testCalculaFactorial() {

        // Given
        Example example = new Example();
        int n = 6;

        //When
        int result = example.calculaFactorial(n);

        //Then
        assertEquals(720, result);


    }

    @Test
    public void testCalculaFactorialError() {

        // Given
        Example example = new Example();

        int n = -6;

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.calculaFactorial(n);
        });

    }

    @Test
    public void testVerificarEsPrimo() {

        Example example = new Example();

        int number = 3;

        boolean result = example.verificarEsPrimo(number);

        assertTrue(result);


    }

    @Test
    public void testVerificarEsPrimoError() {

        Example example = new Example();
        // Given
        int number = 4;

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.verificarEsPrimo(number);
        });

    }


}

