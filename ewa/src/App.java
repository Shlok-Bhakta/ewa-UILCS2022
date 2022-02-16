import java.util.Scanner;
import java.io.File;

import java.lang.Math;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("ewaJUD.dat"));
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
                    totalpie = roundtwo(totalpie);
                    System.out.printf("%.2f", totalpie );
                    System.out.println();
                }
                if (action.equals("EAT")) {
                    double volume = scanner.nextDouble();
                    totalpie -= volume;
                    totalpie = roundtwo(totalpie);
                    
                       // System.out.printf("2f", totalpie);
                    
                        System.out.printf("%.2f", totalpie );
                    System.out.println();
                    
                }

            }
            System.out.println("----------");
        }

    }

    public static double roundtwo(double input) {
        double output = 0;

        output = input * 100;
        output = Math.round(output);
        output = output / 100;

        return output;

    }
}
