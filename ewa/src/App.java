import java.util.Scanner;
import java.io.File;
import java.math.BigDecimal;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("ewa.dat"));
        int TotCases = scanner.nextInt();
        for(int i = 0; i < TotCases; i++) {
            
            int SubCases = scanner.nextInt();
            
                for(int j = 0; j < SubCases; j++) {
                    String action = scanner.next();
                    if(action.equals("BRING")){
                        BigDecimal radius = new BigDecimal(scanner.nextDouble());
                        BigDecimal depth = new BigDecimal(scanner.nextDouble());
                        
                    }
                    if(action.equals("EAT")){
                        BigDecimal volume = new BigDecimal(scanner.nextDouble());
                    }
                    System.out.println(action);
            }
            System.out.println("----------");
        }
        
    }
}
