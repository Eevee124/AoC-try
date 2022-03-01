package adv_o_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2b {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("day02.txt"));
		ArrayList<String> direction = new ArrayList<>();
		ArrayList<Integer> value = new ArrayList<>();
		
		while(input.hasNextLine()) {
			direction.add(input.next());
			value.add(input.nextInt());
		}
		
		int aim = 0;
		int horizontal = 0;
		int depth = 0;
		
		for(int i = 0; i < value.size(); i++) {
			if(direction.get(i).contains("down")) {
				aim += value.get(i);
			} else if(direction.get(i).contains("up")) {
				aim -= value.get(i);
			} else {
				horizontal += value.get(i);
				depth += aim * value.get(i);
			}
		}
		
		int res = horizontal * depth;
		System.out.println(res);
	}
}
