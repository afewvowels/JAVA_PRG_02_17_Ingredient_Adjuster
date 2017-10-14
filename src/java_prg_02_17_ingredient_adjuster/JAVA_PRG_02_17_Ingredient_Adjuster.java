/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_17_ingredient_adjuster;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * A cookie recipe calls for the following ingredients:
 *  - 1.5 cups of sugar
 *  - 1 cup of butter
 *  - 2.75 cups of flour
 * The recipe produces 48 cookies with these amounts of the ingredients. Write
 * a program that asks the user how many cookies he or she wants to make, and
 * then displays the number of cups of each ingredient needed for the specified
 * number of cookies.
 */
public class JAVA_PRG_02_17_Ingredient_Adjuster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define constants
        final int INT_COOKIES_BASE = 48;
        
        final float FLT_SUGAR_BASE = 1.5f;
        final float FLT_BUTTER_BASE = 1.0f;
        final float FLT_FLOUR_BASE = 2.75f;
        
        // Define variables to hold user input and adjusted amounts
        int intCookies;
        
        float fltSugar;
        float fltButter;
        float fltFlour;
        
        // Create keyboard for user input
        Scanner scrKeyboard = new Scanner(System.in);
        
        // Prompt for user input and get user input
        System.out.print("Please enter the number of cookies you would " +
                            "like to bake: ");
        intCookies = scrKeyboard.nextInt();
        
        // Calculate ingredients necessary
        fltSugar = intCookies * (FLT_SUGAR_BASE / INT_COOKIES_BASE);
        fltButter = intCookies * (FLT_BUTTER_BASE / INT_COOKIES_BASE);
        fltFlour = intCookies * (FLT_FLOUR_BASE / INT_COOKIES_BASE);
        
        // Output results to console
        System.out.println("You will need," +
                            "\nSugar: " + fltSugar +
                            "\nButter: " + fltButter +
                            "\nFlour: " + fltFlour);
    }
    
}
