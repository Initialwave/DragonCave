import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Title
        System.out.println("=== Dragon Cave ===");

        //Intro and user input
        System.out.println("You are in a land filled with Dragons. \nIn front of you, you see Two caves. \nIn one cave, the Dragon is Friendly \n and will share his treasure with you. The other Dragon \nis greedy and will eat you on sight. \nWhich cave will you go into?");

        //create Scanner
        Scanner choice = new Scanner(System.in);


        //make a variable to hold user input
        int userChoice;

        //assign to scanner
        userChoice = Integer.parseInt(choice.nextLine());

        //if statement to determine outcome
        if (userChoice == 1) {
            System.out.println("You Approach the cave... \nIt's dark and spooky... \nA large dragon jumps out from behind a wall! He snarls and... \n Eats you whole!");
        } else if (userChoice == 2) {
            System.out.println("You approach the cave.... \nIt glows faintly... \nYou see a large dragon laying upon a mountain of gold! \nThe dragon offers you a satchel to fill with treasure!");
        }
    }
}
