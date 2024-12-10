package U5T7_StaticMethods4;

public class Classroom {
    public static void main(String[] args) {
        //Create a classroom and add people in
        StudentCheckIn john = new StudentCheckIn("John");
        StudentCheckIn ben = new StudentCheckIn("Ben");
        StudentCheckIn chris = new StudentCheckIn("Chris");
        
        //Check people status
        System.out.println(john.getCheckInStatus());
        System.out.println(ben.getCheckInStatus());
        System.out.println(chris.getCheckInStatus());
        System.out.println(StudentCheckIn.totalStudent());
        System.out.println(StudentCheckIn.checkPresent());
        System.out.println();

        //start checking people in
        john.checkIn();
        System.out.println(john.getCheckInStatus());
        System.out.println(ben.getCheckInStatus());
        System.out.println(chris.getCheckInStatus());
        System.out.println(StudentCheckIn.recentCheckIn());
        System.out.println(StudentCheckIn.totalStudent());
        System.out.println(StudentCheckIn.checkPresent());
        System.out.println();

        //continue checking in
        ben.checkIn();
        System.out.println(StudentCheckIn.recentCheckIn());
        chris.checkIn();
        System.out.println(john.getCheckInStatus());
        System.out.println(ben.getCheckInStatus());
        System.out.println(chris.getCheckInStatus());
        System.out.println(StudentCheckIn.totalStudent());
        System.out.println(StudentCheckIn.checkPresent());
        System.out.println(StudentCheckIn.recentCheckIn());
        System.out.println();

        //add students to classroom
        StudentCheckIn sarah = new StudentCheckIn("Sarah");
        System.out.println(john.getCheckInStatus());
        System.out.println(ben.getCheckInStatus());
        System.out.println(chris.getCheckInStatus());
        System.out.println(sarah.getCheckInStatus());
        System.out.println(StudentCheckIn.totalStudent());
        System.out.println(StudentCheckIn.checkPresent());
        System.out.println();
    }
}
