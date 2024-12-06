public class Main2 {
    public static void main(String[] args) {
        System.out.println(ZeroUtil.linear(4, 2));
        System.out.println(ZeroUtil.quadratic(1, 5, 6));
        ZeroSolver linear = new ZeroSolver(2, 7);
        ZeroSolver quadratic = new ZeroSolver(1,7,12);
        System.out.println(linear.getLinearZero());
        System.out.println(quadratic.getA());
        System.out.println(quadratic.getB());
        System.out.println(quadratic.getC());
        System.out.println(quadratic.getQuadraticZero());
        linear.compareZero(quadratic);

    }
}
