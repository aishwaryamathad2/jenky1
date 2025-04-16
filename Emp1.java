package jenky1;

public class Emp1 {
   int id;
   String name;
   int age;
   double salary;
   Emp1(int id, String name, int age, double salary){
      this.id=id;
      this.name=name;
      this.age=age;
      this.salary=salary;
   }
   void display(){
      System.out.println("Employee ID:"+id);
      System.out.println("Employee Name:"+name);
      System.out.println("Employee Age:"+age);
      System.out.println("Employee Salary:"+salary);
   }
   public static void main(String[] args) {
      Emp1 obj =new Emp1(001,"Arati",22,55000);
      obj.display();
   }
}
