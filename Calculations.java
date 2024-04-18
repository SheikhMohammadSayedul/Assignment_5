// this class computes --
// 1. Sum of all even numbers between 2 and 100 (inclusive).
// 2. Sum of all squares between 1 and 100 (inclusive).
// 3. All powers of 2 from 2^0 up to 2^20.
// 4. Sum of all odd numbers between a and b (inclusive), here a and b are user inputs.
// 5. Sum of all odd digits of an input number.

import java.util.Scanner;

public class Calculations
{
    // returns sum of all even numbers between 2 to 100 (inclusive)
    public Long sumOfEvenNumbers(Long start, Long end)
    {
        Long sum = 0L;
        for(Long i=sum; i<=end; i++)
        {
            if(i%2 == 0)
            {
                sum = sum + i;
            }
        }

        return sum;
    }

    // returns sum of all squares between 1 and 100 (inclusive)
    public Long sumOfSquares()
    {
        Long sum = 0L;
        for(Long i=1L; i<=100; i++)
        {
            sum = sum + (i*i);
        }

        return sum;
    }

    // returns power of 2.
    public Long generatePowerOfTwo(Long limit)
    {
        Long result = 1L;
        for(Long i=1L; i<=limit; i++)
        {
            result = result * 2;
        }

        return result;
    }

    // prints all powers of 2 from 2^0 up to 2^20.
    public void powerOfTwo()
    {
        for(Long i=0L; i<=20; i++)
        {
            System.out.printf("\t2 to the power %d = %d\n",i,generatePowerOfTwo(i));
        }

    }


    // returns sum of all odd numbers between a and b. Here a and b are user inputs.
    public Long sumOfOddNumbers()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tCalulator of sum of odd numbers in a given range.\n");

        // taking input.
        Long a,b;
        System.out.print("\tEnter start point: ");
        a = sc.nextLong();
        System.out.print("\tEnter ending point: ");
        b = sc.nextLong();

        // calculating sum of odd numbers.
        Long result = 0L;

        for(Long i=a; i<=b; i++)
        {
            if(i%2 == 1)
            {
                result = result + i;
            }
        }

        return result;
    }


    // returns sum of all odd digits of an input.
    public Long sumOfOddDigits()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tCalulator of sum of odd digits from a number.\n");

        // taking input from user.
        Long number;
        System.out.print("\tEnter a number: ");
        number = sc.nextLong();

        // calculating sum of all odd digits.
        Long result = 0L;

        while(number != 0L)
        {
            Long digit = number%10L;

            if(digit % 2 == 1) 
            {
                result = result + digit;
            }

            number = number / 10L;
        }

        return result;
    }

    // option displayer of the program.
    // returns the option which user choosed.
    public int optionDisplay()
    {
        int option;

        Scanner sc = new Scanner(System.in);

        System.out.println("\t\tOption-1 : Sum of all even numbers between 2 and 100 (inclusive).");
        System.out.println("\t\tOption-2 : Sum of all squares between 1 and 100 (inclusive).");
        System.out.println("\t\tOption-3 : All powers of 2 from 2^0 up to 2^20.");
        System.out.println("\t\tOption-4 : Sum of all odd numbers between a range (inclusive).");
        System.out.println("\t\tOption-5 : Sum of all odd digits of an input number.");
        System.out.println("\t\tOption-6 : Exit the program.\n");

        System.out.print("Enter your option: ");
        option = sc.nextInt();

        return option;
    }
}