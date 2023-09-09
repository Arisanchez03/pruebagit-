/**

 * Autora:Estefany Harisvet Sánchez Ortiz 
 * Matricula: 2213028278
 * 
 este código demuestra cómo utilizar la clase "Sistemavideo" para gestionar un inventario de películas, agregar películas, 
 darles calificaciones, simular rentas y mostrar información detallada sobre las películas en el inventario.
 */


public class ejemploSistemaPelicula {
    
    // hacemos una demosgtracion del sistema con las peliculas asignadas 
    public void ejecutar() {
        Sistemavideo sistemaPelicula = new Sistemavideo();

        // Agregar películas al catalogo junto con su respectiva clasificación 
        sistemaPelicula.agregarPelicula("Eterno resplandor de una mente sin recuerdos", "R");
        sistemaPelicula.agregarPelicula("Perros de Reserva", "R");
        sistemaPelicula.agregarPelicula("El Señor de los Anillos II: Las Dos Torres", "PG-13");
        sistemaPelicula.agregarPelicula("Star Wars Episodio III: La Venganza de los Sith", "PG-13");
        
        

        // Damos calificaciones a las peliculas que se agregaron anteriormente, esto ayudara a obtener su calificacion promedio 
        sistemaPelicula.calificarPelicula("Eterno resplandor de una mente sin recuerdos", 5);
        sistemaPelicula.calificarPelicula("Perros de Reserva", 4);
        sistemaPelicula.calificarPelicula("El Señor de los Anillos II: Las Dos Torres", 4);
        sistemaPelicula.calificarPelicula("Star Wars Episodio III: La Venganza de los Sith", 5);
        
        

        // simulamos la renta de las peliculas citando el titulo de la pelicula 
        sistemaPelicula.rentarPelicula("Star Wars Episodio III: La Venganza de los Sith");
        sistemaPelicula.rentarPelicula("Star Wars Episodio III: La Venganza de los Sith");
        sistemaPelicula.rentarPelicula("Perros de Reserva");
        sistemaPelicula.rentarPelicula("Star Wars Episodio III: La Venganza de los Sith");
        sistemaPelicula.rentarPelicula("Perros de Reserva");
        sistemaPelicula.rentarPelicula("Eterno resplandor de una mente sin recuerdos");
        sistemaPelicula.rentarPelicula("Eterno resplandor de una mente sin recuerdos");

        // Listamos el inventario de las peliculas 
        System.out.println("Inventario de Películas después de rentar 'Eterno resplandor de una mente sin recuerdos':");
        sistemaPelicula.mostrarCatalogoPeliculas();
    }
    
    // se encarga de ejecutrar el programa de ejemplo
    public static void main(String args[]) {
        ejemploSistemaPelicula Ejemploprueba = new ejemploSistemaPelicula();
        Ejemploprueba.ejecutar();
    }
 }
