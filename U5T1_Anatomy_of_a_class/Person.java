package U5T1_Anatomy_of_a_class;

public class Person {

    int meetings;
    String firstName;
    String lastName;
    
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getMeetings() {
        return meetings;

    }
    public void addMeetings() {
        meetings ++;

    }

    public void meet(Person person) {
        System.out.println("Hello my name is " + firstName);
        System.out.println("Hi, my name is " + person.firstName);
        meetings ++;
        person.addMeetings();
        
        
    }
}
