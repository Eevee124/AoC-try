package adv_o_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1b {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File("day01.txt"));
		int[] windows = new int[input.nextInt()];
		
		for (int i = 0; i < windows.length; i++) {
			windows[i] = input.nextInt();
		}
		input.close();
		
		int counter = 0;
		int previous = windows[0] + windows[1] + windows[2];
		
		for(int i = 2; i < windows.length; i++) {
			System.out.print(windows[i] + " ");
			int next = windows[i] + windows[i - 1] + windows[i - 2];
			if(previous < next) {
				counter++;
			}
			previous = next;
			System.out.println(counter + " " + previous);
		}
	}
}
