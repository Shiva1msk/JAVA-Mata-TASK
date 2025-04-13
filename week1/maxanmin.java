package week1;

import java.util.Scanner;

public class maxanmin {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
       System.out.println("enter numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
        int large=arr[0];
        int small=arr[0];
        int temp=0;
        for (int i = 0; i <5; i++) {
           if(large<arr[i]){
            temp=large;
            large=arr[i];
            arr[i]=temp;
           } 
           if(small>arr[i]){
             temp=small;
            small=arr[i];
            arr[i]=temp;
           }

        }
        System.out.println(small+"is smallest element");
        System.out.println(large+"is largest element");

    }
}
