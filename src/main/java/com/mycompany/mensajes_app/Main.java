/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author valde
 */
public class Main {
    public static void main(String[] args){
        Conexion conexion = new Conexion();
        try (Connection connection = conexion.get_connection()){
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    }
    
}
