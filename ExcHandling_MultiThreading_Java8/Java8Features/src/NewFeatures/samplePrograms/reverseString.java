package samplePrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class reverseString {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String s[]= str.split("");
		
		System.out.println(IntStream.range(0, str.length()).boxed().sorted(Collections.reverseOrder()).map(i -> String.valueOf(str.charAt(i))).collect(Collectors.joining()));
		
		
		// create index [0 .. s.length - 1] 
		// the next step requires them boxed
		// indices in reverse order
		// grab each index's character 
		// join each single-character String into the final String
	}
}
