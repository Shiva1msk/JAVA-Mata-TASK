package week1;
public class rectangle {
    int length;
    int breadth;
    int areaofrectangle;
     int area(){
        areaofrectangle=length*breadth;
        return areaofrectangle;
    }
    void display(){
        System.out.println(" area of rectangle "+areaofrectangle);
    }
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.length=10;    
        r.breadth=20;
        r.area();   
        r.display();
    }

}
