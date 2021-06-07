/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 4 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create. */

package org.example;
import java.util.Scanner;

public class practiceexample4 {
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter Noun: ");
        String noun = keyboardInput.nextLine();

        System.out.print("Enter a Verb : ");
        String Verb = keyboardInput.nextLine();

        System.out.print("Enter Adjective: ");
        String Adjective = keyboardInput.nextLine();

        System.out.print("Enter Adverb: ");
        String Adverb = keyboardInput.nextLine();

        System.out.println("Have you " +Verb +" your " + Adjective +" "+ noun +" "+ Adverb+" ? That's hilarious");

    }
}
