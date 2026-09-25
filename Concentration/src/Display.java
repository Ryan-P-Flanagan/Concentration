import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
		
		System.out.println("which 2 spaces would you like to guess");
	}

}
