/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Usuario
 */
public class MainHilos {

    public static void main(String[] args) {
//        Corredor c10 = new Corredor(10);
//        Corredor c3 = new Corredor(3);
//        Corredor c1 = new Corredor(1);
//        Corredor c5 = new Corredor(5);
//
//        Thread h1 = new Thread(c10);
//        Thread h2 = new Thread(c3);
//        Thread h3 = new Thread(c1);
//        Thread h4 = new Thread(c5);
//
//        h1.start();
//        h2.start();
//        h3.start();
//        h4.start();
//        

        Carro ca10 = new Carro(10);
        Carro ca3 = new Carro(3);
        Carro ca1 = new Carro(1);
        Carro ca5 = new Carro(5);

        Thread h1 = new Thread(ca10);
        Thread h2 = new Thread(ca3);
        Thread h3 = new Thread(ca1);
        Thread h4 = new Thread(ca5);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        System.out.println("");

    }

}
