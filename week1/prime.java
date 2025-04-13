package week1;

import java.util.ArrayList;
import java.util.List;



public class prime {

    
    public static void main(String[] args) {
        
    
        int n =29*3;
        List s=new ArrayList();
        for(int i=2;i<=n;i++){
        if (prime1(i)) {
            // System.out.println(i + " is a prime number.");
            s.add(i);
            
            // arr[i]=i;
        } else {
            // System.out.println(i + " is not a prime number.");
        }
        // for ( i=0;i<n;i++) {
        //     System.out.println(arr[i]+i);
            
        // }
        // Print each element in the list
        // for (Object primeNumber : s) {
        //     System.out.println(primeNumber);
        // } 

        // Get value at a specific index
        // 
         }
         System.out.println(s);
         int index = 9; // Example index
         if (index < s.size()) {
             System.out.println("Value at index " + index + ": " + s.get(index));
         } else {
             System.out.println("Index out of bounds.");
         }
        // System.out.println(s.get(n));

}


    public static boolean prime1(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
