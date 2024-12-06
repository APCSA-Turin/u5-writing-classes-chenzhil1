// public class Main {
//     public static void main(String[] args) {
   
   
//       // 1. create an Employee object named employee1 with a
//       // first name of "Jim" and last name "Mason"; call the
//       // employeeInfo() method and print the returned string
//       Employee employee1 = new Employee("Jim", "Mason");
//       System.out.println(employee1.employeeInfo());
   
   
//       // 2. call the getter methods for both static variables
//       // (most recent ID and employee count) and print values
//       System.out.println(Employee.getMostRecentEmployeeID());
//       System.out.println(Employee.getTotalEmployeesCreated());
   
   
//       // 3. create a second Employee object named employee2
//       // with first name of "Amy" and last name "Adams"; call
//       // the employeeInfo() method and print returned string
//       Employee employee2 = new Employee("Amy", "Adams");
//       System.out.println(employee2.employeeInfo());
   
   
//       // 4. call the getter methods for both static variables
//       // again; you should see they have both increased
//       System.out.println(Employee.getMostRecentEmployeeID());
//       System.out.println(Employee.getTotalEmployeesCreated());
   
   
//       // 5. call the employeeInfo() method a second time on
//       // both employee1 and employee2 objects and print
//       // the returned strings; note that both now show a most
//       // recent ID of 101 and 2 total employees hired, but
//       // Jim's ID is still 100 and Amy's ID is still 101
//       System.out.println(employee1.employeeInfo());
//       System.out.println(employee2.employeeInfo());
   
   
//       // 6. create a third Employee object named employee3
//       // with first name "Bob" and last name "Ross". then
//       // call the employeeInfo() method on the object and
//       // print the returned string
//       Employee employee3 = new Employee("Bob", "Ross");
//       System.out.println(employee3.employeeInfo());
   
   
//       // 7. create a fourth Employee object named employee4
//       // with first name "Cindy" and last name "Nox".  then
//       // call the employeeInfo() method on the object and
//       // print the returned string
//       Employee employee4 = new Employee("Cindy", "Nox");
//       System.out.println(employee4.employeeInfo());
   
   
//       // 8. call the employeeInfo() method one last time on
//       // all 4 Employee objects; note that the number of
//       // created employees is 4 and most recent ID is 103 for
//       // all four objects
//       System.out.println(employee1.employeeInfo());
//       System.out.println(employee2.employeeInfo());
//       System.out.println(employee3.employeeInfo());
//       System.out.println(employee4.employeeInfo());
   
   
//       // 9. call the getter methods for both static variables
//       // (most recent ID and employee count) and print values
//       System.out.println(Employee.getMostRecentEmployeeID());
//       System.out.println(Employee.getTotalEmployeesCreated());
//     }
//    }
   
public class Main {
  public static void main(String[] args) {
    System.out.println("--- first student ---");
    Student s1 = new Student("Adam");
    System.out.println(s1.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s1.addPoints(20);
    System.out.println(s1.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s1.addPoints(30);
    System.out.println(s1.studentInfo());
    System.out.println(Student.classInfo());
 
 
 
 
 
 
 
 
 
 
    System.out.println("\n--- second student ---");
    Student s2 = new Student("Barb");
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s2.addPoints(15);
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s2.addPoints(30);
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s2.addPoints(20);
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    System.out.println("\n--- third student ----");
    Student s3 = new Student("Charles");
    System.out.println(s3.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s3.addPoints(40);
    System.out.println(s3.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s3.addPoints(35);
    System.out.println(s3.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s3.addPoints(25);
    System.out.println(s3.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    System.out.println("--- adding to Barb ---");
    s2.addPoints(10);
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s2.addPoints(20);
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s2.addPoints(15);
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
  }
}
 