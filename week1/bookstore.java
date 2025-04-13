package week1;
public class bookstore {
    
        String title;
        String author;
        int price;
        void display(){
            System.out.println("Title of the book "+title+" authour "+author+" and price "+price+"$");
        }
    

    
    public static void main(String[] args) {
        bookstore b=new bookstore();

        b.title="atomic habits";
        b.author="james clear";
        b.price=50;
        b.display();

        }
    }