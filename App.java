import java.util.*;
import board.board;
import player.player;
import game.game;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First project ->Tic Tac Toe");

        board b = new board(3, '-');

        b.printBoardConfig();

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter hte player name:");
        // String name = sc.nextLine();
        // System.out.println("Please enter the symbol of player:");
        // char symbol = sc.nextLine().charAt(0);

        player p1 = new player();
        p1.setPlayerDetails("Ram", 'R', "Ayodhya", "7777777777", "ram77@gamil.com", 20);
        p1.getPlayerDetails();
        p1.changeSymbol('o');
        p1.getPlayerDetails();
        player p2 = new player();
        p2.setPlayerDetails("Arjun", 'x', "Indore", "7898097651", "ram77@gamil.com", 21);
        p2.getPlayerDetails();

        game game = new game(new player[] { p1, p2 }, b);
        game.play();

    }

}
