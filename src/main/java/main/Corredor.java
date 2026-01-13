/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Usuario
 */
public class Corredor extends Thread {
private int numero;

    public Corredor() {
    }

public Corredor(int numero) {
    this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    @Override
    public void run() {
        System.out.println("Habilitado ejecucion en paralelo" + numero);
    }
    
    
}
