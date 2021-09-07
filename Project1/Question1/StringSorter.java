
//I found the scanner method at https://www.geeksforgeeks.org/ways-to-read-input-from-console-in-java/
import java.util.Arrays;
import java.util.Scanner;

public class StringSorter {

    public static void main(String args[]){
    	boolean notNull = true;
    	do {	    	
	    	Scanner in = new Scanner(System.in); //establishes a scanner
	    	System.out.println("Please input a string to be sorted.");
	    	String str = in.nextLine(); //takes the input and assigns it to a string
	        if (str == "") notNull = false; //This will be used to detect null inputs
	        else{
	        	//The following method was found at https: //www.baeldung.com/java-sort-string-alphabetically
	        	//To ensure correct sorting, as it is done by ASCII, the string is converted to all uppercase before being
	        	//converted to a char array
	        	char[] chars = str.toUpperCase().toCharArray();
				Arrays.sort(chars); //sorts array
			    String sorted = new String(chars); //converts back to string
	        	System.out.println(sorted);
	       	}
	    } while (notNull);
    	System.out.println("Null input detected. Program terminated.");
    }
}