package abstraction_demo;  // Define the package name

// Abstract class RBI that will be extended by different banks
abstract class RBI 
{
    float amount;  // Declare a float variable to store the loan amount

    // Method to set the loan amount
    void setAmount(float a) 
    {
        amount = a;  // Assign the value 'a' to the 'amount' variable
    }

    // Abstract methods to be implemented by subclasses
    abstract float Intrest();  // Method to calculate interest based on the amount
    abstract float SLR();      // Method to calculate Statutory Liquidity Ratio (SLR)
    abstract float CRR();      // Method to calculate Cash Reserve Ratio (CRR)
}

// Class SBI extends RBI and provides its own implementation for the abstract methods
class SBI extends RBI 
{
    // Override the abstract method to calculate interest at 8%
    @Override
    float Intrest() 
    {
        float intrest = (amount * 8) / 100;  // Calculate interest at 8% of the loan amount
        return intrest;  // Return the calculated interest
    }

    // Override the abstract method to calculate SLR at 4.5%
    @Override
    float SLR() {
        float slr = (amount * 4.5f) / 100;  // Calculate SLR at 4.5% of the loan amount
        return slr;  // Return the calculated SLR
    }

    // Override the abstract method to calculate CRR at 18%
    @Override
    float CRR() {
        float crr = (amount * 18) / 100;  // Calculate CRR at 18% of the loan amount
        return crr;  // Return the calculated CRR
    }
}

// Class HDFC extends RBI and provides its own implementation for the abstract methods
class HDFC extends RBI {
    // Override the abstract method to calculate interest at 5%
    @Override
    float Intrest() {
        float intrest = (amount * 5) / 100;  // Calculate interest at 5% of the loan amount
        return intrest;  // Return the calculated interest
    }

    // Override the abstract method to calculate SLR at 4.5%
    @Override
    float SLR() {
        float slr = (amount * 4.5f) / 100;  // Calculate SLR at 4.5% of the loan amount
        return slr;  // Return the calculated SLR
    }

    // Override the abstract method to calculate CRR at 18%
    @Override
    float CRR() {
        float crr = (amount * 18) / 100;  // Calculate CRR at 18% of the loan amount
        return crr;  // Return the calculated CRR
    }
}

// Class ICICI extends RBI and provides its own implementation for the abstract methods
class ICICI extends RBI {
    // Override the abstract method to calculate interest at 6%
    @Override
    float Intrest() {
        float intrest = (amount * 6) / 100;  // Calculate interest at 6% of the loan amount
        return intrest;  // Return the calculated interest
    }

    // Override the abstract method to calculate SLR at 4.5%
    @Override
    float SLR() {
        float slr = (amount * 4.5f) / 100;  // Calculate SLR at 4.5% of the loan amount
        return slr;  // Return the calculated SLR
    }

    // Override the abstract method to calculate CRR at 18%
    @Override
    float CRR() {
        float crr = (amount * 18) / 100;  // Calculate CRR at 18% of the loan amount
        return crr;  // Return the calculated CRR
    }
}

// Main class to run the program and compare loan amounts from different banks
public class Different_Bank_Intrest 
{
    public static void main(String[] args) 
    {
        // Display header for comparing loan amounts with different banks
        System.out.println("-----------------------------------------------------------");
        System.out.println("Comparing Home Loan amount Intrest Wise in Different Bank");
        System.out.println("-----------------------------------------------------------");

        // Create an object of the SBI class and set the loan amount
        System.out.println("State Bank of India");
        System.out.println("-----------------------------------------------------------");
        SBI sb = new SBI();  // Create an instance of SBI class
        sb.setAmount(180000.00f);  // Set the loan amount to 1.8 million
        
        // Display loan amount and calculated values for interest, SLR, and CRR
        System.out.println("The Loan Amount=" + sb.amount);
        System.out.println("Intrest of Amount= " + sb.Intrest());
        System.out.println("Statutory Liquidity Ratio= " + sb.SLR());
        System.out.println("Cash Reserve Ratio= " + sb.CRR());

        // Create an object of the HDFC class and set the loan amount
        System.out.println("-----------------------------------------------------------");
        System.out.println("Housing Development Finance Corporation Bank");
        System.out.println("-----------------------------------------------------------");
        HDFC hd = new HDFC();  // Create an instance of HDFC class
        hd.setAmount(180000.00f);  // Set the loan amount to 1.8 million
        
        // Display loan amount and calculated values for interest, SLR, and CRR
        System.out.println("The Loan Amount is: " + hd.amount);
        System.out.println("Intrest of Amount= " + hd.Intrest());
        System.out.println("Statutory Liquidity Ratio= " + hd.SLR());
        System.out.println("Cash Reserve Ratio= " + hd.CRR());

        // Create an object of the ICICI class and set the loan amount
        System.out.println("-----------------------------------------------------------");
        System.out.println("Investment Credit and Investment Corporation of Bank");
        System.out.println("-----------------------------------------------------------");
        ICICI ic = new ICICI();  // Create an instance of ICICI class
        ic.setAmount(180000.00f);  // Set the loan amount to 1.8 million
        
        // Display loan amount and calculated values for interest, SLR, and CRR
        System.out.println("The Loan Amount is: " + ic.amount);
        System.out.println("Intrest of Amount= " + ic.Intrest());
        System.out.println("Statutory Liquidity Ratio= " + ic.SLR());
        System.out.println("Cash Reserve Ratio= " + ic.CRR());
        System.out.println("-----------------------------------------------------------");
    }
}

/*
Explanation of the Code with Comments:
Abstract Class RBI:

The class RBI is an abstract class with a float amount to store the loan amount.It provides a method setAmount(float a) to set the loan amount.
Three abstract methods (Interest(), SLR(), and CRR()) are declared, which must be implemented by any class that extends RBI.
Concrete Classes (SBI, HDFC, ICICI):

Each of these classes extends RBI and provides specific implementations for the Intrest(), SLR(), and CRR() methods. SBI calculates interest at 8%, HDFC at 5%, and ICICI at 6%.
The SLR is always calculated at 4.5% of the loan amount, and the CRR is always calculated at 18%.
Main Class (IntrestApp):

The main method displays a comparison of loan amounts for the three banks, SBI, HDFC, and ICICI, by calculating their interest rates, SLR, and CRR.
For each bank, an object is created, the loan amount is set, and the values for interest, SLR, and CRR are printed to the console.
 */
