package NewFeatures;


interface B{
	void show(int i);
}

public class LamdaDemo1 {

	public static void main(String[] args) {
		B obj;
		
		//obj = (int i) -> System.out.println("Hello"+i);
		
		//No need of declaring int already in interface we specified
		obj = i -> System.out.println("Hello"+i);
		
		obj.show(2);
	}

}
