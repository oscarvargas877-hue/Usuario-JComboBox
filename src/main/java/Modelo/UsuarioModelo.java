/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import BDD.ConexionBDD;


/**
 *
 * @author Usuario
 */


public class UsuarioModelo {
//ATRIBUTOS
    private int idUsuario;
    private String nombre;
    private String rol;

    public UsuarioModelo() {
    }

    public UsuarioModelo(int idUsuario, String nombre, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return"Datos del usuario"+"\n"+
                "Nombre:" + getNombre()+"\n"+
                "Rol: " + getRol();
    }
    
    //metodo insertar usuario
    
    public boolean guardar(){
        try{
            ConexionBDD conexionBDD = new ConexionBDD();
            java.sql.Connection conexion = conexionBDD.conectar();
            
            String sql = "INSERT INTO usuarios (nombre, rol) VALUES (?, ?)";
            java.sql.PreparedStatement pstmt = conexion.prepareStatement(sql);
            pstmt.setString(1, this.nombre);
            pstmt.setString(2, this.rol);
            pstmt.executeUpdate();
            
            pstmt.close();
            conexion.close();
            
            return true;
            
        } catch (Exception e){
            System.out.println("Error al guardar usuario: " + e.getMessage());
            return false;
        }
    }
    
    
    
            
    
}