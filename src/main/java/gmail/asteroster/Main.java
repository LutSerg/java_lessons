package gmail.asteroster;

public class Main {
    public static void main(String[] args) {
        int a = 5,
                b = 10,
                c = 15;
        //арифметические операторы
        System.out.println("a + c: " + (a + c));
        System.out.println("a - c: " + (a - c));
        System.out.println("c * b: " + (c * b));
        System.out.println("c / b: " + (c / b));
        System.out.println("c % b: " + (c % b));

        //логические операторы
        boolean d;
        //false или true
        d = (a == c);
        System.out.println("a==c: " + d);
        d = (a < c);
        System.out.println("a < c: " + d);
        d = (a > c);
        System.out.println("a > c: " + d);

        d = (a < b) & (a > c);
        System.out.println("(a < b) & (a > c) :" + d);
        d = (a < b) && (a > c);
        System.out.println("(a < b) & (a > c) :" + d);
        d = (a != b) && (a < c);
        System.out.println("(a != b) && (a < c) :" + d);
        d = !((a > b) && (a > c));
        System.out.println("!((a > b) && (a > c)) :" + d);
        d = (a > b) || (a < c);
        System.out.println("(a > b) || (a < c) :" + d);
        d = (a != b) || (a < c);
        System.out.println("(a > b) || (a < c) :" + d);

        double g = 1.012D;
        System.out.println("x: " + (g + 20));

        int e = Integer.MAX_VALUE;
        System.out.println("e: " + (e + 1));

        int f = Integer.MIN_VALUE;
        System.out.println("f: "+ (f - 1));

    }
}
