package week1;
public class laptop {
    String brand;
    String processor;
    int price;
    laptop(String brand,String processor,int price){
        this.brand=brand;
        this.processor=processor;
        this.price=price;   
    }
    void display(){
        System.out.println("Laptop brand "+brand+" processor "+processor+" price = "+price);
    }
    public static void main(String[] args) {
        laptop l=new laptop("dell","i5",50000);
        l.display();
    }
}
