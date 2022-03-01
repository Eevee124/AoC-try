package adv_o_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1a {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File("day01.txt"));
		int depths[] = new int[input.nextInt()];


		for (int i = 0; i < depths.length; i++) {
			depths[i] = input.nextInt();
		}
		input.close();
		
		int previous = depths[0];
		int depthcount = 0;

		for (int i = 0; i < depths.length; i++) {
			System.out.print(depths[i] + " ");
			if (depths[i] > previous) {
				depthcount++;
			}
			previous = depths[i];
			System.out.println(depthcount + " " + previous);
			
		}
	}

}
