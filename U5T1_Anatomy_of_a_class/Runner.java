package U5T1_Anatomy_of_a_class;

public class Runner {
    public static void main(String[] args) {
        // Dice dice1 = new Dice(6);
        // int sides = dice1.getSides();
        // System.out.println(sides);
        // System.out.println("default count = " + dice1.getRollCount());
        // System.out.println("default roll = " + dice1.getRollValue());
        // System.out.println();
        
        // dice1.roll();
        // System.out.println("count = " + dice1.getRollCount());
        // System.out.println("roll = " + dice1.getRollValue());
        // dice1.roll();
        // System.out.println("count = " + dice1.getRollCount());
        // System.out.println("roll = " + dice1.getRollValue());
        // dice1.roll();
        // System.out.println("count = " + dice1.getRollCount());
        // System.out.println("roll = " + dice1.getRollValue());
        // System.out.println();
        
        // dice1.setSides(20);
        // sides = dice1.getSides();
        // System.out.println(sides);
        // dice1.roll();
        // System.out.println("count = " + dice1.getRollCount());
        // System.out.println("roll = " + dice1.getRollValue());
        // System.out.println();
        
        // Dice dice2 = new Dice(10);
        // dice2.roll();
        // dice2.roll();
        // dice2.roll();
        // dice2.roll();
        // dice2.roll();
        // dice2.roll();
        // dice2.roll();
        // System.out.println("count = " + dice2.getRollCount());
        // System.out.println("count = " + dice1.getRollCount());
        
        Prism prism = new Prism(5, 6, 10);
        System.out.println(prism.dimensions());     
        System.out.println();
        
        // test volume and surfaceArea methods 
        // int vol = prism.volume();
        // int surfaceArea = prism.surfaceArea();
        // System.out.println(vol);
        // System.out.println(surfaceArea);
        // System.out.println();
        
        // // test setter methods
        // prism.setLength(8);
        // prism.setWidth(15);
        // prism.setHeight(20);
        // System.out.println(prism.dimensions());
        // System.out.println();
        
        // // retest volume and surfaceArea methods after setting new dimensions
        // vol = prism.volume();
        // surfaceArea = prism.surfaceArea();
        // System.out.println(vol);
        // System.out.println(surfaceArea);

        // Spinner spinner = new Spinner(10);

        // spinner.spin();  System.out.println(spinner.getSpinValue());
        // System.out.println(spinner.getSpinCount());
        // System.out.println(spinner.getSpinSum());
        // System.out.println(spinner.averageSpin());
        
        // spinner.spin();
        // System.out.println(spinner.getSpinValue());
        // System.out.println(spinner.getSpinCount());
        // System.out.println(spinner.getSpinSum());
        // System.out.println(spinner.averageSpin());
        
        // spinner.spin();
        // System.out.println(spinner.getSpinValue());
        // System.out.println(spinner.getSpinCount());
        // System.out.println(spinner.getSpinSum());
        // System.out.println(spinner.averageSpin());
        
        // spinner.spin();
        // System.out.println(spinner.getSpinValue());
        // System.out.println(spinner.getSpinCount());
        // System.out.println(spinner.getSpinSum());
        // System.out.println(spinner.averageSpin());
        
        Person person1 = new Person("Adam", "Jones");
Person person2 = new Person("John", "Smith");

person1.meet(person2);

System.out.println(person1.getMeetings());
System.out.println(person2.getMeetings());



person2.meet(person1);

System.out.println(person1.getMeetings());
System.out.println(person2.getMeetings());



Person person3 = new Person("Amy", "Jordan");
person3.meet(person2);

System.out.println(person1.getMeetings());
System.out.println(person2.getMeetings());
System.out.println(person3.getMeetings());

    }
}
