
public class CalculationsRunner {
    
    public static void main(String args[])
    {
        Calculations calculations = new Calculations();

        System.out.println("\n\t\t\t\tWelcome to the program\n");

        while(true)
        {
            int option = calculations.optionDisplay();


            if(option == 1)
            {
                Long sumOfEven = calculations.sumOfEvenNumbers(2L, 100L);
                System.out.printf("\n\tSum of even numbers from 2 to 100: %d\n\n",sumOfEven);
            }
            else if(option == 2)
            {
                Long resultOfSumOfSquare = calculations.sumOfSquares();
                System.out.printf("\n\tSum of squares from 1 to 100: %d\n\n",resultOfSumOfSquare);
            }
            else if(option == 3)
            {
                // printing power of 2 from 0 to 20.
                System.out.println("\n\tPrinting results of 2^0 to 2^20\n");
                calculations.powerOfTwo();
                System.out.println();
            }
            else if(option == 4)
            {
                Long sumOfOdd = calculations.sumOfOddNumbers();
                System.out.printf("\n\tSum of odd numbers: %d\n\n",sumOfOdd);
            }
            else if(option == 5)
            {
                Long resultOfOddDigits = calculations.sumOfOddDigits();
                System.out.printf("\n\tSum of odd digits: %d\n\n",resultOfOddDigits);
            }
            else if(option == 6)
            {
                System.out.println("\n\t\t\t\tThank you for using the program.\n");
                break;
            }
            else
            {
                System.out.println("\n\tWrong input!Please see the options.\n");
            }
        }
        
    }
}

