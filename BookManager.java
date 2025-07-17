import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

ArrayList<Book> books=new ArrayList<>();
Scanner sc=new Scanner(System.in);

public void addBook(Book book){
    books.add(book);
    System.out.println("book added successfully");
}
public void searchByTitle(String title)
{boolean foud=false;
    for (Book book:books){
        if (book.getTitle().equalsIgnoreCase(title)){
            System.out.println(book);
            foud=true;
        }

    }if (!foud){
    System.out.println("no available");
    }
  }
  public void searchByAuthor(String author){
   boolean foud=false;
    for (Book book:books){
        if (book.getAuthor().equalsIgnoreCase(author)) {
            System.out.println(book);
            foud=true;

        }


    }if (!foud){
          System.out.println("not found ");
      }

  }
  public void updateBook(int id){
    boolean foud=false;
    for (Book book:books){
        if (book.getId()==id) {
            System.out.println("Enter new title");
            String tile = sc.next();
            System.out.println("Enter new Author");
            String auth = sc.next();
            book.setTitle(tile);
            book.setAuthor(auth);
            System.out.println("book updated successfully");
            foud=true;

        }

    }if (!foud){
          System.out.println("no found book");
      }
  }
  public void deleteBook(int id){
    boolean foud=false;
    for (Book book:books){
        if (book.getId()==id){
            books.remove(book);
            System.out.println("book deleted ");
            foud=true;
        }
        }if (!foud){
          System.out.println("Book not found ");
    }
  }
  public void displayAllBooks(){
    for (Book book:books){
        if (books.isEmpty()){
            System.out.println("Books are not to display");
        }else{
        System.out.println(book);
    }}
  }
}
