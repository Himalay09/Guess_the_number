import java.util.Scanner;
import java.util.Random;
public class Guess_The_Number {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int bycom = rand.nextInt(1,101);
        int i = 20;
        int j = 1;
        System.out.println("\n***Wellcome to Guess The Number game***");
        while(i>0){    
        System.out.println();
        System.out.println(j+ " Now you have " + i + " chances left");
        System.out.println("Enter your Choise between 1 - 100");
        int byuser = sc.nextInt();
        if(bycom == byuser){
            System.out.println("Great you guess the number..");
            System.out.println("Your score is " + j + " times");
            break;
        }
        
        else if(bycom > byuser){
            System.out.println("your number is smaller than orignal number..");
        }
        else if(byuser <1 || byuser>100){
            System.out.println("Enter no. from 1 to 100");
        }
        else if(byuser > bycom){
            System.out.println("Your number is bigger than orignal number..");
        }
        i--;
        j++;
    }
    
        sc.close();
    }
    
}
