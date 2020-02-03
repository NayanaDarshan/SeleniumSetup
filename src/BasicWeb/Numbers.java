package BasicWeb;

public class Numbers {
	int num;
  
	public static void OddNumuber(int num) {

		for (int i = 1; i <= num; i++) {
			if (i % 2!= 0) {

				System.out.println("The odd numbers are :" + i);

			}
		}
	}

	public static void main(String[] args) {

		OddNumuber(30);

	}

}
