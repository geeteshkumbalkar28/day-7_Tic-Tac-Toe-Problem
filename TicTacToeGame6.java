  
import java.util.*; 
//Mean class
public class TicTacToeGame6
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

		///////////////////////////////////////////////play with Two player/////////////////////////////////
		
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
			boolean checkFreeSpace;
			while(counter!=0)
			{
				if((counter%2)!=0)
				{
					System.out.println("Player 1 ::::Select the index from 1 to 9 to make the move :");
					int playerMove = scan.nextInt();
					checkFreeSpace = ticTacToeBoard.checkSpaceAvailable(playerMove);
					
					if(false == checkFreeSpace)
					{
						ticTacToeBoard.storePlayerMove(playerMove,chooseLetterPlayerOne);
						ticTacToeBoard.showBoard();
					}
					else if(checkFreeSpace == true)
					{
						System.out.println();
						System.out.println("!!!!!Player 1 ::Play again this move is all ready exist !!!!!");
						System.out.println();
						ticTacToeBoard.showBoard();
						counter++;
					}
				}
				else if((counter%2)==0)
				{
					System.out.println("Player 2 :::: Select the index from 1 to 9 to make the move :");
					int playerMove = scan.nextInt();
					checkFreeSpace = ticTacToeBoard.checkSpaceAvailable(playerMove);
					if(false == checkFreeSpace)
					{
						ticTacToeBoard.storePlayerMove(playerMove,chooseLetterPlayerTwo);
						ticTacToeBoard.showBoard();
					}
					else if(checkFreeSpace == true)
					{
						
						System.out.println();
						System.out.println("!!!!!Player 2 ::Play again this move is all ready exist !!!!!");
						System.out.println();
						ticTacToeBoard.showBoard();
						counter++;
					}
				
				}
				
				counter--;
				
			}
		}
		//////////////////////////////////////////////Play with computer//////////////////////////////
		else if(oppPlayerType.equals("Computer"))
		{
			Random rand = new Random();
			int randomValue = rand.nextInt(2);
			char userSymbol = 'X';
			char computerSymbol = 'O';
		
			if(randomValue == 0)
			{
				System.out.println("User Play first move : (ie: X )");
			}
			else
			{
				System.out.println("Computer Play first move : (ie: O )");
			}
		
			int counter = 9;
			boolean checkFreeSpace;
			///////////////////////////////////user play first ///////////////////////
			if(randomValue == 0)
			{
				//computer 
				int computerRepeat=0;
				while(counter!=0)
				{
					if((counter%2)!=0)
					{
						System.out.println("User ::::Select the index from 1 to 9 to make the move :");
						int playerMove = scan.nextInt();
						checkFreeSpace = ticTacToeBoard.checkSpaceAvailable(playerMove);
						
						if(false == checkFreeSpace)
						{
							ticTacToeBoard.storePlayerMove(playerMove,userSymbol);
							ticTacToeBoard.showBoard();
						}
						else if(checkFreeSpace == true)
						{
							System.out.println();
							System.out.println("!!!!!User ::Play again this move is all ready exist !!!!!");
							System.out.println();
							ticTacToeBoard.showBoard();
							counter++;
						}
					}
					else if((counter%2)==0)
					{
						
						int playerMove = ticTacToeBoard.computerMovesPosition();
						
						System.out.println("Computer play : "+ playerMove);
						ticTacToeBoard.storePlayerMove(playerMove,computerSymbol);
						ticTacToeBoard.showBoard();
							
						
					}
					
					counter--;
				
				}
			}
			else if(randomValue == 1)
			{
				while(counter!=0)
				{
					 
					if((counter%2)!=0)
					{
						
						int playerMove = ticTacToeBoard.computerMovesPosition();
						
							System.out.println("Computer play : "+ playerMove);
							ticTacToeBoard.storePlayerMove(playerMove,computerSymbol);
							ticTacToeBoard.showBoard();
						
					}
					else if((counter%2)==0)
					{
						System.out.println("User ::::Select the index from 1 to 9 to make the move :");
						int playerMove = scan.nextInt();
						checkFreeSpace = ticTacToeBoard.checkSpaceAvailable(playerMove);
						
						if(false == checkFreeSpace)
						{
							ticTacToeBoard.storePlayerMove(playerMove,userSymbol);
							ticTacToeBoard.showBoard();
						}
						else if(checkFreeSpace == true)
						{
							System.out.println();
							System.out.println("!!!!!User ::Play again this move is all ready exist !!!!!");
							System.out.println();
							ticTacToeBoard.showBoard();
							counter++;
						}
					}
					
					counter--;
				
				}
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
	public boolean checkSpaceAvailable(int playerChoosePosition)
	{
		boolean flag=false;
		if((arr[playerChoosePosition] == 'X') || (arr[playerChoosePosition] == 'O'))
		{
			flag = true;
		}
		return flag;
			
	}
	/*public int checkComputerChooseRepeat(int counter)
	{
		TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
		for(int counter = 1 ; counter<=9;counter++)
		{
			ticTacToeBoard.checkSpaceAvailable
		}
	
		return 
	}*/
	public int computerMovesPosition()
	{
		TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
		int computerChoose = 1;
		while(computerChoose < 10)
		{
			System.out.println("407 : !!!!!!!!!!!!!!"+ticTacToeBoard.checkSpaceAvailable(computerChoose));
			if((ticTacToeBoard.checkSpaceAvailable(computerChoose)) == false )
			{
				System.out.println("Inside Computer");
				computerChoose = computerChoose;
			
			}
			computerChoose++;
		}
		System.out.println("415 "+computerChoose);
		return computerChoose;
	}
}	
		
		/*
		Random rand = new Random();
		int checkPresent=9;
		int intRandom=rand.nextInt(checkPresent);
		int computerChoose1=intRandom+1;;
		int computerChoose=0;
		if(playerChoose == 'X')
		{
			if(((arr[1] == 'X')&&(arr[4] == 'X'))||((arr[4] == 'X')&&(arr[7] == 'X'))||((arr[1] == 'X')&&(arr[7] == 'X')))
			{
				if((arr[1] == 'X')&&(arr[4] == 'X'))
				{
					computerChoose = 7;
				}
				
				else if((arr[4] == 'X')&&(arr[7] == 'X'))
				{
					computerChoose = 1;
				}
				
				else if((arr[1] == 'X')&&(arr[7] == 'X'))
				{
					computerChoose = 4;
				}
				return computerChoose;
			}
			else if(((arr[3] == 'X')&&(arr[6] == 'X'))||((arr[6] == 'X')&&(arr[9] == 'X'))||((arr[3] == 'X')&&(arr[9] == 'X')))
			{
				if((arr[3] == 'X')&&(arr[6] == 'X'))
				{
					computerChoose = 9;
				}
				
				else if((arr[6] == 'X')&&(arr[9] == 'X'))
				{
					computerChoose = 3;
				}
				
				else if((arr[3] == 'X')&&(arr[9] == 'X'))
				{
					computerChoose = 6;
				}
				return computerChoose;
			}
			else if(((arr[2] == 'X')&&(arr[5] == 'X'))||((arr[5] == 'X')&&(arr[8] == 'X'))||((arr[2] == 'X')&&(arr[8] == 'X')))
			{
				if((arr[2] == 'X')&&(arr[5] == 'X'))
				{
					computerChoose = 8;
				}
				
				else if((arr[5] == 'X')&&(arr[8] == 'X'))
				{
					computerChoose = 2;
				}
				
				else if((arr[2] == 'X')&&(arr[8] == 'X'))
				{
					computerChoose = 5;
				}
				return computerChoose;
			}
			else if(((arr[1] == 'X')&&(arr[2] == 'X'))||((arr[2] == 'X')&&(arr[3] == 'X'))||((arr[1] == 'X')&&(arr[3] == 'X')))
			{
				if((arr[1] == 'X')&&(arr[2] == 'X'))
				{
					computerChoose = 3;
				}
				
				else if((arr[2] == 'X')&&(arr[3] == 'X'))
				{
					computerChoose = 1;
				}
				
				else if((arr[1] == 'X')&&(arr[3] == 'X'))
				{
					computerChoose = 2;
				}
				return computerChoose;
			}
			else if(((arr[4] == 'X')&&(arr[5] == 'X'))||((arr[5] == 'X')&&(arr[6] == 'X'))||((arr[4] == 'X')&&(arr[6] == 'X')))
			{
				if((arr[4] == 'X')&&(arr[5] == 'X'))
				{
					computerChoose = 6;
				}
				
				else if((arr[5] == 'X')&&(arr[6] == 'X'))
				{
					computerChoose = 4;
				}
				
				else if((arr[4] == 'X')&&(arr[6] == 'X'))
				{
					computerChoose = 5;
				}
				return computerChoose;
			}
			else if(((arr[7] == 'X')&&(arr[8] == 'X'))||((arr[8] == 'X')&&(arr[9] == 'X'))||((arr[7] == 'X')&&(arr[9] == 'X')))
			{
				if((arr[7] == 'X')&&(arr[8] == 'X'))
				{
					computerChoose = 9;
				}
				
				else if((arr[8] == 'X')&&(arr[9] == 'X'))
				{
					computerChoose = 7;
				}
				
				else if((arr[7] == 'X')&&(arr[9] == 'X'))
				{
					computerChoose = 8;
				}
				return computerChoose;
			}
			else if(((arr[1] == 'X')&&(arr[5] == 'X'))||((arr[5] == 'X')&&(arr[9] == 'X'))||((arr[1] == 'X')&&(arr[9] == 'X')))
			{
				if((arr[1] == 'X')&&(arr[5] == 'X'))
				{
					computerChoose = 9;
				}
				
				else if((arr[5] == 'X')&&(arr[9] == 'X'))
				{
					computerChoose = 1;
				}
				
				else if((arr[1] == 'X')&&(arr[9] == 'X'))
				{
					computerChoose = 5;
				}
				return computerChoose;
			}
			
			else if(((arr[7] == 'X')&&(arr[5] == 'X'))||((arr[5] == 'X')&&(arr[3] == 'X'))||((arr[7] == 'X')&&(arr[3] == 'X')))
			{
				if((arr[7] == 'X')&&(arr[5] == 'X'))
				{
					computerChoose = 3;
				}
				
				else if((arr[5] == 'X')&&(arr[3] == 'X'))
				{
					computerChoose = 7;
				}
				
				else if((arr[7] == 'X')&&(arr[3] == 'X'))
				{
					computerChoose = 5;
				}
				return computerChoose;
			}
			
		}
	
		else if(playerChoose == 'O')
		{
			if(((arr[1] == 'O')&&(arr[4] == 'O'))||((arr[4] == 'O')&&(arr[7] == 'O'))||((arr[1] == 'O')&&(arr[7] == 'O')))
			{
				if((arr[1] == 'O')&&(arr[4] == 'O'))
				{
					computerChoose = 7;
				}
				
				else if((arr[4] == 'O')&&(arr[7] == 'O'))
				{
					computerChoose = 1;
				}
				
				else if((arr[1] == 'O')&&(arr[7] == 'O'))
				{
					computerChoose = 4;
				}
				return computerChoose;
			}
			else if(((arr[3] == 'O')&&(arr[6] == 'O'))||((arr[6] == 'O')&&(arr[9] == 'O'))||((arr[3] == 'O')&&(arr[9] == 'O')))
			{
				if((arr[3] == 'O')&&(arr[6] == 'O'))
				{
					computerChoose = 9;
				}
				
				else if((arr[6] == 'O')&&(arr[9] == 'O'))
				{
					computerChoose = 3;
				}
				
				else if((arr[3] == 'O')&&(arr[9] == 'O'))
				{
					computerChoose = 6;
				}
				return computerChoose;
			}
			else if(((arr[2] == 'O')&&(arr[5] == 'O'))||((arr[5] == 'O')&&(arr[8] == 'O'))||((arr[2] == 'O')&&(arr[8] == 'O')))
			{
				if((arr[2] == 'O')&&(arr[5] == 'O'))
				{
					computerChoose = 8;
				}
				
				else if((arr[5] == 'O')&&(arr[8] == 'O'))
				{
					computerChoose = 2;
				}
				
				else if((arr[2] == 'O')&&(arr[8] == 'O'))
				{
					computerChoose = 5;
				}
				return computerChoose;
			}
			else if(((arr[1] == 'O')&&(arr[2] == 'O'))||((arr[2] == 'O')&&(arr[3] == 'O'))||((arr[1] == 'O')&&(arr[3] == 'O')))
			{
				if((arr[1] == 'O')&&(arr[2] == 'O'))
				{
					computerChoose = 3;
				}
				
				else if((arr[2] == 'O')&&(arr[3] == 'O'))
				{
					computerChoose = 1;
				}
				
				else if((arr[1] == 'O')&&(arr[3] == 'O'))
				{
					computerChoose = 2;
				}
				return computerChoose;
			}
			else if(((arr[4] == 'O')&&(arr[5] == 'O'))||((arr[5] == 'O')&&(arr[6] == 'O'))||((arr[4] == 'O')&&(arr[6] == 'O')))
			{
				if((arr[4] == 'O')&&(arr[5] == 'O'))
				{
					computerChoose = 6;
				}
				
				else if((arr[5] == 'O')&&(arr[6] == 'O'))
				{
					computerChoose = 4;
				}
				
				else if((arr[4] == 'O')&&(arr[6] == 'O'))
				{
					computerChoose = 5;
				}
				return computerChoose;
			}
			else if(((arr[7] == 'O')&&(arr[8] == 'O'))||((arr[8] == 'O')&&(arr[9] == 'O'))||((arr[7] == 'O')&&(arr[9] == 'O')))
			{
				if((arr[7] == 'O')&&(arr[8] == 'O'))
				{
					computerChoose = 9;
				}
				
				else if((arr[8] == 'O')&&(arr[9] == 'O'))
				{
					computerChoose = 7;
				}
				
				else if((arr[7] == 'O')&&(arr[9] == 'O'))
				{
					computerChoose = 8;
				}
				return computerChoose;
			}
			else if(((arr[1] == 'O')&&(arr[5] == 'O'))||((arr[5] == 'O')&&(arr[9] == 'O'))||((arr[1] == 'O')&&(arr[9] == 'O')))
			{
				if((arr[1] == 'O')&&(arr[5] == 'O'))
				{
					computerChoose = 9;
				}
				
				else if((arr[5] == 'O')&&(arr[9] == 'O'))
				{
					computerChoose = 1;
				}
				
				else if((arr[1] == 'O')&&(arr[9] == 'O'))
				{
					computerChoose = 5;
				}
				return computerChoose;
			}
			
			else if(((arr[7] == 'O')&&(arr[5] == 'O'))||((arr[5] == 'O')&&(arr[3] == 'O'))||((arr[7] == 'O')&&(arr[3] == 'O')))
			{
				if((arr[7] == 'O')&&(arr[5] == 'O'))
				{
					computerChoose = 3;
				}
				
				else if((arr[5] == 'O')&&(arr[3] == 'O'))
				{
					computerChoose = 7;
				}
				
				else if((arr[7] == 'O')&&(arr[3] == 'O'))
				{
					computerChoose = 5;
				}
				return computerChoose;
			}
			
		}
		return computerChoose1;
	}
	
}
*/