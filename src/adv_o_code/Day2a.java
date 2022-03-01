package adv_o_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2a {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("day02.txt"));
		ArrayList<String> direction = new ArrayList<>();
		ArrayList<Integer> toCalc = new ArrayList<>();
		
		while(input.hasNextLine()) {
			direction.add(input.next());
			toCalc.add(input.nextInt());
		}
		input.close();
		
		int horizontal = 0;
		int depth = 0;
		
		for(int i = 0; i < toCalc.size(); i++) {
			if(direction.get(i).contains("forward")) {
				horizontal += toCalc.get(i);
			} else {
				if(direction.get(i).contains("up")) {
					depth -= toCalc.get(i);
				}else {
					depth += toCalc.get(i);
				}
			}
		}
		System.out.println(depth + " " + horizontal);
		
		int res = depth * horizontal;
		
		System.out.println(res);
	}

}
