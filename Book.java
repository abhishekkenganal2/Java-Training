import javax.swing.plaf.synth.SynthStyleFactory;

public class Book {
    int bookid = 123;
    String bname = "java";
    double price = 500;
    String author = "James grossling";
    Book()
    {}
    Book(int bookid,String bname,String author){
        this.bookid = bookid;
        this.bname = bname;
        this.author = author;
    }
    Book(int bookid,String bname){
        this.bookid = bookid;
        this.bname = bname;
    }
    public void display() {
        System.out.println(bname);
        System.out.println(bookid);
        System.out.println(price);
        System.out.println(author);
    }
}


public class BookDriver
{
    public static void main(String[] args) {
        Book b1 = new Book();
        
    }
}