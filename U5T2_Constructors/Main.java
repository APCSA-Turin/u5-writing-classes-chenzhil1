public class Main {
    public static void main(String[] args) {
      // Circle circ = new Circle(10);
      // circ.radius = 5;
      // System.out.println(circ.circInfo());
      // System.out.println("The diameter is " + circ.diameter());
      // System.out.println("The perimeter is " + circ.perimeter());

      // Square mySquare = new Square();
      // System.out.println(mySquare.info());
  
      // Square mySquare = new Square();
      // String squareName = mySquare.getName();
      // if (squareName.equals("cool square")) {
      //    System.out.println("It's a cool square!");
      // } else {
      //    System.out.println("It's NOT a cool square!");
      // }

      Student alan = new Student("Alan Turing", 11, "Brooklyn Tech");
      Student geena = new Student("Geena Davis", 7, "Academy Middle School");
      Student paul = new Student("Paul Rudd", 2, "Bright Elementary School");
      Student ada = new Student("Ada Lovelace", 5);
      Student mary = new Student("Mary Truman", 6);
      Student cindy = new Student("Cindy Long", 10);
      Student martha = new Student("Martha Stewart", 0);
      Student rod = new Student("Rod Stewart", 13);
  
      System.out.println(alan.studentInfo());
      System.out.println(geena.studentInfo());
      System.out.println(paul.studentInfo());
      System.out.println(ada.studentInfo());
      System.out.println(mary.studentInfo());
      System.out.println(cindy.studentInfo());
      System.out.println(martha.studentInfo());
      System.out.println(rod.studentInfo());
  
      

    }
  }
  