
package service;

import entidad.Libro;
import java.util.Scanner;


public class BookService {
     Scanner leer = new Scanner(System.in);
    Libro LibroUno = new Libro();
//metodo cargar libro
    public Libro cargarLibro(){
        
   
    
        System.out.println("Ingrese los datos del libro");
        System.out.println("");
        
        System.out.println("Ingrese el isbn");
        LibroUno.setIsbn(leer.nextInt());
        System.out.println("Ingrese el titulo del libro");
        LibroUno.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        LibroUno.setAutor(leer.next());
        System.out.println("Ingrese el numero de pagina");
        LibroUno.setNumpagi(leer.nextInt());
        
    return null;
    
    }
   //metodo mostrar libro
    
    public Libro mostrarLibro(){
        System.out.println("El isbn del libro es: " + LibroUno.getIsbn());
        System.out.println("El titutlo del libro es: " + LibroUno.getTitulo());
        System.out.println("El autor del libro es: " +  LibroUno.getAutor());
        System.out.println("El numero de pagina es: " + LibroUno.getNumpagi());
    
        return null;
    
    
    }
}
