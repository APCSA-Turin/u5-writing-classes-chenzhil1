package U5T7_StaticMethods1;

public class RaceUtility {
    public RaceUtility() { }
    public static double milesToKm(double mile) {
        return mile * 1.609;
    }

    public static double kmToMiles(double km) {
        return km / 1.609;
    }

    public static String makeProper(String improper) {
        String proper = improper.substring(0,1); 
        for(int i = 0; i < improper.length() - 1; i ++) {
            if(improper.substring(i, i + 1).equals(" ")) {
                proper += improper.substring(i + 1, i + 2).toUpperCase();
                
            }
            else {
                proper += improper.substring(i + 1, i + 2).toLowerCase();

            }
        }
        return proper;
    }

}
