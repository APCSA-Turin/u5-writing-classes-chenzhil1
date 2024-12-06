public class Student {
    private String firstName;
    private int points = 0;
    private static int pointsAll = 0;
    private static int greatestPoints = 0;

    public Student(String firstName) {
        this.firstName = firstName;

    }

    public void addPoints(int points) {
        this.points += points;
        pointsAll += points;
        if(this.points > greatestPoints) {
            greatestPoints = this.points;
        }
    }

    public static int getTotalPointsEarned() {
        return pointsAll;
    }

    public static int getGreatestPoints() {
        return greatestPoints;
    }

    public String studentInfo() {
        String info = "Student: " + firstName + "\n";
        info += "Student's Points: " + points + "\n";
        return info; 

    }

    public static String classInfo() {
        String info = "Total points earned by all students: " + getTotalPointsEarned() + "\n";
        info += "Most points earned by any student: " + getGreatestPoints() + "\n";
        return info;
    }
    

}
