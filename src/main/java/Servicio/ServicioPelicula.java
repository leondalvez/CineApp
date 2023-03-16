/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioPelicula {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public void crearPelicula(ArrayList<Pelicula> peliculas){
        String opcion;        
        do {
            System.out.println("Por favor ingrese el nombre de la película");
            String titulo = leer.next();
            System.out.println("Poe favor ingrese el nombre del director");
            String director = leer.next();
            System.out.println("Por favor ingrese la duración de la pelicula en "
                    + "horas");
            Double duracion = leer.nextDouble();
            Pelicula p = new Pelicula(titulo, director, duracion);
            peliculas.add(p);            
            System.out.println("Desea continuar?S/N");
            opcion = leer.next();            
        } while (opcion.equalsIgnoreCase("S"));
    }
}

