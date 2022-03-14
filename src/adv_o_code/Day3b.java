package adv_o_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3b {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("sample03.txt"));

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

		int zeroA = 0;
		int oneA = 0;

		int lengthStrA = inA.get(0).length();

//		while (inA.size() > 1) {
			int counter = 0;
		
			System.out.println(inA);
			for (int i = 0; i < inA.size(); i++) {
				for (int j = counter; j < lengthStrA; j += lengthStrA) {
					if (inA.get(i).charAt(j) == '0') {
						zeroA++;
					} else {
						oneA++;
					}

				}
			}
			System.out.println(zeroA + " " + oneA);

			for (int i = 0; i < inA.size(); i++) {
				if (zeroA < oneA) {
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
//				System.out.println(inA);
			}
			zeroA = 0;
			oneA = 0;
			counter++;
			
			
			System.out.println(inA);
			System.out.println(inA);
			for (int i = 0; i < inA.size(); i++) {
				for (int j = counter; j < lengthStrA; j += lengthStrA) {
					if (inA.get(i).charAt(j) == '0') {
						zeroA++;
					} else {
						oneA++;
					}

				}
			}
			System.out.println(zeroA + " " + oneA);

			for (int i = 0; i < inA.size(); i++) {
				if (zeroA < oneA) {
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
				System.out.println(inA);
			}
//			for (int i = 0; i < inA.size(); i++) {
//				for (int j = 1; j < lengthStrA; j += lengthStrA) {
//					if (inA.get(i).charAt(j) == '0') {
//						zeroA++;
//					} else {
//						oneA++;
//					}
//
//				}
//			}
//			System.out.println(zeroA + " " + oneA);
//			System.out.println(inA);
//
//			for (int i = 0; i < inA.size(); i++) {
//				if (zeroA < oneA) {
//					if (inA.get(i).charAt(1) == '0') {
//						inA.remove(i);
//						i--;
//					}
//				} else {
//					if (inA.get(i).charAt(1) == '1') {
//						inA.remove(i);
//						i--;
//					}
//				}
//				System.out.println(inA);
//			}
//			System.out.println(inA);
//			zeroA = 0;
//			oneA = 0;
//		}
	}

}
