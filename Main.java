import java.util.Random;
import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Random random = new Random() ;

       int num;

       while (true) {
           System.out.print("Please enter the number of dice to roll: ");

           if (scanner.hasNextInt()) {
               num = scanner.nextInt();

               if (num > 0) {
                   break;
               } else {
                   System.out.println("Invalid number! Please enter a positive number.");
               }

           } else {
               System.out.println("Invalid input! Please enter a whole number.");
               scanner.next(); // Removes the invalid input
           }
       }

        //
            int total = 0 ;
        for (int i=0 ; i<num ; i++){
            int dice = random.nextInt(1 , 7) ;
           total = total + dice ;
            dice(dice);

            System.out.println("you rolled : " + dice);
        }

       System.out.println("you have rolled = "+ total);

   }
   static int dice(int dice) {
       switch (dice){
           case 1 :
               System.out.println("-------\n" +
                       "|       |\n" +
                       "|   ●   |\n" +
                       "|       |\n" +
                       "-------");
               return dice+1 ;


               //
           case 2 :
               System.out.println("-------\n" +
                       "| ●     |\n" +
                       "|       |\n" +
                       "|     ● |\n" +
                       "-------\n");
               return dice+2 ;


               //
           case 3 :
               System.out.println("-------\n" +
                       "| ●     |\n" +
                       "|   ●   |\n" +
                       "|     ● |\n" +
                       "-------");
               return dice+3 ;

               //
           case 4 :
               System.out.println("-------\n" +
                       "| ●   ● |\n" +
                       "|       |\n" +
                       "| ●   ● |\n" +
                       "-------");
               return dice+4 ;

               //
           case 5 :
               System.out.println(" -------\n" +
                       "| ●   ● |\n" +
                       "|   ●   |\n" +
                       "| ●   ● |\n" +
                       "-------");
               return dice+5 ;


               //

           case 6 :
               System.out.println("-------\n" +
                       "| ●   ● |\n" +
                       "| ●   ● |\n" +
                       "| ●   ● |\n" +
                       "-------");
               return dice + 6 ;


       }
  return 0 ;
   }
}