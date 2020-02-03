package BasicWeb;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListConcept {

	public static void main(String[] args) {
		
		Employee Emp1= new Employee("Nayana", 33, "QA");
		Employee Emp2= new Employee("Darshan", 33, "CE0");
		Employee Emp3= new Employee("Smira", 4, "Member");
		
		
		ArrayList <Employee> emp = new ArrayList<Employee>();
		emp.add(Emp1);
		emp.add(Emp2);
		emp.add(Emp3);
		
		
	Iterator <Employee> EmpIt= emp.iterator();
	
	while(EmpIt.hasNext()) {
		
	   Employee  epn  =EmpIt.next();
	 System.out.println(epn.age);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*ArrayList<Employee> ep = new ArrayList<Employee>();
		ep.add(Emp1);
		ep.add(Emp2);
		ep.add(Emp3);
		
		//iterator to traverse the value
		
		   Iterator <Employee> it=ep.iterator();
		   
		   while(it.hasNext()) {
			  Employee eye1= it.next();
			  System.out.println(eye1.Name);
			  System.out.println(eye1.Dept);
		   }*/
		
System.out.println("*********************************");	

ArrayList <String> sr = new ArrayList <String> ();
sr.add("Nayana");
sr.add("Smira");
sr.add("Mandya");
sr.add("Darshan");
sr.add("common");
sr.add("test");

ArrayList <String> sr1 = new ArrayList <String> ();
sr1.add("QTP");
sr1.add("Selenium");
sr1.add("Java");
sr1.add("Maven");
sr1.add("common");
sr1.add("test");

sr.retainAll(sr1);

//sr.addAll(sr1);
//sr.removeAll(sr1);

for( int i=0; i<sr.size(); i++) {
	
	System.out.println(sr.get(i));
}


	
}

}
		
		/*ArrayList ar = new ArrayList();
		
	Iter	ar.add(100);
		ar.add(200);
		ar.add("Nayana");
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
		
		for (int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		
		
		ArrayList <String> sr= new ArrayList<String> ();
		
		sr.add("Nayana");
		sr.add("Darshan");
		sr.add("Smira");
		
		for ( ArrayList ar: ar1)
		
          for(int i=0; i<sr.size(); i++) {
        	  
        	  System.out.print(sr.get(i) + " ");*/
    