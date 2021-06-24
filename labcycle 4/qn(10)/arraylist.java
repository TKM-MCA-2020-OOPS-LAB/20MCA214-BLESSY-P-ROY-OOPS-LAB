import java.util.*;

public class arraylist{
   public static void main(String args[]) {
      
      ArrayList<String> obj = new ArrayList<String>();

      
      obj.add("Ajeet");
      obj.add("Harry");
      obj.add("Chaitanya");
      obj.add("Steve");
      obj.add("Anuj");

      // Displaying elements
      System.out.println("\nOriginal ArrayList:");
      for(String str:obj)
         System.out.println(str);

      /* Add element at the given index*/
       
      obj.add(0, "Rahul");
      obj.add(1, "Justin");

      // Displaying elements
      System.out.println("\nArrayList after add operation:");
      for(String str:obj)
         System.out.println(str);

      //Remove elements from ArrayList like this
      obj.remove("Chaitanya"); 
      //Remove element from the specified index
      obj.remove(1); 


      // Displaying elements
      System.out.println("\nArrayList after remove operation:");
      for(String str:obj)
         System.out.println(str);

      
      // Displaying elements
      System.out.println("\nFinal ArrayList:");
      for(String str:obj)
         System.out.println(str);
      
      
      //Sort the items//
      Collections.sort(obj);
      
      //Displaying elements//
      System.out.println(" \nArray list after sorting:");
      for(String str : obj)
      System.out.println(str);
      
      
      //Access the item//
      System.out.println("\nObject at index 2:"+obj.get(2));
      
      
      //Contain or not//
      System.out.println("\nRahul is in the arraylist:"+obj.contains("Rahul"));
      System.out.println("\nJustin  is in the arraylist:"+obj.contains("Justin"));
      
      //Size of list//
      System.out.println("\nSize of the arraylist :"+obj.size());
      
      
      // Clear all items//
      obj.clear();  
      
      
      // Displaying elements
      System.out.println("\nArrayList after clear:"+obj);
      
   }
}