/*
 * Palidrome.java
 * Quentin Magoon
 * February 22, 2019
 * This program requires user to enter word then detects if the word is a palindrome
 */

package palindrome;

import javax.swing.*;

public class Palindrome {

    public static void main(String[] args) {
        
        //input box
        String wordStr = JOptionPane.showInputDialog("Words that are the same forwards and backwards are called"
            + "palindromes.\nThis program determines if a word is a palindrome.\n\nEnter a word:");
        
        //declaring strings
        String reverse = "";
        
        //reverse word
        for(int i = wordStr.length() - 1; i >= 0; i--)
        {
            reverse = reverse + wordStr.charAt(i);
        }
        
        //detects if word is a palindrome or not
        if (reverse.equals(wordStr)) {
            JOptionPane.showMessageDialog(null, wordStr + " in reverse is " + reverse +
            "\nIt is a Palindrome");
        }
        
        else{
            JOptionPane.showMessageDialog(null, wordStr + " in reverse is " + reverse +
            "\nIt is not a Palindrome");
        }
        
        //prints word
        //JOptionPane.showMessageDialog(null, wordStr + " in reverse is " + reverse);
    }
    
}
