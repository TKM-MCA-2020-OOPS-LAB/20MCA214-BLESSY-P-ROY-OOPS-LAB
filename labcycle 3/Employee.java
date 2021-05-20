import java.util.Scanner;
public class Employee {
    int empId;
    double salary;
    String name,address;
    public Employee(int empId,double salary,String name,String address)
    {
        this.empId=empId;
        this.salary=salary;
        this.name=name;
        this.address=address;
    }
}

 class Teacher extends Employee
{
String department,subject;
public Teacher(int empId,double salary,String name,String address,String department,String subject)
{
    super(empId,salary,name,address);
    this.department=department;
    this.subject=subject;
}
void display()
{
    System.out.println("\nEMPID\t\tSALARY\t\tNAME\t\tADDRESS\t\tDEPARTMENT\t\tSUBJECT\n");
    System.out.println(empId+"\t\t"+salary+"\t\t"+name+"\t\t"+address+"\t\t"+department+"\t\t"+subject+"\n");
}


    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the total number of records to be stored : ");
        int count=s.nextInt();
        Teacher t[]=new Teacher[count];
        int i;
        for(i=0;i<count;i++)
        {
            System.out.println("Enter empid,salary,name,address,department and subject");
            int p=s.nextInt();
            double a=s.nextDouble();
            String b=s.nextLine();
            String c=s.nextLine();
            String d=s.nextLine();
            String e=s.nextLine();
            t[i]=new Teacher(p,a,b,c,d,e);
          
        }
        for(i=0;i<count;i++)
        {
            t[i].display();
        } 
        
    }
    

}
