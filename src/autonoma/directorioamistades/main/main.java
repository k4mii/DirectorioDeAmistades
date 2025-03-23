/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.directorioamistades.main;

import autonoma.directorioamistades.models.Amigo;
import autonoma.directorioamistades.models.DirectorioDeAmistades;

/**
 *
 * @author PABLO VI
 */
public class main {
    public static void main(String[] args) {
        DirectorioDeAmistades directorio = new DirectorioDeAmistades();

        Amigo amigo1 = new Amigo("Juan Perez", 606123456, "juan@tin.com");
        Amigo amigo2 = new Amigo("María Gomes", 301654321, "maria@tan.com");

        directorio.agregarAmigo(amigo1);
        directorio.agregarAmigo(amigo2);

        System.out.println("Informacion correcta:");
        directorio.verInfoAmigo("maria@tan.com");
        directorio.verInfoAmigo("juan@tin.com");
        directorio.eliminarAmigo("juan@tin.com");
        
        
        System.out.println("Informacion erronea:");
        
        
        directorio.eliminarAmigo("juan@t.com");
        directorio.verInfoAmigo("maria@e.com");
        directorio.verInfoAmigo("maria.com");

        

        System.out.println("Acerca de: ");
        directorio.mostrarAcercaDe();
    }
}
