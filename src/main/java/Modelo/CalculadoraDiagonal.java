/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class CalculadoraDiagonal {
   // Verifica si un número entero es primo solo divisible por 1 y por sí mismo
    public boolean esPrimo(int numero) {
        if (numero < 2) return false; // Números menores que 2 no son primos 
        for (int i = 2; i <= Math.sqrt(numero); i++) { // Prueba divisores desde 2 hasta la raíz cuadrada del número
            //Math.sqrt: sirve para calcular la raíz cuadrada positiva de un número
            if (numero % i == 0) return false; // Si encuentra un divisor exacto, no es primo
        }
        return true; // Si no encontró divisores, sí es primo
    }

    // Verifica si un número es múltiplo de 2 es decir, si es par
    public boolean esMultiploDeDos(int numero) {
        return numero % 2 == 0; // Si el residuo al dividir entre 2 es 0, es par  múltiplo de 2
    }

    // Multiplica elementos de dos listas en forma diagonal: primero con último, segundo con penúltimo, etc.
    public Resultado[] multiplicarEnDiagonal(int[] lista1, int[] lista2) {
        int n = Math.min(lista1.length, lista2.length); // Toma la longitud de la lista más corta 
         //Math.min: sirve para obtener el valor más pequeño entre dos números
        Resultado[] resultados = new Resultado[n]; // Crea un arreglo para guardar los resultados

        for (int i = 0; i < n; i++) { // Recorre desde el primer elemento de lista1
            int num1 = lista1[i]; // Toma el elemento que esta en la posicion i número de la primera lista
            int num2 = lista2[lista2.length - 1 - i]; // Toma el elemento que esta en la posición i, número desde el final de la segunda lista
            int producto = num1 * num2; // Multiplica los dos números

            // Crea un objeto Resultado con los datos y verifica si el producto es primo y múltiplo de 2
            resultados[i] = new Resultado(num1, num2, producto, esPrimo(producto), esMultiploDeDos(producto));
        }

        return resultados; // Devuelve el arreglo con todos los resultados
    }

    // Clase interna que guarda toda la información de una operación 
    public static class Resultado {
        public int numero1, numero2, producto; // Los dos números multiplicados y su resultado
        public boolean esPrimo, esMultiploDeDos; // Indica si el producto es primo o múltiplo de 2

        // Constructor: asigna los valores al crear un nuevo Resultado
        public Resultado(int n1, int n2, int prod, boolean primo, boolean multiplo) {
            this.numero1 = n1; // Guarda el primer número
            this.numero2 = n2; // Guarda el segundo número
            this.producto = prod; // Guarda el resultado de la multiplicación
            this.esPrimo = primo; // Guarda si el producto es primo
            this.esMultiploDeDos = multiplo; // Guarda si el producto es múltiplo de 2
        }

    
        @Override
        public String toString() {
            return " " + numero1 + " x " + numero2 + " = " + producto +
                   "  Primo: " + esPrimo + ", Múltiplo de 2: " + esMultiploDeDos;
        }
    }
}
