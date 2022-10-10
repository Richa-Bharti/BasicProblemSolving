class Exp {
    public static void main(String args[]) {
        
        int arr[] = {1,2,3,4,5,6,7,8};
        int arr2[] = swapOfNumber(arr);
        for(int i= 0 ; i<arr.length ; i++){
            System.out.print(arr2[i] + " ");
        }
    }
    public static int[]  swapOfNumber(int[] arr){
        int max = arr[0];
        int index = 0;
        for(int i =0 ; i<arr.length ; i++){
            if(max < arr[i]){
                max = arr[i] ;
                index = i;
            }
         }System.out.println("maximun is : " + max + " ,   At index :" + index);
         
         while(index < arr.length-1){
             arr[index] = arr[index + 1] ;
             index++;
         }
         arr[arr.length-1] = max;
         return arr;
    }
}