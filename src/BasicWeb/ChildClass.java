package BasicWeb;

public class ChildClass extends JavaConstructor {

	public ChildClass() {
		super("Tom", 100);
		System.out.println("Child class constructor");
		
	}

	public static void main(String[] args) {
		
		ChildClass childobj = new ChildClass();
		
	}

}




