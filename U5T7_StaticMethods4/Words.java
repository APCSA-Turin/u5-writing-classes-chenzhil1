package U5T7_StaticMethods4;

public class Words {
    private Words() {}

    public static boolean doesContain(String a, String b) {
        if(b.indexOf(a) >= 0) {
            return true;

        }
        return false;
    }

    public static String printReverse(String str) {
        String reversed = "";
        for(int i = str.length() - 1; i > 0; i--) {
            reversed += str.substring(i, i + 1);
            reversed += " ";
        }
        reversed += str.substring(0, 1);
        return reversed;
    }

    
    



}
