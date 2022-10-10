// TODO : from numbers ranging from 2 to n-1 check if prime or not;
import java.util.*;


public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        for( i= 2 ; i<n ; i++){
            if(n%i == 0){
                System.out.println("not prime");
                break;
            }
           
        }
        if(i == n){
            System.out.println(i);
            System.out.println("Prime number");
        }
        
       sc.close(); 
    }
}
