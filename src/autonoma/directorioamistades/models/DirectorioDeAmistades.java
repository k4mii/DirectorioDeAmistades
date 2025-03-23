/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.directorioamistades.models;

/**
 *
 * @author PABLO VI
 */
import java.util.ArrayList;
import java.util.List;

public class DirectorioDeAmistades {
    private List<Amigo> amigos;

    public DirectorioDeAmistades() {
        this.amigos = new ArrayList<>();
    }

    public void agregarAmigo(Amigo a) {
        //Verificacion (? excepción (?
        amigos.add(a);
    }

    public Amigo buscarAmigo(String correo) {
        //Excepción (?
        for (Amigo amigo : amigos) {
            if (amigo.getCorreoElectronico().equals(correo)) {
                return amigo;
            }
        }
        return null;
    }

    public void verInfoAmigo(String correo) {
        Amigo amigo = buscarAmigo(correo);
        if (amigo != null) {
            System.out.println("Nombre: " + amigo.getNombres());
            System.out.println("Teléfono: " + amigo.getTelefono());
            System.out.println("Correo Electrónico: " + amigo.getCorreoElectronico());
        } else {
            System.out.println("Amigo no encontrado.");
        }
    }

    public void eliminarAmigo(String correo) {
        amigos.removeIf(amigo -> amigo.getCorreoElectronico().equals(correo));
    }

    public void mostrarAcercaDe() {
        System.out.println("Taller Directorio de amistades - Programación orientada a Objetos - Universidad Autonoma de Manizales");
        System.out.println("Desarrollado por: Maria Camila Prada Cortes - Johan Andrés Villada Valencia");
    }
}
