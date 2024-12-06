public class ZeroUtil {
    private ZeroUtil() {}

    public static Double linear(double m, double constant) {
        if(m != 0) {
            return constant * -1 / m;
        }
        return null;
    }

    public static String quadratic(double a, double b, double c) {
        String answer = "";
        answer += (-b + discriminant(a, b, c)) / (2 * a); //A
        answer += ",";
        answer += (-b - discriminant(a, b, c)) / (2 * a); //A
        return answer;
    }

    private static double discriminant(double a, double b, double c) {
        return Math.sqrt(Math.pow(b,2) - 4 * a * c);
    }
} 
