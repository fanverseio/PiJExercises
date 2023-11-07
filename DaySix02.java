package PiJExercises;
import java.util.Scanner;
public class DaySix02 {

    public static void main(String[] args){

        boolean isOver = false;
        int totalCount = 0;
        int distCount = 0;
        int meritCount = 0;
        int passCount=0;
        int failCount = 0;
        int invalid = 0;
        int distinction = 70;
        int merit = 60;
        int pass = 50;
        Scanner scan = new Scanner (System.in);
        int userInput;



        do {
            System.out.print("Input a mark: ");
            userInput = scan.nextInt();
            if (userInput < pass && userInput > 0){
                failCount ++;
           } else if (userInput> pass && userInput<merit){
                passCount ++;
            }else if (userInput>merit && userInput < distinction){
                meritCount ++;
            } else if (userInput>distinction && userInput <=100){
                distCount ++;
            } else if (userInput == -1) {
                isOver = true;
            } else {
                invalid ++;
            }
            totalCount ++;
        } while (!isOver);

        System.out.println("Total: " + totalCount);
        System.out.println("Distinction: " + distCount);
        System.out.println("Merits: " + meritCount);
        System.out.println("Passes: " + passCount);
        System.out.println("Failed: " + failCount);
        System.out.println("Invalid: " + invalid);

    }




    }


