import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author feild12-r
 * @version 8/23/2024
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Feet to Inches");
        System.out.println("8. Inches to Feet");
        System.out.println("9. Feet to Yards");
        System.out.println("10. Yards to Feet");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit - 32) * (5.0 / 9.0);
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
        }
        //add more if statements here.
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet/3.281;
            System.out.println(feet + " feet is " + meters + " meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters*3.281;
            System.out.println(meters + " meters is " + feet + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliters = ounces*29.574;
            System.out.println(ounces + " ounces is " + milliters + " milliters");
        }
        if (selection == 6)
        {
            System.out.println("Enter Milliters: ");
            double milliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = milliters/29.574;
            System.out.println(milliters + " milliters is " + ounces + " ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double inches = feet*12;
            System.out.println(feet + " feet is " + inches + " inches");
        }
        if (selection == 8)
        {
            System.out.println("Enter Inches: ");
            double inches = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = inches/12;
            System.out.println(inches + " inches is " + feet + " feet");
        }
        if (selection == 9)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double yards = feet/3;
            System.out.println(feet + " feet is " + yards + " yards");
        }
        if (selection == 10)
        {
            System.out.println("Enter Yards: ");
            double yards = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = yards*3;
            System.out.println(yards + " yards is " + feet + " feet");
        }
    }
}