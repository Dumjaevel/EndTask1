package EndTask;

import java.util.Scanner;

public class charBackgroundMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharBackground Bground = new CharBackground();
        System.out.println("Please enter your characters backstory. When you're finished, simply type stop.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {


                break;
            }

            Bground.readInput(input);
            System.out.println("You wrote " +input+ ".");
        }
        String result = Bground.readResults();
        System.out.print(result);
    

    }




}


