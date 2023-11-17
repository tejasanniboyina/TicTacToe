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
			choosePosition(board,player);
			
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
		    	
		        isTie=isDraw(board,player);
			    if(isTie==true)
			    {
			    	printBoard(board);
			    	System.out.println("It is a Draw Match");
			    }
		    	
		  }
		    
		
		    
		}	
	public static void isFilled(char[][] board, char player)
	{
		System.out.println("Position is already filled");
		 if(player=='x')
		 {
			 player='x';
			 choosePosition(board,player);
		 }
		 else {
			 player='o';
		 	choosePosition(board,player);
		 }
		 
	}
	 
	
	public static void choosePosition(char[][] board, char player)
	{
		Scanner scan =new Scanner(System.in);
	    System.out.println("player"+ player +"enter the position ");
	    int position=scan.nextInt();
	    
	    switch(position)
	    {
	    	case 1:
	    	{
	    		if(board[0][0] == ' ')
	    		board[0][0]=player;
	    		 else
	    		 {
	    			 isFilled( board,  player);
	    		 }	    		break;
	 		    
	    	}
	    	case 2:
	    	{
	    		if(board[0][1] == ' ')
	    		board[0][1]=player;
	    		 else 
	    		 {
	    			 isFilled( board,  player);
	    		 }	    		break;
	    	}
	    	case 3:
	    	{
	    		if(board[0][2] == ' ')
	    		board[0][2]=player;
	    		 else
	    		 {
	    			 isFilled( board,  player);
	    		 }	    		break;
	    	}
	    	case 4:
	    	{
	    		if(board[1][0] == ' ')
	    		board[1][0]=player;
	    		 else
	    		 {
	    			 isFilled( board,  player);
	    		 }	    		break;
	    	}
	    	case 5:
	    	{
	    		if(board[1][1] == ' ')
	    		board[1][1]=player;
	    		 else
	    		 {
	    			 isFilled( board,  player);
	    		 }	    		break;
	    	}
	    	case 6:
	    	{
	    		if(board[1][2] == ' ')
	    		board[1][2]=player;
	    		 else
	    		 {
	    			 isFilled( board,  player);
	    		 }	    		break;
	    	}
	    	case 7:
	    	{
	    		if(board[2][0] == ' ')
	    		board[2][0]=player;
	    		 else {
	    			 isFilled( board,  player);
	    		 }
	    		break;
	    	}
	    	case 8:
	    	{
	    		if(board[2][1] == ' ')
	    		board[2][1]=player;
	    		 else
	    		 {
	    			 isFilled( board,  player);
	    		 }	    		break;
	    	}
	    	case 9:
	    	{
	    		if(board[2][2] == ' ')
	    		board[2][2]=player;
	    		 else
	    		 {
	    			 isFilled( board,  player);
	    		 }	    		break;
	    	}
	    	default:
	    		System.out.println("please enter the correct position");

	    	
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
	
	public static boolean isDraw(char[][] board,char player)
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
		 if(hasWon( board, player)==true)
		 {
			 return true;
		 }
		 else if(count==9 )
		 {
			 System.out.println("It is a Draw Match");
		 }
		 return false;
	}
	
}
