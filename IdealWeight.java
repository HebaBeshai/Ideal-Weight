/***********************************************************************************************************************
 * @file   IdealWeight.java
 * @brief This prompts users to enter their weight, giving them an ideal weight & ideal weight range
 * @author Heba Beshai
 * @date   January 31, 2016
 ***********************************************************************************************************************/
package Binary2Decimal;
import java.util.Scanner;
public class IdealWeight {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Define Variables to be Used in this program
        Double fw, FIR, FlowerIR, MIR, MlowerIR, mw, Eq, FHigherIR, MhigherIR;
        Double inches;
        int feet;

        // Ask the user to enter the data needed by the program
        System.out.println("-------------Ideal Weight Calculator-----------");
        System.out.println();
        System.out.print("Please enter your height in feet and inches [e.g. 6  2 ]: ");
        feet = keyboard.nextInt();
        inches = keyboard.nextDouble();

        // Do the needed calculations, use 1 or more variables to store your results
        Eq = ((feet * 12 - 60) + inches);
        fw = (100 + 5 * Eq);
        mw = (106 + 6 * Eq);

        FIR = fw * 0.1;
        FHigherIR = fw + FIR;
        FlowerIR = fw - FIR;
        MIR = mw * 0.1;
        MhigherIR = mw + MIR;
        MlowerIR = mw - MIR;


        // Print the results to the screen
        System.out.println();
        System.out.printf("Ideal female weight is: %.2f pounds\n", fw);
        System.out.printf("Ideal male weight is: %.2f pounds\n", mw);
        System.out.println();
        System.out.println("Ideal female weight range: [" + FlowerIR + " , " + FHigherIR + "] pounds");
        System.out.println("Ideal male weight range: [" + MlowerIR + " , " + MhigherIR + "] pounds");
    }
}