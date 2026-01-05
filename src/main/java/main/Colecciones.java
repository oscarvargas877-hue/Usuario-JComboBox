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
public class Colecciones {
    public static void main(String[] args) {
        
        //    Ejercicio 1:
//Realizar un programa que inicialice una lista con 10 valores aleatorios (del 1 al 10) y posteriormente muestre en
//pantalla cada elemento de la lista junto con su cuadrado y su cubo.
        //CREAR LA LISTA
          double[] listaAleatorios = new double[10];
        //INICIALIZAR 
        for (int i = 0; i < 10; i++) {
            //AUXILIARES
            double cuadrado = 0;
            double cubo = 0;
            //uso de números randomicos
            listaAleatorios[i] = (int)(Math.random() * 10 + 1); 
            cuadrado = Math.pow(listaAleatorios[i], 2);
            cubo = Math.pow(listaAleatorios[i], 3);
            
            // Formateamos cada número a 2 decimales al imprimir
            System.out.println("Posición" + i + ":" + String.format("%.2f", listaAleatorios[i]) + "\n" //String forma para convertir a dos decimales
                    + "El número elevado al cuadrado es:" + String.format("%.2f", cuadrado) + "\n"
                    + "El número elevado al cubo es:" + String.format("%.2f", cubo));
        }
        System.out.println("\n");
//Ejercicio 2:
//Crea una lista e inicializala con 5 cadenas de caracteres leídas por teclado. 
//Copia los elementos de la lista en otra lista pero en orden inverso,
//y muestra sus elementos por la pantalla.
        int n = 4;
        String[] listados = new String[5];
        String[] Listauno = new String[5];
        String[] listaTres = new String[5];
        for (int i = 0; i < 5; i++) {
            Listauno[i] = JOptionPane.showInputDialog("ingrese una palabra");
            listados[n] = Listauno[i];
            n--;

        }
        int y = 0;
        for (String puntero : Listauno) {
            String reversa = "";

            for (int i = puntero.length() - 1; i >= 0; i--) {
                reversa += puntero.charAt(i);
            }
            listaTres[y] = reversa;
            y++;
            System.out.println("puntero:" + puntero + "\n" + "reversa:" + reversa);
        }

        for (String puntero : listados) {
            System.out.println("puntero2:" + puntero);

        }
        for (String puntero : listaTres) {
            System.out.println("puntero3:" + puntero);

        }


 //Ejercicio 3:
//Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno 
//(comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, 
//la nota más alta que ha sacado y la menor
        double[] listaNotas = new double[5];
        double prom = 0;
        double max = 0;
        double min = 10;
        for (int i = 0; i < listaNotas.length; i++) {
            listaNotas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota: "+(i+1)));
        }

      // Calcular promedio, máximo y mínimo 
    for (int i = 0; i < listaNotas.length; i++) {
        double nota = listaNotas[i];
        prom += nota;             // sumamos todas las notas

        // Comparamos para encontrar el máximo
        if (nota > max) {
            max = nota;
        }

        // Comparamos para encontrar el mínimo
        if (nota < min) {
            min = nota;
        }
    }

    // Al final, dividimos la suma total entre la cantidad de notas
    prom = prom / listaNotas.length;

    // Mostrar todas las notas
    String todasLasNotas = "Notas ingresadas: ";
    for (int i = 0; i < listaNotas.length; i++) {
        todasLasNotas += listaNotas[i];
        if (i < listaNotas.length - 1) {
            todasLasNotas += ", ";
        }
    }
    System.out.println(todasLasNotas);
    System.out.println("Nota media: " + prom);
    System.out.println("Nota más alta: " + max);
    System.out.println("Nota más baja: " + min);
    }
}
