/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Listas {
    public static void main(String[] args) {
        
    
//Ejercicio 4
//Programa que declare una lista y la vaya llenando de números hasta que introduzcamos un número negativo. 
//Entonces se debe imprimir el vector (sólo los elementos introducidos).

    
    // Declaramos una lista con capacidad máxima  100 números
    double[] listaNumero = new double[100];
    int contador = 0; // Contador de números válidos ingresados

    System.out.println("Ingresa números (termina al ingresar un número negativo):");

    // Bucle para leer números hasta que se ingrese uno negativo
    while (true) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número:"));

        if (numero < 0) {
            break; // Salimos si es negativo
        }

        listaNumero[contador] = numero; // Guardamos el número
        contador++; // Aumentamos el contador
    }

    // Mostramos solo los números que se ingresaron (hasta 'contador')
    System.out.print("Números ingresados: ");
    for (int i = 0; i < contador; i++) {
        System.out.print(listaNumero[i]);
        if (i < contador - 1) {
            System.out.print(", ");
        }
    }
        System.out.println("\n");
        
//Ejercicio 5
//Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), 
//y posterior ordene los elementos de menor a mayor.

 // Declarar e inicializar lista con 10 números aleatorios enteros del 1 al 100
        int[] lista = new int[10];
        
        System.out.println("Números generados:");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int)(Math.random() * 100) + 1; // 1 a 100
            System.out.print(lista[i] + " ");
        }
        System.out.println(); // Salto de línea
        
        // Ordenamiento comparar elementos vecinos y ordenar de menor a mayor
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - 1 - i; j++) {
                if (lista[j] > lista[j + 1]) {
                    // Intercambiar
                    int valorTemp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = valorTemp;
                }
            }
        }
        
        // Mostrar lista ordenada
        System.out.println("Números ordenados de menor a mayor:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
           System.out.println("\n");

//Ejercicio 6
//Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y 
//diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar listas. 
//Para simplificarlo vamos a suponer que febrero tiene 28 días.

 // Listas: una para nombres de meses, otra para días
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        
        int[] diasMeses = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        
        // Pedir número de mes
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del mes (1-12):"));
        
        // Validar que esté entre 1 y 12
        if (mes >= 1 && mes <= 12) {
            // Mostrar resultado restamos 1 porque los arreglos empiezan en 0
            System.out.println("Mes: " + nombresMeses[mes - 1]);
            System.out.println("Días: " + diasMeses[mes - 1]);
        } else {
            System.out.println("Número de mes inválido. Debe estar entre 1 y 12.");
        }
           System.out.println("\n");

//Ejercicio 7
//Programa que declare tres listas ‘lista1’, ‘lista2’ y ‘lista3’ de cinco enteros cada uno, 
//pida valores para ‘lista1’ y ‘lista2’ y calcule lista3=lista1+lista2.

  // Declarar las tres listas de 5 enteros
        int[] lista1 = new int[5];
        int[] lista2 = new int[5];
        int[] lista3 = new int[5];
        
        // Leer valores para lista1
        System.out.println("Ingrese 5 valores para la lista 1:");
        for (int i = 0; i < 5; i++) {
            lista1[i] = Integer.parseInt(JOptionPane.showInputDialog("Lista1 - Posición " + i + ":"));
        }
        
        // Leer valores para lista2
        System.out.println("Ingrese 5 valores para la lista 2:");
        for (int i = 0; i < 5; i++) {
            lista2[i] = Integer.parseInt(JOptionPane.showInputDialog("Lista2 - Posición " + i + ":"));
        }
        
        // Calcular lista3: suma elemento a elemento
        for (int i = 0; i < 5; i++) {
            lista3[i] = lista1[i] + lista2[i];
        }
        
        // Mostrar resultados
        System.out.println("Lista 1: ");
        for (int n : lista1) System.out.print(n + " ");
        System.out.println();
        
        System.out.println("Lista 2: ");
        for (int n : lista2) System.out.print(n + " ");
        System.out.println();
        
        System.out.println("Lista 3 (suma): ");
        for (int n : lista3) System.out.print(n + " ");
        System.out.println("\n");
    


    }
}
