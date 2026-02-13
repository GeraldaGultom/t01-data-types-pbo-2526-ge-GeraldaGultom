import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String soal = input.next();

        // Soal 1
        if (soal.equals("Soal1")) {
            int a = input.nextInt();
            int b = input.nextInt();

            if ((a > 0 && b > 0 && a > Integer.MAX_VALUE - b) ||
                (a < 0 && b < 0 && a < Integer.MIN_VALUE - b)) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(a + b);
            }

        // Soal 2
        } else if (soal.equals("Soal2")) {

            String xs = input.next();
            String ys = input.next();

            float xf = Float.parseFloat(xs);
            float yf = Float.parseFloat(ys);

            double xd = Double.parseDouble(xs);
            double yd = Double.parseDouble(ys);

            float sumFloat = xf + yf;
            double sumDouble = xd + yd;

            double diff = Math.abs(sumDouble - sumFloat);

            System.out.printf("%.6f\n", diff);

        // Soal 3
        } else if (soal.equals("Soal3")) {
            int N = input.nextInt();

            Integer a = N;
            Integer b = a;

            a = a + 1;

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        // Soal 4
        } else if (soal.equals("Soal4")) {
            String S = input.next();

            String a = S;
            String b = new String(S);

            a = a + "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        // Soal 5
        } else if (soal.equals("Soal5")) {

            String intStr = input.next();
            String doubleStr = input.next();
            String boolStr = input.next();

            int i = Integer.parseInt(intStr);
            double d = Double.parseDouble(doubleStr);
            boolean flag = Boolean.parseBoolean(boolStr);

            double result = i * d;

            if (!flag) {
                result *= -1;
            }

            System.out.printf("%.2f\n", result);
        }

        input.close();
    }
}
