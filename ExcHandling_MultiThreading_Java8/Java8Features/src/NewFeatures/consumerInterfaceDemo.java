package NewFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//class ABC implements Consumer<Integer>{
//
//	@Override
//	public void accept(Integer i) {
//		System.out.println(i);
//	}
//	
//}

public class consumerInterfaceDemo {

	public static void main(String[] args) {
	
		List<Integer> values = Arrays.asList(5,6,7,8);
		
//		Consumer<Integer> c = new ABC();
//		values.forEach(c);
		
		
		
//		Consumer<Integer> c = new Consumer<>() {
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		};
//		values.forEach(c);
		
		
		
//		Consumer<Integer> c = (Integer i) -> {
//				System.out.println(i);
//		};
//		values.forEach(c);

		
		
//		Consumer<Integer> c = i -> System.out.println(i);
//		values.forEach(c);
		
		
		values.forEach(i -> System.out.println(i));
	}

}
