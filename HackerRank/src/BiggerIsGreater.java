import java.util.ArrayList;
import java.util.Scanner;


public class BiggerIsGreater {
	
	static ArrayList<String> all = new ArrayList<String>();
	static ArrayList<String> greaters = new ArrayList<String>();
	static String str;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i<t; i++){
			str = scan.next();
			greaters = permutation(str);
			
			greaters.sort(null);
			if(greaters.size() > 0){
                System.out.println(greaters.get(0));
            }else{
                System.out.println("no answer");
            }
			System.out.println(greaters);
			greaters.clear();
		}
	}
	
	public static ArrayList<String> permutation(String s) {
	    // The result
	    ArrayList<String> res = new ArrayList<String>();
	    // If input string's length is 1, return {s}
	    if (s.length() == 1) {
            	res.add(s);
	    } else if (s.length() > 1) {
	        int lastIndex = s.length() - 1;
	        // Find out the last character
	        String last = s.substring(lastIndex);
	        // Rest of the string
	        String rest = s.substring(0, lastIndex);
	        // Perform permutation on the rest string and
	        // merge with the last character
	        res = merge(permutation(rest), last);
	    }
	    return res;
	}

	/**
	 * @param list a result of permutation, e.g. {"ab", "ba"}
	 * @param c    the last character
	 * @return     a merged new list, e.g. {"cab", "acb" ... }
	 */
	public static ArrayList<String> merge(ArrayList<String> list, String c) {
	    ArrayList<String> res = new ArrayList<String>();
	    // Loop through all the string in the list
	    for (String s : list) {
	        // For each string, insert the last character to all possible postions
	        // and add them to the new list
	        for (int i = 0; i <= s.length(); ++i) {
	            String ps = new StringBuffer(s).insert(i, c).toString();
	            if(str.compareTo(ps) < 0){
	            	res.add(ps);
	            }
	        }
	    }
	    return res;
	}
}
