/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author ulacit
 */
public class Usuario {
    public Usuario(){
        
    }
    private String Lista;
    private String Nombre;
    String Edad;

    public Usuario(String Nombre, String Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public Usuario(String Lista) {
        this.Lista = Lista;
    }

    public String getLista() {
        return Lista;
    }

    public void setLista(String Lista) {
        this.Lista = Lista;
    }
    
    
}
