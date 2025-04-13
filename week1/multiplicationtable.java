package week1;
import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" X  "+i+"  = "+n*i);
        }
        sc.close();
    }
}
