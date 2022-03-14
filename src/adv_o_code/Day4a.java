package adv_o_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day4a {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("sample04.txt"));
		ArrayList<Integer> numCall = new ArrayList();
		
		
		String in = input.next();
		String[] strArray = in.split(",");
		int[] intArray = new int[strArray.length];
		for(int i = 0; i < strArray.length; i++) {
		    intArray[i] = Integer.parseInt(strArray[i]);
		}
		System.out.println(Arrays.toString(intArray));
		
		for(int i = 0; i < intArray.length; i++ ) {
			numCall.add(intArray[i]);
		}
		System.out.println(numCall);
		
	}

}
