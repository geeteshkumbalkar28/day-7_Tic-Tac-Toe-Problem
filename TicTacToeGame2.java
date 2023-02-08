 
import java.util.*; 
//Mean class
public class TicTacToeGame2
{
	public static void main(String arg[])
	{
		TicTacToeStart ticTacToeStart = new TicTacToeStart();
		ticTacToeStart.startGame();
	}
}
////Game start class 
class TicTacToeStart
{
	public static void startGame()
	{
		Scanner scan = new Scanner(System.in);
		
		TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
		
		System.out.println("What you want to play the game (Player / Computer) :");
		String oppPlayerType = scan.nextLine();

		System.out.println("Choose (X / O) :");
		char chooseLetter = scan.next().charAt(0);
		
		
	}
} 
 //////////UC1-creating a tic tac toe board//////////////////////
class TicTacToeBoard
 {
	public char arr[];
				
	TicTacToeBoard()		//Constructs
	{
		arr = new char[10];
	}
	

	
 }