
public class string {

	public static void main(String[] args) {
		String s1="hello"; 
		String s2="whatsup"; 
		
		//1.LENGTH
		System.out.println("string length is: "+s1.length());  
		
		//2.COMPARETO
		System.out.println(s1.compareTo(s2));
		
		//3.CONCATENATION
		s1=s1.concat("how are you");
		System.out.println(s1);
		
		//4.ISEMPTY
		String s3=""; 
		System.out.println(s3.isEmpty());      
		System.out.println(s1.isEmpty());
		
		//5.TRIM
		String s4="  hello   "; 
		System.out.println(s4+"how are you");       
		System.out.println(s4.trim()+"how are you");
		
		//6.LOWERCASE
		String s5="HELLO HOW Are You?";
		String s5lower=s5.toLowerCase();
		System.out.println(s5lower);
		
		//7.UPPERCASE 
		String s1upper=s1.toUpperCase();  
		System.out.println(s1upper);
		
		//8.REPLACE
		String replaceString=s1.replace('h','t'); 
		System.out.println(replaceString); 
        
               //9.CONTAINS
		String name=" hello how are you doing"; 
		System.out.println(name.contains("how are you"));  
	        System.out.println(name.contains("fine"));
	    
	        //10.EQUALS 
	       String s6="hello";
	    	System.out.println(s1.equalsIgnoreCase(s2));
	    	System.out.println(s1.equalsIgnoreCase(s6));
	    
	    	//11.ENDSWITH
	    	String s7="hello how are you"; 
	    	System.out.println(s7.endsWith("u"));      
	    	System.out.println(s7.endsWith("you"));       
	    	System.out.println(s7.endsWith("how")); 
	    
	    	//12.INDEXOF
	    	String s8 = "RockStar";
	   	 System.out.println("Index of character 'S': " + s8.indexOf('S'));
	   	 }

}
