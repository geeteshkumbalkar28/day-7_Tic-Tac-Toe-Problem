 
import java.util.*; 
//Mean class
public class TicTacToeGame1
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
		TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
	

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