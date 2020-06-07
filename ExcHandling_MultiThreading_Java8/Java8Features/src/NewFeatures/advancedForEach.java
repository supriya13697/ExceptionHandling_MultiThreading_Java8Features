package NewFeatures;

import java.util.Arrays;
import java.util.List;

public class advancedForEach {
    public static void main(String args[]) {
    	List<Integer> values = Arrays.asList(5,6,7,8);
    	
    	//Extenal loops
    	
    	//for loop
//    	for(int i = 0; i<values.size();i++) {
//    		System.out.println(+values.get(i));
//    	}
    	
    	//foreach loop
//    	for(int i:values) {
//    		System.out.println(i);
//    	}
    	
    	//Internal loops
    	
    	values.forEach(i -> System.out.println(i)); // -> lambda expression  //Consumer Interface
    	
    	//Method Reference
    	values.forEach(System.out::println);
    }
}
