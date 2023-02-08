  
import java.util.*; 
//Mean class
public class TicTacToeGame4
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
		if(oppPlayerType.equals("Player"))
		{
			System.out.println("Choose Player 1 ::  (X / O) :");
			char chooseLetterPlayerOne = scan.next().charAt(0);
			char chooseLetterPlayerTwo = 'O';
			if(chooseLetterPlayerOne == 'O')
			{
				chooseLetterPlayerTwo = 'X';
			}
			int counter = 9;
			while(counter!=0)
			{
				if((counter%2)!=0)
				{
					System.out.println("Player 1 ::::Select the index from 1 to 9 to make the move :");
					int palyerMove = scan.nextInt();
					ticTacToeBoard.storePlayerMove(palyerMove,chooseLetterPlayerOne);
					ticTacToeBoard.showBoard();
				}
				else if((counter%2)==0)
				{
					System.out.println("Player 2 :::: Select the index from 1 to 9 to make the move :");
					int palyerMove = scan.nextInt();
					ticTacToeBoard.storePlayerMove(palyerMove,chooseLetterPlayerTwo);
					ticTacToeBoard.showBoard();
				}
				
				counter--;
				
			}
		}
		
		
	}
} 
 //////////UC1-creating a tic tac toe board//////////////////////
class TicTacToeBoard
{
	public char arr[];
				
	TicTacToeBoard()		//Constructs
	{
		arr = new char[10];
		arr[0] = 'X';
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
	
	public void storePlayerMove(int move,char playerChoose)
	{
		
		if(playerChoose == 'X')
		{
			
			if(move == 1)
			{
				arr[1]= 'X';
			}
			
			else if(move == 2)
			{
				arr[2]= 'X';
			}
			else if(move == 3)
			{
				arr[3]= 'X';
			}
			else if(move == 4)
			{
				arr[4]= 'X';
			}
			else if(move == 5)
			{
				arr[5]= 'X';
			}
			else if(move == 6)
			{
				arr[6]= 'X';
			}
			else if(move == 7)
			{
				arr[7]= 'X';
			}
			else if(move == 8)
			{
				arr[8]= 'X';
			}
			else if(move == 9)
			{
				arr[9]= 'X';
			}
		}
		else if(playerChoose == 'O')
		{
			
			if(move == 1)
			{
				arr[1]= 'O';
			}
			
			else if(move == 2)
			{
				arr[2]= 'O';
			}
			else if(move == 3)
			{
				arr[3]= 'O';
			}
			else if(move == 4)
			{
				arr[4]= 'O';
			}
			else if(move == 5)
			{
				arr[5]= 'O';
			}
			else if(move == 6)
			{
				arr[6]= 'O';
			}
			else if(move == 7)
			{
				arr[7]= 'O';
			}
			else if(move == 8)
			{
				arr[8]= 'O';
			}
			else if(move == 9)
			{
				arr[9]= 'O';
			}
		}
	}
}
