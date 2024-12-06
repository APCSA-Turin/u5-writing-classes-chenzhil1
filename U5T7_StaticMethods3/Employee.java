public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private static int mostRecentEmployeeID = 0;
    private static int totalEmployeesCreated = 0;

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(mostRecentEmployeeID == 0) {
            employeeID = 100;
        }
        else {
            employeeID = mostRecentEmployeeID + 1;

        }
        mostRecentEmployeeID = employeeID;
        totalEmployeesCreated ++;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getID() {
        return employeeID;
    }

    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;

    }

    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }

    public String employeeInfo() {
        String info = "--------------------------\n";
        info += "Employee full name: "  + getFullName() + "\n"; 
        info += "Employee ID: " + getID() + "\n";
        info += "Most recent ID assigned: " + getMostRecentEmployeeID() + "\n";
        info += "Total employees hired: " + getTotalEmployeesCreated() + "\n";
        info += "--------------------------" + "\n";
        return info;
    }
}
