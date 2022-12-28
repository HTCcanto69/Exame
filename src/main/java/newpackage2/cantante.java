/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;

/**
 *
 * @author Usuario
 */
public class cantante {
 
    //Propiedades de la clase
    private String nombre;
 
    //Método constructor vacío
    public cantante() {
    }
 
    //Método constructor con parámetros
    public cantante(String nombre) {
        this.nombre = nombre;
    }
 
    //Método para obtener el nombre del cantante
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
 
    public String devolverCantante(){
    return "Nombre: " + nombre;
    }
}
