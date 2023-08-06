import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rdn = new Random();


        System.out.println("Welcome to this game");
        System.out.println("Please enter for how many rounds do you want to play this game ");
        int rounds = sc.nextInt();


        System.out.println("In this game , i will select a number , you will have to guess that number");
        System.out.println("Please enter the range as i say ");
        System.out.println("Please enter the minimum Value ");
        int min = sc.nextInt();

        
        System.out.println("Please enter the maximum Value");
        int max = sc.nextInt();


            for (int a = 1 ; a<=rounds ; a++){



        System.out.println("The range assigned is " +min+ " to " +max);


                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }
        System.out.println("The computer will now select the number between these ");
        int comp = rdn.nextInt(min , max);
        System.out.println("The computer has selected its value , now its your turn to guess");
        int guess = sc.nextInt();



        if(guess == comp ){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                System.out.println("Got Interrupted");
            }
            System.out.println("the computer has guessed  " + comp + "and you have guessed  "+guess);
            System.out.println("Congrats , you have guessed the correct value ");
        }


        else {
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                System.out.println("Got Interrupted");
            }
            System.out.println("the computer has guessed  " + comp + "and you have guessed  " + guess);
            System.out.println("You have guessed incorrect value");
        }
        }
    }
}