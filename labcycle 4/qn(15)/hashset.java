import java.util.*;

public class hashset {
	
		public static void main(String[] args) {
			
			LinkedHashSet<String> l = new LinkedHashSet<String>();
			
			//  Inserting data 
			l.add("Blessy");
			l.add("Ammu");
			l.add("Anu");
			l.add("Anoop");
			
			
			System.out.println("The LinkedHashSet is : "+l);
			
			//Size  
			System.out.println("Size is "+l.size());
			
			
			//removing
			l.remove("Anoop");
			System.out.println("Updated Set : "+l);
			
		
			//Checking
			System.out.println(l.contains("Blessy"));
			
			
	}
}

