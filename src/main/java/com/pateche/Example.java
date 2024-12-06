package com.pateche;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

    // 1. Método para sumar dos números.
    public int sumar(int a, int b) {
        return a + b;
    }

    // 2. Metodo que lanza una excepcion si el argumento es negativo.
    public Boolean checkPositivo(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El numero no puede ser negativo");
        } else {
            return true;
        }
    }

    // 3. Metodo para contar el numero de letras 'a' en una cadena
    public int contarLetrasA(String cadena) {
        return (int) cadena.toLowerCase()//Convierto a minuscula
                .chars()//Convierte la cadena en un flujo de enteros
                .filter(s -> s == 'a')//Filtro por la letra especificada
                .count();//Cuento la cantidad de letras que aparecen

    }

    // 4. Metodo que retorna el valor booleano si la lista contiene el elemento
    public Boolean contieneElemento(List<String> apellidos) {


        return apellidos.contains("Jobs");


    }


    // 5. Metodo para revertir una cadena
    public String revertirCadena(String cadena) {

        return new StringBuilder(cadena).reverse().toString();

    }

    // 6. Metodo que calcula el factorial de un numero n
    public int calculaFactorial(int n) {

        if (n <= 0) {
//            System.out.println("Debe ingresar un valor mayor que: " + n);
//            return n;
            throw new IllegalArgumentException("Debe ingresar un valor mayor que " + n);

        } else {

            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = result * i;
//                System.out.println(result + " es el valor de result");
            }
            System.out.println("El factorial de " + n + " es: " + result);
            return result;
        }

    }

    // 7. Metodo para verificar si un numero es primo
    public Boolean verificarEsPrimo(int number) {

        if (number % number == 0 && number % 1 == 0 && number % 2 == 0) {
            throw new IllegalArgumentException("El numero " + number + " no es primo");

        }
        return true;

    }


}

// 8. Metodo que simula un retraso y retorna un mensaje
// 9. Metodo para convertir una lista de enteros a lista de strings
// 10. Metodo que calcula la media de una lista de enteros
// 11. Metodo para convertir una lista de enteros a lista de strings



