package U5T7_StaticMethods4;

public class StudentCheckIn {
    private String name;
    private static String mostRecent = "";
    private static int totalStudents = 0;
    private static int totalPresent = 0; 
    private boolean status = false;

    public StudentCheckIn(String name) {
        this.name = name;
        totalStudents ++;
    }

    public String getCheckInStatus() {
        if(status) {
            return name + " is checked in";
        }
        else {
            return name + " is not checked in";
        }
    }

    public static String totalStudent() {
        return "There are total " + totalStudents + " in class";
    }

    public static String checkPresent() {
        return "There are " + totalPresent + " students present in class";
    }

    public String checkIn() {
        if(checkInProcess()) {
            return name + " is checked in successfully";
        } 
        else {
            return name + " is already here, checking unsuccessful"; 
        }
    }

    public static String recentCheckIn() {
        return "The most recently checked in student is " + mostRecent;
    }

    private boolean checkInProcess() {
        if(!status) {
            status = true;
            totalPresent ++;
            mostRecent = name;
            return true;

        }
        return false;

    }



    
}
