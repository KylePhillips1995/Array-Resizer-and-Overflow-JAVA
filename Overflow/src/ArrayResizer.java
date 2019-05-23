//Kyle Phillips
//OS 

import java.util.*;
public class ArrayResizer {


public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	//takes a random source array provided by user and fills it up with the data
	System.out.println("Enter a random source array length: ");
	int testarraylength = scan.nextInt();
	int[] testarray = new int[testarraylength + 1];
	
	System.out.println("Enter your desired data: ");
	
	for(int j = 0; j < testarraylength; j++) {
		
		System.out.print("Index " + (j) + ": ");
		testarray[j] = scan.nextInt(); 
	}
	
	//takes random start and end points to extract data from array 
	System.out.println("Enter your desired start and end points: ");
	System.out.print("Start: ");
	int start = scan.nextInt();
	System.out.println("End: ");
	int end = scan.nextInt();
	//destination array length variable
	int destinationarraylength = 0;
	
	//ensures the end and start point fit the array length
	while(end < start || end < 0 || start < 0 || start > testarraylength || end > testarraylength) {
		
		System.out.println("Please enter new start and end pointers (Out of Bounds or end point is less than start): ");
		//re loops for re entry of points if they don't fit in.
		System.out.print("Starting point: ");
		start = scan.nextInt();
		System.out.print("Ending point: ");
		end = scan.nextInt();
	}
	
//uses swapArrays method to swap the values from test to destination array
	int[] destinationarray = swapArrays(testarray, start, end);
		destinationarraylength = destinationarray.length;
	
		//prints out our values in our destination array
		System.out.println("Our destination array consist of: ");
		for(int i = 0; i < destinationarray.length; i++) {
			
			System.out.println("Index: " + (i) + " = " + destinationarray[i]);
			
			
		}
	//prints out the total number of values that are swapped between the arrays
		System.out.println("Total number of elements switched between the arrays is: " + destinationarraylength);
}


//swapArrays method used to swap values between two arrays in a certain interval
public static int[] swapArrays(int[] testarray, int start, int end) {
		
	//uses parameters start and end to get a subsize for our new array
		int subsize = end - start;
		//creates our new array based on the size
		int[] temp = new int[subsize];
		//sets each variable in our new array at i to our test array at start + i
	for(int i = 0; i < subsize; i++) {
		
	
		temp[i] = testarray[start + i];
		}
	//returns the new array 
	return temp;
	}
	
	
	
	
}

