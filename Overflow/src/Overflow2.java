//Kyle Phillips OS
import java.util.Scanner;

public class Overflow2 {

	//static int for the size of our input to our array
	//static final int INPUT_SIZE = 10;
	
	public static void main(String[] args) {
		
		//intalizes our array
		
		//initalizes our string using getString
		Scanner scan = new Scanner(System.in);
		//creates our string using getString method
		String s1 = getString(scan);
		//creates our array using the length of our string + 1 to account for zero
		char[] vals = new char[s1.length() + 1];

		
		//once the string fits our array copys the values from the string into the array
			copyVals(s1, vals);
		//returns our substring	
			String sub = getSubstring(scan,vals);
			System.out.println("sub string: " + sub);
			
		}
		
		 
	//getString method that takes a scanner parameter and returns it as a string s.
	public static String getString(Scanner scan) {
	
		System.out.print("Please type a string: ");
		String s = scan.nextLine();
		return s;
		
	}
//copyVals method that copies the characters in our string into our array at our index	
	public static void copyVals(String s, char[] vals) {
		for (int i = 0; i <s.length(); i++) {
			vals[i] = s.charAt(i);
		}
	}
	// getSubstring method that takes our scanner parameter and vals array
	public static String getSubstring(Scanner scan, char[] vals) {
		//user input to determine where to start and end substring
		System.out.print("Starting point: ");
		int start = scan.nextInt();
		System.out.print("Ending point: ");
		int end = scan.nextInt();
		
		//checks to see if our end and start variables fit within our array and are within bounds
		while(end < start || end > vals.length -1 || end < 0 || start < 0 || start > vals.length - 1 ) {
			
			System.out.println("Please enter new start and end pointers (Out of Bounds or end point is less than start): ");
			//re loops for re entry of points if they don't fit in.
			System.out.print("Starting point: ");
			start = scan.nextInt();
			System.out.print("Ending point: ");
			end = scan.nextInt();
		}
		
	// creeates a newChars array from our start, and end values from our vals array
		char[] newChars = getChars(start, end, vals);
		return new String(newChars);
		
		
	}
	//getChars method that takes our start, end, and vals array and places our new subString in a new array called results to be returned
	public static char[] getChars(int start, int end, char[] vals) {
		
		int sz = end - start;
		char[] result = new char[sz];
		for(int i = 0; i < sz; i++) {
		
			result[i] = vals[start + i];
		}
		return result;
		
		}
		
	
	}

	