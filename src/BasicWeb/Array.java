package BasicWeb;

public class Array {
	
	public static boolean isprime(int num) {
	
		if(num<=1) {
			
			return false;
		}
				
		
		for (int i=2;i<num; i++) {
			if(num%i==0) {
				
				return false;
			}
		
		}
			 		
				return true;	
	
	}
	
public static void getprimenumbers(int num) {
	
	for (int i=2; i<=num; i++) {
		if(isprime(i)) {
			
			System.out.print(i+ " ");
		}
	}
}
	public static void main(String[] args) {
		
		
		/*Boolean status;
		
		status=isprime(15);
		System.out.println(status);*/
		//getprimenumbers(15);
		int i[] = new int[4];
		i[0]= 10;
		i[1]=2;
		i[2]=40;
		i[3]=30;
		
		for ( int j : i) {
			
			System.out.println(j);
		}
		
		/*System.out.println(i.length);
		int num=i.length;
		
		for(int j=0; j<num; j++) {
			
			System.out.println("The values of all array is "+ i[j]);
			
		}*/
	   
	
		
	
	
}


	}

	
