package week1;
import java.util.*;

public class ctof {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter celcius");
    float C=sc.nextFloat();
    float F = (C * 9/5) + 32;
    System.out.println(F);
   sc.close();
}
}
