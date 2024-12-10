package U5T7_StaticMethods4;

public class Nums {
    private int int1;
    private int int2;
    private int randomNumber = 0;
    private static int totalRandoms = 0;


    public Nums(int int1, int int2) {
        this.int1 = int1;
        this.int2 = int2;
    }

    public int randBetween() {
        randomNumber ++;
        totalRandoms ++;
        return (int) (Math.random() * (int2 - int1) + int1);
    }

    public int getRandomNumsGenerated() {
        return randomNumber;
    }

    public static int getTotalRandomNumsGenerated() {
        return totalRandoms;
    }
}
