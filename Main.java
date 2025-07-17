import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        BookManager manager=new BookManager();
        int choice;
        do {
            System.out.println("1.Add Book");
            System.out.println("2.SearchByTitle");
            System.out.println("3.SearchByAuthor");
            System.out.println("4.UpdateBook");
            System.out.println("5.DeleteBook");
            System.out.println("6.DisplayAllBooks");
            System.out.println("7.Exit...");
            System.out.println("Enter choice");
            choice= sc.nextInt();
            switch (choice){

                case 1:
                    System.out.println("Enter id");
                    int id=sc.nextInt();
                    System.out.println("Enter title");
                    String title= sc.next();
                    System.out.println("Enter author");
                    String author=sc.next();
                    Book book=new Book(id,title,author);
                    manager.addBook(book);
                     break;
                case 2:
                    System.out.println("enter title");
                    String tile =sc.next();
                    manager.searchByTitle(tile);
                    break;
                case 3:
                    System.out.println("enter author");
                    String auth=sc.next();
                    manager.searchByAuthor(auth);
                    break;
                case 4:
                    System.out.println("Enter Id ");
                    int Id= sc.nextInt();
                    manager.updateBook(Id);
                    break;
                case 5:
                    System.out.println("Enter Id");
                    int ide=sc.nextInt();
                    manager.deleteBook(ide);
                    break;
                case 6:
                    manager.displayAllBooks();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice ");

            }

        }while (choice!=7);
    }
}