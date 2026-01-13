/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Usuario
 */
public class EjemploFichero {
    public static void main(String[] args) {
     try{
      //crear un fileWriter para escribir en el fichero 
      FileWriter writer = new FileWriter ("mi_archivo.txt");
      writer.write("Hola mundo Java");
      writer.close();
      
      //Crear un fileReader pra leer el fichero 
      FileReader reader = new FileReader ("mi_archivo.txt");
      BufferedReader BufferedReader = new  BufferedReader (reader);
      String linea;
      while((linea = BufferedReader.readLine())!=null){
          System.out.println(linea);
          
      }
      BufferedReader.close();
      reader.close();
     
     }catch (IOException e){
         System.out.println("Error " + e.getMessage());
     
     }
    }
    
}
