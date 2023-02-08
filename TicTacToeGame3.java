 
import java.util.*; 
//Mean class
public class TicTacToeGame3
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
		ticTacToeBoard.showBoard();
		
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
	
	///////Display the board /////////////////
	public void showBoard()
	{
		System.out.println("             "+"+---+---+---+");
		System.out.print("             ");
		if(arr[1] == 'X' || arr[1] == 'O')
		{
			System.out.print("| "+arr[1]+" + ");
		}
		else
		{
			System.out.print("|   + ");
		}
		if(arr[2] == 'X' || arr[2] == 'O')
		{
			System.out.print(arr[2]+" + ");
		}
		else
		{
			System.out.print("  + ");
		}
		if(arr[3] == 'X' || arr[3] == 'O')
		{
			System.out.print(arr[3]+" |");
			
		}
		else
		{
		System.out.print("  |");
		}
		System.out.println();
		
		System.out.println("             "+"+---+---+---+");
		
		System.out.print("             ");
		if(arr[4] == 'X' || arr[4] == 'O')
		{
			System.out.print("| "+arr[4]+" + ");
		}
		else
		{
			System.out.print("|   + ");
		}
		if(arr[5] == 'X' || arr[5] == 'O')
		{
			System.out.print(arr[5]+" + ");
		}
		else
		{
			System.out.print("  + ");
		}
		if(arr[6] == 'X' || arr[6] == 'O')
		{
			System.out.print(arr[6]+" |");
			
		}
		else
		{
			System.out.print("  |");
		}
		System.out.println();
		System.out.println("             "+"+---+---+---+");
		
		System.out.print("             ");
		if(arr[7] == 'X' || arr[7] == 'O')
		{
			System.out.print("| "+arr[7]+" + ");
		}
		else
		{
			System.out.print("|   + ");
		}
		if(arr[8] == 'X' || arr[8] == 'O')
		{
			System.out.print(arr[8]+" + ");
		}
		else
		{
			System.out.print("  + ");
		}
		if(arr[9] == 'X' || arr[9] == 'O')
		{
			System.out.print(arr[9]+" |");
			
		}
		else
		{
			System.out.print("  |");
		}
		System.out.println();
		System.out.println("             "+"+---+---+---+");
	}
}
