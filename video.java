/**

 * Autora:Estefany Harisvet Sánchez Ortiz 
 * Matricula: 2213028278
 -Clase video 
   Esta clase proporciona una estructura para representar películas con atributos como título, clasificación,
   contadores de rentas y calificaciones, además de métodos para acceder a estos atributos y registrar rentas y calificaciones. 

 */

public class video {
    // asignamos los atributos de clase 
    private String titulo; // el titulo se crea como tipo string 
    private String clasificacion; 
    private int contadorcalificaciones;// indica un contador de las calificaciones que ha recibido la pelicula 
    private double promedioCalificacion; //indica el promedio de calificaciones en base del contador 
    private int contadorRenta; //cuantifica cuantas veces se ha rentado una pelicula 
    
    // creamos el metodo contructor para la clase y se toman 2 strings 
    public video(String titulo, String clasificacion) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        // inicializamos los valores de los atributos de contadores en 0 
        this.contadorRenta = 0;
        this.contadorcalificaciones = 0;
        this.promedioCalificacion = 0;
    }

    // Método getter para poder accedar al valor del atributo titulo
    public String getTitulo() {
        return titulo;
    }
    
    // metodo getter para el atributo contador de renta
      public  int getcontadorRenta() {
        return contadorRenta; //Devuelve el valor actual del atributo "contadorRenta" de la instancia
    }
  
    
    // al igual que los metodos anterirores es un metodo getter para el atributo de la clase video 
    public int getcontadorcalificaciones() {
        return contadorcalificaciones; // devuelve el vqalor actual del atributo 
    }    
    
    
    public String getClasificacion() {
        return clasificacion;
    }


    public double getpromedioCalificacion() {
        return promedioCalificacion;
    }

    // Método para el proceso de renta de la pelicula 
    public void renta() {
        contadorRenta++; // incrementa el valor en el contador de las remntas de la pelicula 
    }

    // Creamos un metodo necesario para poder regitrar una calificación para la pelicula 
    public void calificacion(int calificacion) {
        // crea la condicion de la calificacion ya que esta debe de estar en un parametro de 1 y 5 
        if (calificacion >= 1 && calificacion <= 5) {
            promedioCalificacion = (promedioCalificacion * contadorcalificaciones + calificacion) / (contadorcalificaciones + 1);
            contadorcalificaciones++;
            // si la calificación es mayor o no esta dentro de los parametros establecidos, mandara un men saje de error para el usuario 
        } else {
            System.out.println("por favo, escoja una calificacion valida (entre 1 y 5):");
        }
    }
}