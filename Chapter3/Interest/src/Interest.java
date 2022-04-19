/* Marcos Mateus 9/24/20
 * This program will calculate simple interest
 * JDK Version 1.8
 */

import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class Interest {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog (null,"How many dollars do you wish to borrow?");
        double amount = Double.parseDouble(input);
        input = JOptionPane.showInputDialog (null, "What is the interest rate?");
        double rate = Double.parseDouble (input);
        input = JOptionPane.showInputDialog (null, "How many years will you take the loan? (whole number)");
        int years = Integer.parseInt(input);
        double interest;
        interest = amount * (rate/100) * years;
        
        NumberFormat dollars = NumberFormat.getCurrencyInstance ();
        JOptionPane.showMessageDialog (null, "If you borrow " + dollars.format(amount) + " at an interest rate of " 
        + rate + " for " + years + " years, you will pay " + dollars.format(interest) + " in interest.");    
    }
    
}
