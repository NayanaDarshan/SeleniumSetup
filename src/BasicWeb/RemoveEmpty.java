package BasicWeb;

public class RemoveEmpty {

	public static void main(String[] args) {
	   
		String Str ="Nayana";
		
		int len = Str.length();
		
		String rev="";
		
		for(int i=len-1; i>=0; i--) {
			
			rev= rev+Str.charAt(i);
			
			//System.out.println(rev);
				
			}
		System.out.println(rev);
		/*String Str ="******************nana&&&&%%%$$$##@@@@@smira";
		
		String Str1= Str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(Str1);*/
		
			
		}
}
			
			
				

	


