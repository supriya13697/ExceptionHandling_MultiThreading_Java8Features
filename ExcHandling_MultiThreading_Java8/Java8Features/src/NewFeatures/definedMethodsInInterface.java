package NewFeatures;


interface phone {
	void call(); //by default it is public abstract
    default void message() {
		System.out.println("msg");
	}
}

class androidPhone implements phone{
	public void call() {
		System.out.println("call");
	}
}

public class definedMethodsInInterface {
	public static void main(String args[]) {
		phone p = new androidPhone();
		p.call();
		p.message();
	}
}
