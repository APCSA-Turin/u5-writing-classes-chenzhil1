package U5T1_Anatomy_of_a_class;

public class Dice {
    int count = 0;
    int recent = 0;
    int side;


    public Dice(int side) {
        this.side = side;
    }

    public int getSides() {
        return side;

    }

    public int getRollCount() {
        return count;

    }
    
    public int getRollValue() {
        return recent;

    }

    public void setSides(int side) {
        this.side = side;

    }

    public void roll() {
        recent = (int) (Math.random() * side + 1);
        count ++;

    }
    
}
