package samplePrograms;

import java.util.Arrays;
import java.util.HashMap;

public class duplicateOccuranceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Hi Hi I am supriya and myself supriya and I am working in Capgemini";
		String words[] = sentence.split(" ");
		
		HashMap<String,Integer> map = new HashMap<>();
		
		Arrays.stream(words).forEach(x->{
			if(map.containsKey(x)) {
				map.put(x,map.get(x)+1);
			} else {
				map.put(x, 1);
			}
		});
		System.out.println(map);

		
		//To get distinct words in a sentence
		//Arrays.stream(words).distinct().forEach(x->System.out.println(x));
	}

}
