package U5T1_Anatomy_of_a_class;

public class Spinner {

    int sections;
    int count = 0;
    int value = 0;
    int sum = 0;
    double average = 0;

    public Spinner(int sections) {
        this.sections = sections;

    }

    public int getSpinValue() {
        return value;

    }
    public int getSpinCount() {
        return count;

    }

    public int getSpinSum() {
        return sum;

    }

    public double averageSpin() {
        average = (double) sum / (double) count;
        return average;

    }

    public void spin() {
        value = (int) (Math.random() * sections + 1);
        sum += value; 
        count ++;

    }


}
