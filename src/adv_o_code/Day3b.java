package adv_o_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3b {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("day03.txt"));

		ArrayList<String> inA = new ArrayList<>();
		ArrayList<String> inB = new ArrayList<>();

		while (input.hasNext()) {
			inA.add(input.next());
		}

		inB = (ArrayList<String>) inA.clone();

		// filter the text file by increasing index of bits until one value
		// is left
		// oxygen generator: most common value
		// scrubber rating: least common
		// keep only numbers with those values in that current position

		// inA is altered list with most common values

		int zero = 0;
		int one = 0;

		int lengthStr = inA.get(0).length();

	//	while (inA.size() > 1) {
			int counter = 0;
//			System.out.println(inA);
			for (int n = 0; n < lengthStr; n++) {
				for (int i = 0; i < inA.size(); i++) {
					for (int j = counter; j < lengthStr; j += lengthStr) {
						if (inA.get(i).charAt(j) == '0') {
							zero++;
						} else {
							one++;
						}

					}
				}
//				System.out.println(zero + " " + one);

				for (int i = 0; i < inA.size(); i++) {
					if(inB.size() == 1) {
						break;
					}
//					System.out.println(inA);
					if (zero <= one) {
						if (inA.get(i).charAt(counter) == '0') {
							inA.remove(i);
							i--;
						}
					} else {
						if (inA.get(i).charAt(counter) == '1') {
							inA.remove(i);
							i--;
						}
					}
				}
	//			System.out.println(inA);
				zero = 0;
				one = 0;
				counter++;
			}
			
			counter = 0;
//			System.out.println(inB);
			for (int n = 0; n < lengthStr; n++) {
				for (int i = 0; i < inB.size(); i++) {
					for (int j = counter; j < lengthStr; j += lengthStr) {
						if (inB.get(i).charAt(j) == '0') {
							zero++;
						} else {
							one++;
						}

					}
				}
//				System.out.println(zero + " " + one);

				for (int i = 0; i < inB.size(); i++) {
					if(inB.size() == 1) {
						break;
					}
//					System.out.println(inB);
					if (zero > one) {
						if (inB.get(i).charAt(counter) == '0') {
							inB.remove(i);
							i--;
						}
					} else {
						if (inB.get(i).charAt(counter) == '1') {
							inB.remove(i);
							i--;
						}
					}
				}
//				System.out.println(inB);
				zero = 0;
				one = 0;
				counter++;
			}
			System.out.println(inB + " " + inA);
			int oxGen = Integer.parseInt(inA.get(0), 2);
			int CO2 = Integer.parseInt(inB.get(0), 2);
			
			int res = oxGen * CO2;
			
			System.out.println(res);
			
	}
}
