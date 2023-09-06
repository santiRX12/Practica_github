
package entidad;


public class Libro {
    //Atributos de las clases
    
    private  int isbn;
    private String titulo;
    private String autor;
    private int numpagi;
    
    // se crea el contructor 

    public Libro(int isbn, String titulo, String autor, int numpagi) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numpagi = numpagi;
    }
    
    //constructor vacio
    
    public Libro() {
    }
    
    //se crean los get

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumpagi() {
        return numpagi;
    }
    
    //se crean los set

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumpagi(int numpagi) {
        this.numpagi = numpagi;
    }
    
    
    
    
    
}
