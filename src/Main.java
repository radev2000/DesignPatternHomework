import java.util.Scanner;
import command.Command;
import command.GetBicycle;
import command.GetDoll;
import observer.Elf;
import observer.Board;
import singleton.Santa;

//TODO: Add Readme

public class Main {

    /**
     * @title Design Patterns Homework - Santa
     * @author Zlatomir Radev
     * @dev Run the app only from the main() function in Main.java. Make sure there
     *      are no changes in the packeges.
     */
    public static void main(String[] args) {

        // use try-with to close the Scanner
        try (Scanner input = new Scanner(System.in)) {

            boolean loop = true;

            Command command;
            Santa santa = Santa.getInstance();

            Board board = new Board();
            Elf elf = new Elf("Elf");
            board.addElfToBoard(elf);

            // use Labels...
            choosing: do {
                System.out.println("Hello, Santa, what toy do you need? (`Doll` or `Bicycle`)");
                String cmdString = input.nextLine();
                if (cmdString.equals("Bicycle")) {
                    command = new GetBicycle(board);
                } else if (cmdString.equals("Doll")) {
                    command = new GetDoll(board);
                } else {
                    System.out.println("Invalid toy. Please enter `Doll` or `Bicycle`!");
                    continue choosing;
                }

                command.execute();
                System.out.println("Do you want more toys? (`no` or press Enter)");
                String addMoreToys = input.nextLine();

                if (addMoreToys.equals("no")) {
                    loop = false;
                }
            } while (loop);

            santa.printToys();
        }
    }
}