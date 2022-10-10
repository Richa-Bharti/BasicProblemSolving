
import java.util.*;
class BarChart{

	public static void main(String args[]) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter N: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i=0;
		System.out.println("enter the numbers: ");
		while(n!=0){
		    arr[i] = sc.nextInt();
		    n--;
		    i++;
		}
		barChart(arr, n);
		
	}
	public static void barChart(int arr[], int n){
	    int row = maximum(arr, n);
	    
	    for(int i=row; i>=1; i--){
	    	for(int j=0; j<arr.length; j++){
	    		if(arr[j] >= i){
	    			System.out.print("*");
	    		}
	    		else{
	    			System.out.print(" ");
	    		}

	    	}
	    	System.out.println();
	    }



	}
	static int maximum(int arr[], int n){
		int max = Integer.MIN_VALUE;
		for(int i:arr){
			if(max< i){
				max = i;
			}
		}
		return max;
	}
}

