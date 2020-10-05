package samplePrograms;

import java.util.Arrays;

public class countWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "My name is supriya";
		String arr[] = s.split(" ");
		
		System.out.println(Arrays.stream(arr).count());
	}

}
