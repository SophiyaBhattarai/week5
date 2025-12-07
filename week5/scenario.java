import java.util.Scanner;

/**
 * Write a description of class scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scenario
{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        String continueCalculation ="Y";
        
        while(continueCalculation.equalsIgnoreCase("Y")){
            System.out.print("enter principal amount(minimum Rs 1000):");
            float P = scanner.nextFloat();
            
            System.out.print("enter annual interest rate(8%-12%):");
            float annualRate = scanner.nextFloat();
            
            System.out.print("enter duration in years(max 5 years):");
            int years = scanner.nextInt();
            
            float monthlyRate=(annualRate/100f)/12f;
            int months = years*12;
            float A=(float)(P*Math.pow(1+monthlyRate, months));
            float feerate=0.005f;
            float fee=A* feerate;
            float finalamount=A-fee;
            
            System.out.println("\n== fixed deposit details ===");
            System.out.println("principal amount:"+P);
            System.out.println("annual interest rate:"+annualRate);
            System.out.println("monthly interest rate:"+(monthlyRate*100));
            System.out.println("duration:"+years);
            System.out.println("maturity amount:"+A);
            System.out.println("processing fee:" +fee);
            System.out.println("final amlount: "+ finalamount);
            System.out.println();
            
            System.out.print("Shall we calculate one more FD?(Y/N):");
            continueCalculation =scanner.next();
            System.out.println();
        }
        System.out.println("We appreciate you using Nepal Investment Bank Fixed Deposit calculator!");
        scanner.close();
    }
}