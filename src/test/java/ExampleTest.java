import com.pateche.Example;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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


    @Test
    public void testMensajeConRetraso() throws InterruptedException {

        Example example = new Example();
        System.out.println("Inicio ejecucion mensaje: " + LocalTime.now());

        // When
        String result = example.mensajeConRetraso();


        // Then
        assertEquals("Listo después de retraso", result);
        System.out.println("Fin ejecucion mensaje " + LocalTime.now());
    }


    @Test
    public void testConviertirAString() {

        // Given
        Example example = new Example();

        List<Integer> numbers = List.of(2, 4, 6, 8, 10);

        // When
        List<String> result = example.convertirAString(numbers);

        // Then
        assertEquals(List.of("2", "4", "6", "8", "10"), result);

        System.out.println(result);


    }


    @Test
    public void testCalcularMedia() {

        // Given
        Example example = new Example();

        List<Integer> numbers = List.of(1, 2, 3);

        // When
        double result = example.calcularMedia(numbers);

        // Then
        assertEquals(2.0, result);

        System.out.println(result);

    }

    @Test
    public void testCalcularMediaNull() {
        // Given
        Example example = new Example();

        //When - Then
        List<Integer> numbers = null;

        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(numbers);
        });


    }

    @Test
    public void testCalcularMediaEmpty(){

        // Given
        Example example = new Example();

        // When - Then
        List<Integer> numbers = List.of();

        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(numbers);
        });

    }

}

