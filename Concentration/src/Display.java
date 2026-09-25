import java.util.ArrayList;
import java.util.List;
public class Display {
static String [][] board = new String [4][4];

	public static void prepareBoard() {
        String[] animals = {"Cat", "Dog", "Fox", "Owl", "Pig", "Cow", "Bear", "Lion"};
        List<String> cardList = new ArrayList<>();
        
        for(int i = 0; i < animals.length; i++) {
        	cardList.add(animals[i]);
        }
        int index = 0;
        for(int row = 0; row < 4; row++) {
        	for(int col = 0; col<4; col++) {
        		board[row][col] = cardList.get(index);
        		index++;
        	}
        }
}
	public static void displayBoard(){
		System.out.println("    A   B   C   D");
	    System.out.println("  -----------------");
	    System.out.println("1 | * " + board[0][0] + "| * " + board[0][1]+ "| * " + board[0][2]+ "| * " + board[0][3]+ "|");
	    System.out.println("  -----------------");
	    System.out.println("2 | * " + board[1][0] + "| * " + board[1][1]+ "| * " + board[1][2]+ "| * " + board[1][3]+ "|");
	    System.out.println("  -----------------");
	    System.out.println("3 | * " + board[2][0] + "| * " + board[2][1]+ "| * " + board[2][2]+ "| * " + board[2][3]+ "|");
	    System.out.println("  -----------------");
	    System.out.println("4 | * " + board[3][0] + "| * " + board[3][1]+ "| * " + board[3][2]+ "| * " + board[3][3]+ "|");
	    System.out.println("  -----------------");
}

}
