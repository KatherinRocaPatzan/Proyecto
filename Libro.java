package libro;

public class Libro {

    // Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;

    // Constructor sin parámetros
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.isbn = "000-0000000000";
        this.precio = 0.0;
    }
    // Constructor con parámetros
    public Libro(String titulo, String autor, String isbn, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }
    // Método para obtener los detalles del libro
    public String obtenerDetalles() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Precio: $" + precio;
    }

    // Método para actualizar el precio
    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear una instancia de la clase Libro usando el constructor sin parámetros
        Libro libro1 = new Libro();
        System.out.println("Detalles del libro 1: " + libro1.obtenerDetalles());

        // Crear una instancia de la clase Libro usando el constructor con parámetros
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", "123-4567890123", 15.99);
        System.out.println("Detalles del libro 2: " + libro2.obtenerDetalles());

        // Actualizar el precio del libro2
        libro2.actualizarPrecio(18.99);
        System.out.println("Detalles actualizados del libro 2: " + libro2.obtenerDetalles());
    }
    
}
