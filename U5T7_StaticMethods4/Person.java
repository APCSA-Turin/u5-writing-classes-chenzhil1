package U5T7_StaticMethods4;

public class Person {
    private String name;
    private boolean vStatus = false;

    public Person(String name) {
        this.name = name;
    }
    
    public boolean isVaccinated() {
        return vStatus;
    }

    public String getName() {
        return name;
    }

    public void updateStatus() {
        vStatus = true;
    }

}
