import java.util.Scanner;
public class OvertimePay{
    public static void main(String[] args){
          // Variables and Objects
       int regularHours;
       double hourlyWage; 
        Scanner keyboard = new Scanner(System.in);
        int response;
       int saturdayOTHours = 0;
        int sundayOThours = 0;
        double overtimeSaturday;
       double overtimeSunday;
        //totalPay = overtimeSaturday + overtimeSunday + (regularHours * hourlyWage);
       int overtimeResponse;
       int saturdayOTResponse;
       int sundayOTResponse;
       

         // Input phase


         // Step 1 collect all input
        System.out.println("How many regular hours did you work?: >>");
        regularHours = keyboard.nextInt();
        System.out.println("Whats your hourly wage?: >>");
        hourlyWage = keyboard.nextDouble();
        System.out.println("Did you work overtime? Please say press 1 for YES or 2 for NO");
        overtimeResponse = keyboard.nextInt();
         if (overtimeResponse == 1){
            // IF OVERTIME IS TRUE
            System.out.println("Did you work Saturday? Press 1 for YES or 2 for NO"); // if there an IF inside an IF
            saturdayOTResponse = keyboard.nextInt();
            
            if (saturdayOTResponse == 1){
               // IF Saturday is TRUE
               System.out.println("How many hours did you work");
               saturdayOTHours = keyboard.nextInt();
         

            } 
            // This line will execute no matter what to saturday responses
            System.out.println("Did you work Sunday Press 1 for YES or 2 for NO");
            sundayOTResponse = keyboard.nextInt();
            
            if (sundayOTResponse == 1) {
               // IF Sunday is TRUE
               System.out.println("How many hours did you work?");
               sundayOThours = keyboard.nextInt();
            } 

         }
         
         // Step 2 Calculate pay
         double regularPay = regularHours * hourlyWage;
         double overtimeSaturdayPay = saturdayOTHours * 1.5 * hourlyWage;
         double overtimeSundayPay = sundayOThours * 2 * hourlyWage;
         double totalOvertimePay = overtimeSaturdayPay + overtimeSundayPay;
         double totalPay = regularPay + totalOvertimePay;

         // Step 3 Report pay
         System.out.println("Your regular pay is " + regularPay);
         if (overtimeResponse == 1){
            System.out.println("Your overtime pay is " + totalOvertimePay);
         }
         
         System.out.println("Your total pay is " + totalPay);

 
        
        
        




    } // end of main
} // end of class