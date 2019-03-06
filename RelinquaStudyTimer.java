/* Sameer Alabran
**MIS final project(Relinqua)
**The program uses the promodo technique by allowing the user to set specific study time and break time
** while diplaying random motivational messages
*/

import java.util.Scanner;//this will allow users to enter their info
import java.util.Random;//this will allow program to select random motivational message 
import java.util.Timer;
import java.util.Date;//this will display date and time in statistics. 
import java.util.TimerTask;// this will allow us to use stopwatch like timer.
import java.awt.*;//this will be used for the timer sound

public class RelinquaStudyTimer{
   public static void main(String[] args) throws InterruptedException//throw this because thread is sleeping, otherwise program wont run.
   {
      int counterS = 0; 
      int counterB = 0; 
      int counterT =0;
      Scanner input = new Scanner(System.in);
      System.out.println("**********Welcome to Relinqua**********\n");
      System.out.println("Please enter your first name: ");
      String name = input.nextLine();
      System.out.println();
      System.out.println();
      System.out.println("****************************************");
      System.out.println("Relinqua, it's Time to Reenergize!");
      System.out.println("****************************************");
      System.out.println("\n\n");
      System.out.println(name +", How many study intervals would you like?: ");
         int studyInterval = input.nextInt();//user inputs how much times
      System.out.println(name +", how long would you like to make study your study intervals(minutes): ");
         int studyTime = input.nextInt()* 60;//User inputs desired length of each study interval.
         long delay = studyTime * 1000;
         counterS += studyTime * studyInterval; 
         
         
         for(int i = 0; i < studyInterval; i++){
         run(studyTime,delay);
         Toolkit.getDefaultToolkit().beep();
         System.out.println("*************************************************************");  
         //this is an array that stores multiple motivational messages randomly displays one of these motivational messages
         String messages[] ={/*1*/"Push yourself, because no one else is going to do it For you!", /*2*/ "If it is important you will find a way. If not, you will find an excuse.", /*3*/"The secret to getting ahead is getting started",/*4*/"The expert in anything was once a beginner",/*5*/ "It always seems impossible until it is DONE",/*6*/ "I'm not telling you it's going to be easy, i'm telling you it's going to be worth it",/*7*/"A year from now you'll wish you had started TODAY",/*8*/"Wake up with DETERMINATION. Go to bed with SATISFACTION"};
         Random quote = new Random();
         int n = quote.nextInt(8);
         String msg = messages[n];
         System.out.println(msg);
         System.out.println("*************************************************************");
         //allows the user to take a break after their study interval
         System.out.println("Would you like take to take a break: (Enter 1 for yes, Enter 2 for no)"); 
         int takeBreak = input.nextInt(); 
         if( takeBreak == 1){
            System.out.println("How long would you like your break to be (minutes): "); 
            int breakTime = input.nextInt() * 60;
            long delay1 = breakTime * 1000;
            counterB += breakTime;
            runBreak(breakTime, delay1); 
            
         
         
         } 
         
         }
         
         counterT = counterS + counterB; 
         System.out.println();
         System.out.println();
              
         System.out.println("************************************************************************");
         System.out.println("Total Study Time = " + counterS/60 + " Min || Total Break Time = " + counterB/60 + " Min || Total Time = " + counterT/60+ "Min");

     
       Toolkit.getDefaultToolkit().beep();
       Toolkit.getDefaultToolkit().beep();
       Toolkit.getDefaultToolkit().beep();
       Toolkit.getDefaultToolkit().beep();
       Toolkit.getDefaultToolkit().beep();
       
       System.out.println("************************************************************************");
      
       
          }
     
     public static void run(int sTime, long delay)throws InterruptedException{
      System.out.println("\n");
      System.out.println("Running Study Timer");
      System.out.println("\n");
       do{
         
         int minutes = sTime /60;
         int seconds = sTime %60;
         System.out.println(minutes +" minute(s),"+ seconds +" second(s)");
         Thread.sleep(1000);//pause execution of program. 
         sTime = sTime - 1;
         delay = delay - 1000;
       
         }
         while(delay !=0);
     
     }
     
     
     public static void runBreak(int sTime, long delay)throws InterruptedException{
      System.out.println("\n");
      System.out.println("Running Break Timer");
      System.out.println("\n");
     
       do{
        
         int minutes = sTime /60;
         int seconds = sTime %60;
         System.out.println(minutes +" minute(s),"+ seconds +" second(s)");
         Thread.sleep(1000);//pause execution of program. 
         sTime = sTime - 1;
         delay = delay - 1000;
       
         }
         while(delay !=0);
     
     }
 
 

       
      
      }
      
      
      
      
    
      
      






   


