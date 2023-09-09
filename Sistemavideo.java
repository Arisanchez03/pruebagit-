/**

 * Autora:Estefany Harisvet Sánchez Ortiz 
 * Matricula: 2213028278
 -Clase Sistemavideo
   Actúa como un sistema de gestión para un inventario de películas.
 */

import java.util.ArrayList;
import java.util.List;

public class Sistemavideo {
    // se crea un nuevo atributo "inventario" donde se almacenaran los registros de las peliculas 
    private List<video> inventario;
          
    // creamos un nuevo constructor para la clase 
    public Sistemavideo() {
        inventario = new ArrayList<>(); // inicializa el inventario como una lista vacia para poder almacenar peliculas despues 
    }

    //Creamos un nuevo metodo para poder hacer el proceso de busqueda de pelicula en el inventario 
    private video buscarPelicula(String titulo) {
        
        for (video pelicula : inventario) {
            if (pelicula.getTitulo().equals(titulo)) {
                return pelicula; // si encuentra el valor solicitado, devuelve el nombre de la pelicula 
            }
        }
        return null; // Si no se encuentra la película dentro del inventario se devuelve null.
    }
    
    // se crea un metodo para eliminar una pelicula del inventario 
    public void eliminarPelicula(String titulo) {
        // para esto tambien hace uso del buscar pelicula, si encuentra el titulo se elimina 
        video pelicula = buscarPelicula(titulo);
        if (pelicula != null) {
            inventario.remove(pelicula); // elimina el parametro solicitado 
        }
    }
    
    // Proceso para poder agregar una pelicula 
    public void agregarPelicula(String titulo, String clasificacion) {
        video pelicula = new video(titulo, clasificacion); // solicita los parametros de itulo y clasificacion
        inventario.add(pelicula); //agrega los parametros al inventario 
    }

    // Método para poder registrar una nueva renta a una pelicula en el sistema 
    public void rentarPelicula(String titulo) {
        video pelicula = buscarPelicula(titulo); // usa el metodo buscar pelicula para poder encontrar el titulo solicitado 
        if (pelicula != null) {
            pelicula.renta(); // llama al metodo rentar para poder aumentar el contador de las rentas 
        }
    }

    // Método para recibir la calificación de la pelicula 
    public void calificarPelicula(String titulo, int calificacion) {
        video pelicula = buscarPelicula(titulo); // usa metodo buscar pelicula para poder encontrar la pelicula 
        if (pelicula != null) {
            pelicula.calificacion(calificacion); // llama al metodo calificacion para poder aumentar el contador 
        }
    }

    // Método para visualizar el promedio de calificacion con el que cuenta una pelicula 
    public double obtenerCalificacionPromedio(String titulo) {
        video pelicula = buscarPelicula(titulo); // busca la ṕelicula solicitada 
        if (pelicula != null) {
            return pelicula.getpromedioCalificacion(); //si la encuentra devuelve el valor del promedio 
        }
        return 0; // Si la película no existe, muestra 0 como calificación promedio.
    }

    // Método para mostrar un catálogo completo de las peliculas que se encuentran registradas en el sistema 
    public void mostrarCatalogoPeliculas() {
        
        // si el inventario se encuntra vacio, imprime un mensaje al ujsuario indicando que el inventario esta vacio 
        if (inventario.isEmpty()) {
            System.out.println("El inventario de películas está vacío.");
            return;
        }

        //si no mostrara el inventario de peliculas con todos sus atributos correspondientes 
        System.out.println("Catálogo de Películas:");
            for (video pelicula : inventario) {
                System.out.println("Título: " + pelicula.getTitulo());
                System.out.println("Clasificación: " + pelicula.getClasificacion());
                System.out.println("Calificación Promedio: " + pelicula.getpromedioCalificacion());
                System.out.println("Veces que ha sido rentada : " + pelicula.getcontadorRenta());
                System.out.println("-----------------------------------");
        }
    }
}