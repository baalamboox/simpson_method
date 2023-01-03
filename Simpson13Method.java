public class Simpson13Method {
    public static void main(String[] args) {
        System.out.println("\nMétodo de Simpson 1/3\n---------------------\n\nProblema a resolver:\n");
        String quadraticFunction = "y = x^2";
        double a = 0, b = 1;
        int n = 2;
        double x0 = a;
        System.out.println(quadraticFunction + "\n" + "a = " + a + "\n" + "b = " + b + "\n" + "n = " + n + "\n");
        System.out.println("Fórmulas a usar:\n\n∫f(x)dx ≈ h/3[f(x0) + 4f(x1) + f(x2)]\nh = (b -a) / n\n");
        double h = ((b - a) / n);
        System.out.println("Procedimiento:\n\nh = " + h + "\n");
        double xn = x0;
        double[] fxn = new double[n + 1];
        for(int i = 0; i < fxn.length; i++) {
            System.out.println("x" + i + " = " + xn);
            System.out.println("f(x" + i + ") = " + Math.pow(xn, 2));
            fxn[i] = Math.pow(xn, 2);
            xn = xn + h;
        }
        double I = ((h / 3) * (fxn[0] + (4 * fxn[1]) + fxn[2]));
        System.out.println("\nResultado:\n\nI = " + I + " u^2\n");
    }
}