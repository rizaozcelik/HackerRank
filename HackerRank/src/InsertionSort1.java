import java.util.Scanner;


public class InsertionSort1 {
	
    public static void insertIntoSorted(int[] ar) {
        boolean inserted = false;
        int key = ar[ar.length-1];
        for(int i=ar.length-2; i>=0; i--){
           // int j = i-1;
            if(ar[i] > key){
                ar[i+1] = ar[i];
                printArray(ar);
            }else{
                ar[i+1] = key;
                inserted = true;
                printArray(ar);
                break;
            }
            
            if(i == 0 && !inserted){
                ar[0] = key;
                printArray(ar);
            }
            
        }
    }    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
