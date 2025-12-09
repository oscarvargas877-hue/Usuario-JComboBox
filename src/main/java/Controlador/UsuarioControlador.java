/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.UsuarioModelo;





/**
 *
 * @author Usuario
 */

public class UsuarioControlador {
    public boolean guardarUsuario(UsuarioModelo usuario){
        return usuario.guardar();
    }
  
}
