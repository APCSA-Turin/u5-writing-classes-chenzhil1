package U5T7_StaticMethods1;

public class Temperature {

    private double highTemp;
    private double lowTemp;
    private String scale;

    Temperature(double high, double low, String scale) {
        this.highTemp = high;
        this.lowTemp = low;
        this.scale = scale;

    }

    public static double convertCtoF(double temp) {
        return temp * 9 / 5 + 32;

    }

    public static double convertFtoC(double temp) {
        return (temp - 32) * 5 / 9;

    }

    public void changeToC() {
        if(scale.equalsIgnoreCase("F")) {
            highTemp = Temperature.convertFtoC(highTemp);
            lowTemp = Temperature.convertFtoC(lowTemp);
            scale = "C";

        }
    }

    public void changeToF() {
        if(scale.equalsIgnoreCase("C")) {
            highTemp = Temperature.convertCtoF(highTemp);
            lowTemp = Temperature.convertCtoF(lowTemp);
            scale = "F";
            
        }
    }

    public String tempInfo() {
        if(!scale.equalsIgnoreCase("C") && !scale.equalsIgnoreCase("F")) {
            scale = "F";

        }
        String out = "High Tempereture: " + highTemp + " " + scale + "\n";
        out += "Low temperature: " + lowTemp + " " + scale;
        return out;
    }
}
