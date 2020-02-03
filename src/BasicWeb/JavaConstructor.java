package BasicWeb;

public class JavaConstructor {
	String name;
	int age;
	
	public JavaConstructor() {
		System.out.println("Default constructor");
	}

	public JavaConstructor(String name, int age) {
		this.name=name;
		this.age= age;
		System.out.println("The name is " +name);
		System.out.println("The age is " +age);
		
	}
	public static void main(String[] args) {
		
		JavaConstructor ObjConst = new JavaConstructor();
		JavaConstructor ObjConst1 = new JavaConstructor("Nayana", 33);
	
	}

}
