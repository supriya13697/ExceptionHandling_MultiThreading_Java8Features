package samplePrograms;

import java.util.Arrays;
import java.util.List;

public class demo {
	
	public static void main(String args[]) {
	
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
	
	list.forEach(i -> System.out.println(i));
	
	System.out.println("------------------------------------------------------");
	
	list.forEach(i -> {
		if(i%2 == 0)
			System.out.println(i);
	});
	
	System.out.println("------------------------------------------------------");
	
	
	}
}
