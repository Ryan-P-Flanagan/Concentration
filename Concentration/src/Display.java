import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Display {
static String [][] board = new String [4][4];
static boolean [][] revealed = new boolean [4][4];

	public static void prepareBoard() {
        String[] animals = {"Cats", "Dogs", "Foxs", "Owls", "Pigs", "Cows", "Bear", "Lion"};
        List<String> cardList = new ArrayList<>();
        
        for(int i = 0; i < animals.length; i++) {
        	cardList.add(animals[i]);
        	cardList.add(animals[i]);
        }
        Collections.shuffle(cardList);
        int index = 0;
        for(int row = 0; row < 4; row++) {
        	for(int col = 0; col<4; col++) {
        		board[row][col] = cardList.get(index);
        		revealed[row][col] = false;
        		index++;
        	}
        }
}
	public static void displayBoard() {
        System.out.println("      A       B       C       D");
        System.out.println("  +-------+-------+-------+-------+");   
        for (int row = 0; row < 4; row++) {
            System.out.print((row + 1) + " ");
            for (int col = 0; col < 4; col++) {
            	String cardText;

            	if (revealed[row][col] == true) {
            	    cardText = board[row][col]; 
            	} else {
            	    cardText = "*";         
            	}
            	System.out.print("| " + cardText + "     ");
            }
            System.out.println("|");
            System.out.println("  +-------+-------+-------+-------+");
        }
    }
	public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int matches = 0;
        while (matches < 8) {
            displayBoard();
            int r1 = -1;
            int c1 = -1;
            while (r1 < 0 || r1 > 3 || c1 < 0 || c1 > 3) {
                System.out.print("Enter row (1-4) and col (0-3 for A-D) for FIRST card");
                r1 = scanner.nextInt() - 1;
                c1 = scanner.nextInt();
                if (r1 < 0 || r1 > 3 || c1 < 0 || c1 > 3) {
                    System.out.println("Invalid selection! Row must be 1-4 and Col must be 0-3.");
                }
            }
            revealed[r1][c1] = true;
            displayBoard();
            int r2 = -1, c2 = -1;
            while (r2 < 0 || r2 > 3 || c2 < 0 || c2 > 3) {
                System.out.print("Enter row (1-4) and col (0-3 for A-D) for SECOND card");
                r2 = scanner.nextInt() - 1;
                c2 = scanner.nextInt();
                if (r2 < 0 || r2 > 3 || c2 < 0 || c2 > 3) {
                    System.out.println("Invalid selection! Row must be 1-4 and Col must be 0-3.");
                } else if (r1 == r2 && c1 == c2) {
                    System.out.println("You can't pick the exact same card twice!");
                    r2 = -1;
                }
            }
            revealed[r2][c2] = true;
            displayBoard();
            if (board[r1][c1].equals(board[r2][c2])) {
                System.out.println("Match!\n");
                matches++;
            } else {
                System.out.println("Not a match!");
                System.out.println("Press Enter to flip cards back...");
                scanner.nextLine();
                scanner.nextLine();
                revealed[r1][c1] = false;
                revealed[r2][c2] = false;
            }
        }
        System.out.println("You won!");
    }
}

