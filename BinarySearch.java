import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0 ; i <n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("the key is at: "+ searching(arr, key, n));
    }
        public static int searching(int[] arr, int key, int n){
            Arrays.sort(arr);
           int s = 0; 
           int e = n;
           while(s<=e){
               int mid = (s+e)/2;
               if(arr[mid] == key){
                   return mid;
               }
               else if(arr[mid] > key){
                   e = mid-1 ;
               }
               else{
                   s = mid+1;
               }

           } 
           return -1;
        }
}