package gh;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Funcionalidad para agregar un libro
    public void addBook(Book book) {
    	if(books.contains(book)) {
    		System.out.println("Ya existe el libro");
    	}
        
    	else{
    		books.add(book);
    	}
        System.out.println("Libro agregado: " + book);
    }

    // Funcionalidad para listar todos los libros
    public void listBooks() {
        System.out.println("Lista de libros:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Funcionalidad para buscar un libro por título
  
    public Book findBook(String title, String author){
       for (Book book: books) {
           if (title != null && author != null){
              if( book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)){
                  return book;
               }
             }
        else if (title != null) && book.getTitle().equalsIgnoreCase(title)) {
            return book;
        else if(author !=null) && book.getAuthor(). equalsIgnoreCase(author)){
            return book;

       }

     }

     return null;
}

