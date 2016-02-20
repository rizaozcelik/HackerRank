import java.util.Scanner;


public class FindDigits {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int count = 0;
        for(int i = 0; i<t; i++){
            Long n = scan.nextLong();
            count = 0;
            String number = "" + n;
            for(int j = 0; j<number.length()-1; j++){
            	String s = number.substring(j,j+1);
            	Integer a = Integer.parseInt(s);
            	if(a == 0){
            		continue;
            	}
            	if(n % a == 0){
            		count++;
            	}
            }
            String s = number.substring(number.length()-1);
        	Integer a = Integer.parseInt(s);
        	if( a == 0){
        		continue;
        	}
        	if(n % a == 0){
        		count++;
        	}
        	System.out.println(count);
        }
        
	}

}
