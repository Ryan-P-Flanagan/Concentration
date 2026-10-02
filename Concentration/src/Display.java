import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
<<<<<<< HEAD
import java.util.Scanner; 
=======
import java.util.Scanner;
>>>>>>> f6aed3f355d5d8f7dc060dd853bbf78a82e67305
public class Display {
    static String[][] board = new String[4][4];
    static boolean[][] revealed = new boolean[4][4];
    public static void prepareBoard() {
        String[] animals = {"Cats", "Dogs", "Foxs", "Owls", "Pigs", "Cows", "Bear", "Lion"};
        List<String> cardList = new ArrayList<>();

        for (int i = 0; i < animals.length; i++) {
            cardList.add(animals[i]);
            cardList.add(animals[i]);
        }
        Collections.shuffle(cardList);

        int index = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                board[row][col] = cardList.get(index);
                revealed[row][col] = false;
                index++;
            }
        }
    }

    public static void displayBoard() {
    	System.out.println("Hi");
        System.out.println("      A       B       C       D");
        System.out.println("  +-------+-------+-------+-------+");
        for (int row = 0; row < 4; row++) {
            System.out.print((row + 1) + " ");
            for (int col = 0; col < 4; col++) {
                String cardText = revealed[row][col] ? board[row][col] : "*";

                if (cardText.length() == 1) {
                    System.out.print("| " + cardText + "     ");
                } else if (cardText.length() == 4) {
                    System.out.print("| " + cardText + "  ");
                } else {
                    System.out.print("| " + cardText + " ");
                }
            }
            System.out.println("|");
            System.out.println("  +-------+-------+-------+-------+");
        }
    }
<<<<<<< HEAD

    public static void playGame() {
=======
	public static void playGame() {
>>>>>>> f6aed3f355d5d8f7dc060dd853bbf78a82e67305
        Scanner scanner = new Scanner(System.in);
        int matches = 0;
        while (matches < 8) {
            displayBoard();
<<<<<<< HEAD
            int r1 = 0, c1 = 0;
            while (true) {
                System.out.print("Enter first card (Like A1): ");
                String input1 = scanner.nextLine().toUpperCase();
                String col1Str = input1.substring(0, 1);
                String row1Str = input1.substring(1, 2);
                c1 = 0;
                if (col1Str.equals("B")) 
                	{ c1 = 1; }
                if (col1Str.equals("C")) 
                	{ c1 = 2; }
                if (col1Str.equals("D")) 
                	{ c1 = 3; }
                r1 = 0;
                if (row1Str.equals("2")) 
                	{ r1 = 1; }
                if (row1Str.equals("3")) 
                	{ r1 = 2; }
                if (row1Str.equals("4")) 
                	{ r1 = 3; }
                if (revealed[r1][c1]) {
                    System.out.println("That spot is already flipped! Choose another.");
                } else {
                    break;
=======
            int r1 = -1;
            int c1 = -1;
            while (r1 < 0 || r1 > 3 || c1 < 0 || c1 > 3) {
                System.out.print("Enter row (1-4) and col (0-3 for A-D) for FIRST card");
                r1 = scanner.nextInt() - 1;
                c1 = scanner.nextInt();
                if (r1 < 0 || r1 > 3 || c1 < 0 || c1 > 3) {
                    System.out.println("Invalid selection! Row must be 1-4 and Col must be 0-3.");
>>>>>>> f6aed3f355d5d8f7dc060dd853bbf78a82e67305
                }
            }
            revealed[r1][c1] = true;
            displayBoard();
<<<<<<< HEAD
            int r2 = 0, c2 = 0;
            while (true) {
                System.out.print("Enter second card (Like B2): ");
                String input2 = scanner.nextLine().toUpperCase();
                String col2Str = input2.substring(0, 1);
                String row2Str = input2.substring(1, 2);
                c2 = 0;
                if (col2Str.equals("B")) 
                	{ c2 = 1; }
                if (col2Str.equals("C")) 
                	{ c2 = 2; }
                if (col2Str.equals("D")) 
                	{ c2 = 3; }
                r2 = 0;
                if (row2Str.equals("2")) 
                	{ r2 = 1; }
                if (row2Str.equals("3")) 
                	{ r2 = 2; }
                if (row2Str.equals("4")) 
                	{ r2 = 3; }
                if (r1 == r2 && c1 == c2) {
                    System.out.println("You cannot pick the exact same spot twice!");
                } else if (revealed[r2][c2]) {
                    System.out.println("That spot is already flipped! Choose another.");
                } else {
                    break;
=======
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
>>>>>>> f6aed3f355d5d8f7dc060dd853bbf78a82e67305
                }
            }
            revealed[r2][c2] = true;
            displayBoard();
            if (board[r1][c1].equals(board[r2][c2])) {
                System.out.println("Match!\n");
                matches++;
            } else {
                System.out.println("Not a match!");
<<<<<<< HEAD
                System.out.println("Press Enter to continue...");
                scanner.nextLine();

=======
                System.out.println("Press Enter to flip cards back...");
                scanner.nextLine();
                scanner.nextLine();
>>>>>>> f6aed3f355d5d8f7dc060dd853bbf78a82e67305
                revealed[r1][c1] = false;
                revealed[r2][c2] = false;
            }
        }
        System.out.println("You won!");
    }
<<<<<<< HEAD
}
=======
}

>>>>>>> f6aed3f355d5d8f7dc060dd853bbf78a82e67305
