package adv_o_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3a {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("sample03.txt"));

		ArrayList<String> in = new ArrayList<>();
		ArrayList<Character> digit = new ArrayList<>();
		while(input.hasNext()) {
			in.add(input.next());
		}
		
		final int size = in.get(0).length();
		
		for(int i = 0; i < in.size(); i++) {
			for(int j = 0; j < size; j++) {
				digit.add(in.get(i).charAt(j));
			}
		}
		
		
		String gamma = "";
		String epsilon = "";
		
		for(int i = 0; i < size; i++) {
			int zero = 0;
			int one = 0;
			for(int j = i; j < digit.size(); j += size) {
				if(digit.get(j) == '0') {
					zero++;
				}
				else {
					one++;
				}
			}
			System.out.println(zero + " " + one);
			
			if(zero > one) {
				gamma += "0";
				epsilon += "1";
			} else {
				gamma += "1";
				epsilon += "0";
			}
		}
		System.out.println(gamma + " " + epsilon);
		
		int gammaInt = Integer.parseInt(gamma, 2);
		int epsilonInt = Integer.parseInt(epsilon, 2);
		
		int res = epsilonInt * gammaInt;
		
		System.out.println(res);
		
	}

}
