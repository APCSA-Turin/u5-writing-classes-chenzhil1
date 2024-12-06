import java.lang.Double;

public class ZeroSolver {
    

    private double m;
    private double constant;
    private double a;
    private double b;
    private double c;

    public ZeroSolver(double m, double b) {
        this.m = m;
        this.constant = b;

    }

    public ZeroSolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public String getLinearZero() {
        return "(" + ZeroUtil.linear(m, constant) + ", " + "0)" ;
    }

    public String getQuadraticZero() {
        String answer =  "(";
        answer += ZeroUtil.quadratic(a, b, c).substring(ZeroUtil.quadratic(a, b, c).indexOf(",") + 1); //B //E
        answer += ", 0) and (";
        answer += ZeroUtil.quadratic(a, b, c).substring(0, ZeroUtil.quadratic(a, b, c).indexOf(",")); //B //E 
        answer += ", 0)";
        return answer;
    }

    public void compareZero(ZeroSolver otherQuad) {
        if(getLZPoint() < getQZPoint(otherQuad)) { //C
            System.out.println("The linear zero is at the left of the parabola");
        }
        else if(getLZPoint() > getQZPoint2(otherQuad)) {
            System.out.println("The linear zero is at the right of the parabola");
        }
        else if(getLZPoint() > getQZPoint(otherQuad) && getLZPoint() < getQZPoint2(otherQuad)) {
            System.out.println("The linear zero is inside the parabola");
            System.out.print("The quadratic point on the Linear zero is (" + getLZPoint());
            System.out.println(", " +  quadVarOnLZ(getLZPoint(), otherQuad.getA(), otherQuad.getB(), otherQuad.getC()) + ")"); //D
        }
        else{
            System.out.println("The linear zero is on the parabola");
            System.out.print("The quadratic point on the Linear zero is (" + getLZPoint());
            System.out.println(", " +  quadVarOnLZ(getLZPoint(), otherQuad.getA(), otherQuad.getB(), otherQuad.getC()) + ")"); //D
        }
    }

    private double getLZPoint() {
        return Double.parseDouble(getLinearZero().substring(1, getLinearZero().indexOf(",")));
    }

    private double getQZPoint(ZeroSolver quad) {
        return Double.parseDouble(quad.getQuadraticZero().substring(1, quad.getLinearZero().indexOf(",")));
    }
    
    private double getQZPoint2(ZeroSolver quad) {
        String second = quad.getQuadraticZero().substring(quad.getQuadraticZero().indexOf(" (") + 1);
        return Double.parseDouble(second.substring(1, second.indexOf(",")));
    }

    public static double quadVarOnLZ(double linearZero, double quadA, double quadB, double quadC) {
        double result = 0;
        result += quadA * Math.pow(linearZero, 2);
        result += quadB * linearZero;
        result += quadC;
        return result;

    }
}

