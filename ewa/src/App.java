import java.util.Scanner;
import java.io.File;
import java.math.BigDecimal;
import java.lang.Math;
import java.math.MathContext;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("ewa.dat"));
        int TotCases = scanner.nextInt();

        for (int i = 0; i < TotCases; i++) {

            int SubCases = scanner.nextInt();
            double totalpie = 0;
            for (int j = 0; j < SubCases; j++) {
                String action = scanner.next();

                if (action.equals("BRING")) {
                    double radius = scanner.nextDouble();
                    double depth = scanner.nextDouble();

                    totalpie += ((Math.PI * Math.pow(radius, 2)) * depth);
                    System.out.println(roundtwo(totalpie));

                }
                if (action.equals("EAT")) {
                    double volume = scanner.nextDouble();
                    totalpie -= volume;
                    System.out.println(roundtwo(totalpie));
                }

            }
            System.out.println("----------");
        }

    }

    public static double roundtwo(double input) {
        double output = 0;

        BigDecimal rounding = new BigDecimal(input);
        MathContext m = new MathContext(2);
        System.out.println(rounding.round(m));

        return output;

    }
}
