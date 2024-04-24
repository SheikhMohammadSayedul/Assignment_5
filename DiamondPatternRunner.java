import java.util.Scanner;

public class DiamondPatternRunner {
    
    public static void main(String[] args) {
        
        // creating objects
        Scanner sc = new Scanner(System.in);
        DiamondPattern diamondPattern = new DiamondPattern();

        System.out.println("\n\t\t\t\tWelcome to the program\n\n");

        while(true)
        {
            diamondPattern.optionDisplay();
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            if(option == 1)
            {
                System.out.print("Enter a number: ");
                int number = sc.nextInt();

                System.out.print("\nPattern generated below: \n\n");

                diamondPattern.patternPrinter(number);
                System.out.println();
            }
            else if(option == 2)
            {
                System.out.println("\n\t\t\t\tThank you for using the program.\n");
                sc.close();
                break;
            }
            else
            {
                System.out.println("\n\tWrong input! Please see the options.\n");
            }
        }
    }
}
