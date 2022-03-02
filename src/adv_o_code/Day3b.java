package adv_o_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3b {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("sample03.txt"));

		ArrayList<String> in = new ArrayList<>();
		ArrayList<Character> digit = new ArrayList<>();
		while (input.hasNext()) {
			in.add(input.next());
		}

		final int size = in.get(0).length();

		for (int i = 0; i < in.size(); i++) {
			for (int j = 0; j < size; j++) {
				digit.add(in.get(i).charAt(j));
			}
		}

		int length = in.size();
		while(in.size() != 1) {
			for(int i = 0; i < length; i++) {
				for(int j = 0; j < size; j += size) {
					int zero = 0;
					if(in.get(i).charAt(j) == '0') {
						zero++;
					}
				}
			}
		}
		
//		while (length != 1) {
//			for (int i = 0; i < length; i++) {
//				int zero = 0;
//				int one = 0;
//				for (int j = i; j < digitSize; j += size) {
//					char toCompare = '\0';
//					if (in.get(i).charAt(j) == '0') {
//						zero++;
//					} else {
//						one++;
//					}
//					if (zero > one) {
//						toCompare = '0';
//					} else {
//						toCompare = '1';
//					}
//					System.out.println(toCompare + "this");
//					for (int k = 0; k < size; k++) {
//						if (in.get(i).charAt(k) != toCompare) {
//							in.remove(i);
//							if(length == 0) {
//								break;
//							}
//							length = in.size();
//							digitSize = digit.size() - size;
//						}
//						System.out.println(in.size());
//					}
//
//				}
//
//			}
//		}
	}

}
