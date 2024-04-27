import java.util.Scanner;


public class CurrencyConverterRunner {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();

        // taking dollar to yen rate.
        System.out.print("\nEnter Dollar to Yen rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Dollar amount: ");
        double dollar = sc.nextDouble();


        // prints result
        System.out.printf("\nTotal amount in Yen: %.2f\n",currencyConverter.converter(rate, dollar));

        sc.close();
    }
}
