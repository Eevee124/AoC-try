package adv_o_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3a {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("sample03.txt"));
		ArrayList<String> in = new ArrayList<>();
		int x = 0; //gamma
		int zero = 0;
		int one = 0;
		
		while(input.hasNextLine()) {
			in.add(input.next());
		}
		System.out.println(in);
		for(int i = 0; i < in.size(); i++) {
			if(in.get(i).charAt(0) == 0) {
				zero++;
			} else {
				one++;
			}
			System.out.println();
		}
		
		
	}
	public static void binary(int x) {
		int k = 0;
		int twoToTheK = 1;
    	while(x >= twoToTheK) {
        	k++;
        	twoToTheK *= 2;
    	}
    	
    	k--;
    	twoToTheK /= 2;
    
    	// Drucke einzelne Ziffern der Binaerdarstellung von z
   		while(k >= 0) {
        	int digit = x / twoToTheK;
        	x -= digit * twoToTheK;
        	System.out.print(digit);
        
        	k--;
        	twoToTheK /= 2;
    	}
	}
   
}
