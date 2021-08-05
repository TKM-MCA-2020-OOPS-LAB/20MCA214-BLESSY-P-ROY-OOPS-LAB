import java.util.*;
public class linked list {
	public static void main(String[] args) {
	   LinkedList<String> list=new LinkedList<String>();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number of employees:");
	   int num=sc.nextInt();
	   for(int i=1;i<=num;i++){
        System.out.print("Add the name of employee id="+i+":");
        String s=sc.next();
        list.add(s);
        }
      System.out.println();
      System.out.println("LinkedList After adding employees:");
      Iterator<String> itr=list.iterator();
      while(itr.hasNext()){
        System.out.println(itr.next());
      }
     list.clear();
     System.out.println("Linked list After removing employees: "+list);
  }
}
