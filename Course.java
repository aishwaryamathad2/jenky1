package jenky1;

public class Course {
   String courseName;
   String grade;
   Course(String courseName, String grade){
      this.courseName=courseName;
      this.grade=grade;
   }
   void displayCourse(){
      System.out.println("Course Name:"+courseName);
      System.out.println("Grade:"+grade);
   }
   public static void main(String[] args) {
      Course c=new Course("Java", "A");
      Course c1=new Course("BD", "B");
      Course c2=new Course("DevOps", "S");
      c.displayCourse();
      c1.displayCourse();
      c2.displayCourse();
   }
}
