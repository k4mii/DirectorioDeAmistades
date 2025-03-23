/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.directorioamistades.models;

/**
 *
 * @author PABLO VI
 */
public class Persona {
    private String nombres;
    private int telefono;
    private String correoElectronico;

    public Persona(String nombres, int telefono, String correoElectronico) {
        this.nombres = nombres;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public String getNombres() {
        return nombres;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}
