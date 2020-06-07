package NewFeatures;

import java.util.Arrays;
import java.util.List;

public class streamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(5,6,7,8);
		
//		int result = 0;
//		for(int i:values){
//			result = result + i*2;
//		}
//		System.out.println(result);
		
		
		
		
		
		System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));	
		//System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> Integer.sum(c, e)));
		//System.out.println(values.stream().map(i -> i*2).reduce(0,Integer::sum));
	}

}
