package org.example;
import java.util.Scanner;
public class App {
  public static void main(String[] args) {
    System.out.println("Welcome! It's time to convert some ounces.");
    Scanner myFirstScanner = new Scanner(System.in);
    System.out.print("How many ounces are we talking here? ");
    int oz = myFirstScanner.nextInt();
    System.out.println("Alright.. Got it.. Let's do this.");
    Converter converter = new Converter();
    String intAndRemain = converter.toPoundsAndOunces(oz);
    String doublelbs = converter.toPounds(oz);
    System.out.println(oz + " oz equals " + intAndRemain +".");
    System.out.println(oz + " oz equals " + doublelbs +".");
    System.out.println("Thanks for checking out my program. Have a great day.");
    myFirstScanner.close();
  }
}
