package week1;


import java.util.Scanner;



public class swaptwonumbers {
    public static void main(String[] args) {
        
    
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a number");
    int a=sc.nextInt();
    System.out.println("enter b number");
    int b=sc.nextInt();
    
    a=a+b;
     b=a-b;
     a=a-b;
   
    System.out.println(a);
    System.out.println(b);

}
}
