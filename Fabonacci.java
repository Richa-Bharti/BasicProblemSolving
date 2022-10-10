package Classfile.Recursion;
import java.util.*;
class Fabonacci{
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter any number to find out the fabonacci number");
            int n = sc.nextInt();
            System.out.println( fib(n) ) ;
        }
        public static int fib(int n){
            if(n <= 1){
                return n;
            }
            return fib(n-1) + fib(n-2);
        }
    
}