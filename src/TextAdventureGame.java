import java.util.Scanner;

public class TextAdventureGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("You find yourself in a dark forest. Do you want to go left or right?");

        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("left")) {
            System.out.println("You encounter a friendly dragon! Do you want to talk or run?");
            choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("talk")) {
                System.out.println("The dragon shares treasure secrets with you. You win!");
            } else {
                System.out.println("You attempt to run away but the dragon breathes fire onto you. Game over.");
            }
        } else if (choice.equalsIgnoreCase("right")) {
            System.out.println("You fall into a pit! Do you want to climb out or wait?");
            choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("climb out")||choice.equalsIgnoreCase("climb")) {
                System.out.println("You escape the pit and find a way home. You win!");
            } else {
                System.out.println("You wait too long and get suffocated by a landslide. Game over.");
            }
        } else {
            System.out.println("Invalid choice. Game over.");
        }
    }
}