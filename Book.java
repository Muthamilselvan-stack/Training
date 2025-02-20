public class Book {
     public static void main(String[] args) 
     {
        Book myBook = new Book();
        myBook.display();
    
     }
     private String title;
     private double price;

     public Book() {
        title = "Java Programming";
        price = 100.0;
    }

     public void display(){
         System.out.println("Book Name: "+title);
         System.out.println("Book Price: "+price);
     }

  
}

