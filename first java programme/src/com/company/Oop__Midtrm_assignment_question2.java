package com.company;
class Book{

   private String Book;
   private String ISBN;
   private String author;
   private String publisher;
   private double price;
    Book(String author,String publisher,double price,String Book,String ISBN){
        this.Book=Book ;
        this.ISBN=ISBN ;
        this.author=author;
        this.publisher=publisher;
        this.price=price;
    }
    public String getBook() {
        return Book;
    }

    public void setBook(String book) {
        Book = book;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void Update_price(){
        if (price<=200){
            double p = price*5/100 ;
            System.out.println("you got 5% discount .Now avaible price is %d  "+(price-p) +"Taka");

        }
        else {
           double p =price*3/100 ;
            System.out.println("you got 3% discount .Now avaible price is  "+(price-p) +"Taka");
        }
    }

    public void display() {
        System.out.println(" Book=" + Book+"\n ISBN=" + ISBN + "\n Author=" + author + "\n Publisher=" + publisher  + "\n Price=" + price +" Taka" );
        Update_price();
    }


}
public class Oop__Midtrm_assignment_question2 {
    public static void main(String[] args) {
        Book []arr ;
        arr = new Book[10];
        arr[0]= new Book("Tanzir Ahmed","Tastec",250,"LOve","12345678");
        arr[1]= new Book("Tanzira Ahmed","Tastec",300,"MAN KIND","98345678");
        arr[2]= new Book("Tanzil Ahmed","Tastec",400,"BELIEVE","12346767");
        arr[3]= new Book("Tanzid AHmed","Tastec",150,"HONESTY","32145678");
        arr[4]= new Book("Tanzim AHmed","Tastec",500,"BAD LIAR","21345678");
        arr[5]= new Book("Tafcher AHmed","Tastec",100,"AVENGERS","23145678");
        arr[6]= new Book("Rokiya AHmed","Tastec",50,"CAPTAIN AMIRICA","43245678");
        arr[7]= new Book("Shahanara AHmed","Tastec",500,"IRON MAN ","34545678");
        arr[8]= new Book("Sofiullah AHmed","Tastec",100,"THOR","63445678");
        arr[9]= new Book("Shamima AHmed","Tastec",100,"SPIDER MAN ","8765678");
        arr[0].display();
        arr[1].display();
        arr[2].display();
        arr[3].display();
        arr[4].display();
        arr[5].display();
        arr[6].display();
        arr[7].display();
        arr[8].display();
        arr[0].display();


    }
}

