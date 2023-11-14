import java.util.Scanner;
public class TicTacToe
{
	public static void main(String[] args) 
	{
	   char[][] board=new char[3][3];
		for(int row=0;row<board.length;row++)
		{
			for(int col=0;col<board.length;col++)
			{
				board[row][col]=' ';
			}
		}
		
		boolean gameOver= false;
		boolean isTie=false;
		char player='x';
		while(!gameOver && !isTie)
		{
			printBoard(board);
			Scanner scan =new Scanner(System.in);
		    System.out.println("player"+ player +"enter the coordinates ");
		    int row=scan.nextInt();
		    int col=scan.nextInt();
		    if(board[row][col] == ' ')
		    {
		    	//place the element
		    	board[row][col]=player;
		    	gameOver=hasWon(board, player);
		    	if(gameOver==true)
		    	{
		    		printBoard(board);
		    	  System.out.println("player"+player+"has won");
		    	}
		    	
		    	//switch the player
		    	if(player=='x')
		    	{
		    		player='o';
		    	}
		    	else
		    	{
		    		player='x';
		    	}
		    	
		    }
		    else
		    {
		    	System.out.println("position is already filled");
		    }
		    
		    isTie=isDraw(board);
		    if(isTie==true)
		    {
		    	printBoard(board);
		    	System.out.println("It is a Draw Match");
		    }
		    
		}	
	 }
	
	public static boolean hasWon(char[][] board, char player)
	{
		//checking rows
		for(int row=0;row<board.length;row++)
		{
			if(board[row][0]==player && board[row][1]==player && board[row][2]==player)
			{
				return true;
			}
		}

		
		//checking columns
		for(int col=0;col<board.length;col++)
		{
			if(board[0][col]==player && board[1][col]==player && board[2][col]==player)
			{
				return true;
			}
		}
		
		//checking diagonals
		if(board[0][0]==player && board[1][1]==player && board[2][2]==player )
		{
			return true;
		}
		if(board[0][2]==player && board[1][1]==player && board[2][0]==player )
		{
			return true;
		}
		return false;
		
	}
	public static void printBoard(char[][] board)
	{
		for(int row=0;row<board.length;row++)
		{
			for(int col=0;col<board.length;col++)
			{
				System.out.print(board[row][col]+"|");
			}
			
			System.out.println();
		}
	}
	
	public static boolean isDraw(char[][] board)
	{
		int count=0;
		 for(int row=0;row<board.length;row++)
			{
				for(int col=0;col<board.length;col++)
				{
					if(board[row][col]!=' ') 
					{
						count=count+1;
					}
				}
			}
		 if(count==9)
		 {
			 return true;
		 }
		 return false;
	}
	
}
