package com.pateche;

import java.util.List;
import java.util.stream.Collectors;

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


    // 8. Metodo que simula un retraso y retorna un mensaje
    public String mensajeConRetraso() throws InterruptedException {
        Thread.sleep(5000);
        return "Listo después de retraso";
    }

    // 9. Metodo para convertir una lista de enteros a lista de strings

    public List<String> convertirAString(List<Integer> lista) {

        return lista.stream().map(String::valueOf)// Convierte cada valor en un String
                .collect(Collectors.toList());// Recolecta el resultado en una lista


    }

    // 10. Metodo que calcula la media de una lista de enteros
    public double calcularMedia(List<Integer> lista) {
        //Metodo implementando puramente programacion funcional

        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser nula o vacia");
        }

        return lista.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        //Paradigma imperativo y algo funcional

//        int contador = 0;
//        for (int i = 0; i < lista.size(); i++) {
//            contador += lista.get(i);
//            System.out.println("Valor actual del contador:" + contador);
//        }
//
//        int cantNotas = (int) lista.stream().count();//Obtengo la cantidad de notas almacenada en la lista y obtengo el valor entero
//
//        double result = (contador / cantNotas);//Operacion en la cual divido lo que se guardo en el contador por la cantidad de notas
//
//        return result;//Imprimo el resultado de la operacion


    }

}


// 11. Metodo para convertir una lista de enteros a lista de strings



