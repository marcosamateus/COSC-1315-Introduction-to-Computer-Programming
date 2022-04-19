/*
Marcos Mateus
10/12/20
JDK Version 1.8
This program will rate your tip
*/

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class TipRater {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "What was the total bill?");
        double bill = Double.parseDouble (input);
        input = JOptionPane.showInputDialog(null,"How much tip did you leave?");
        double tip = Double.parseDouble(input);
        double percentage = tip / bill; 
        DecimalFormat percenttip = new DecimalFormat("#.##%");
        String message = null;
        if (percentage < 0 || percentage > 1) {
            message = "This tip doesn't seem very likely.";
        } else if (percentage >= 0 && percentage <= .05){
            message = "You left " + percenttip.format(percentage) + " tip." 
                    +"\nWhy did you even eat out?";
        } else if (percentage > .05 && percentage <= .1){
            message = "You left " + percenttip.format(percentage) + " tip."
                    + "\nDefinitely not considered a good tip.";
        } else if (percentage > .1 && percentage <= .2){
            message = "You left " + percenttip.format(percentage) + " tip."
                    + "\nThis is a fairly standard tip!";
        } else if (percentage > .2 && percentage <= .3){
            message = "You left " + percenttip.format(percentage) + " tip."
                    + "\nThis is a really good tip!";
        } else if (percentage > .3){
            message = "You left " + percenttip.format(percentage) + " tip."
                    + "\nYou are a SAINT!!";
        } 
        JOptionPane.showMessageDialog(null,message);
    }
}
