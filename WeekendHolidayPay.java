import java.util.Scanner;
public class WeekendHolidayPay{
    public static void main(String[] args){
          // Variables and Objects
       int regularHours;
       double hourlyWage; 
        Scanner keyboard = new Scanner(System.in);
        int response;
       int saturdayOTHours;
        int sundayOThours;
       // overtimeSaturday = saturdayOTHours * 1.5 * hourlyWage;
       // overtimeSunday = sundayOThours * 2 * hourlyWage;
        //totalPay = overtimeSaturday + overtimeSunday + (regularHours * hourlyWage);


         // Input phase
        System.out.println("How many regular hours did you work?: >>");
        regularHours = keyboard.nextInt();
        System.out.println("Whats your hourly wage?: >>");
        hourlyWage = keyboard.nextDouble();
        System.out.println("Did you work overtime? Please say press 1 for YES or 2 for NO");
        response = keyboard.nextInt();

         if (response == 1){
            System.out.println("Did you work Saturday? Please press 1 for YES or 2 for NO");
            response = keyboard.nextInt();
                 }if (response == 1){
                         System.out.println("How many hours did you work?");
                        saturdayOTHours = keyboard.nextInt();
                        System.out.println("Did you work Sunday? Press 1 for YES 2 for NO");
                        response = keyboard.nextInt();
                            }if (response == 1){
                            System.out.println("How many hours did you work?");
                            sundayOThours = keyboard.nextInt();
                            if (response == 2){
                                System.out.println("Your regular hours and over time for saturday was " + regularHours * hourlyWage + saturdayOTHours * hourlyWage);
                            }
                //System.out.println("Your total pay is " + overtimeSaturday + " for saturday");
                //System.out.println("Your total pay is " + overtimeSunday + " for sunday");
                //System.out.println("Your total pay for the week is " + totalPay );
             
       } else if (response == 2) {
            System.out.println("Your pay for your regular hours are" + regularHours * hourlyWage);
        }     
    } // end of main
} // end of class