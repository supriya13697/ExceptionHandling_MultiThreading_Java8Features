package NewFeatures;

import java.util.Arrays;
import java.util.List;

public class StreamAPI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(2,15,3,70,25,2,6);

		//		int result = 0;
		//		for(int i:values) {
		//			if(i%5 == 0) {
		//				result = result + i;
		//			}
		//		}
		//		System.out.println(result);


		System.out.println(values.stream().filter(i -> i%5 == 0).reduce(0,(c,e)->c+e));

		//to find the first element
		System.out.println(values.stream().filter(i -> i%5 == 0).findFirst()); //If empty prints empty
		System.out.println(values.stream().filter(i -> i%5 == 0).findFirst().orElse(0)); //If empty prints 0


		//Filter and map are lazy functions
		System.out.println(values.stream().filter(i -> i%5 == 0).map(i->i*2).findFirst().orElse(0));
		System.out.println(values.stream().filter(StreamAPI1::isDivisible).map(StreamAPI1::isDouble).findFirst().orElse(0));

	}
	public static boolean isDivisible(int i) {
		return i%5 == 0;
	}
 
	public static int isDouble(int i) {
		return i*2;
	}


}
