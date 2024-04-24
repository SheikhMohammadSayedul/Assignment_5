// This class displays, using asterisks, a filled diamond
// of the given side length. For example, if the side length is 4, the program will display:
// 
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *

public class DiamondPattern
{

    // prints the diamond pattern.
    public void patternPrinter(int limit)
    {
        // upper portion of the diamond printer.
        for(int row = 1; row<=limit; row++)
        {
            // space printer
            for(int col=1; col<=limit-row; col++)
            {
                System.out.print(" ");
            }

            // asterisk printer.
            for(int col=1; col<2*row; col++)
            {
                System.out.print("*");
            }

            // new line.
            System.out.println();
        }

        // lower portion of the diamond printer.
        for(int row = limit-1; row>=1; row--)
        {
            // space printer.
            for(int col =1; col<=limit-row; col++)
            {
                System.out.print(" ");
            }

            // asterisk printer
            for(int col =1; col<row*2; col++)
            {
                System.out.print("*");
            }

            // new line
            System.out.println();
        }
    }



    // option displayer of the program.
    public void optionDisplay()
    {
        System.out.println("\t\tOption-1 : Generate pattern.");
        System.out.println("\t\tOption-2 : Exit the program.\n");
    }
}