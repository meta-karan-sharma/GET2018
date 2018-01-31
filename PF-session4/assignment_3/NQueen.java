
/**
 * The program solves the problem of NQueens on a chess board using recursion and backtracking.
 *
 * @version 1 29 Jan 2018
 * @author Karan Sharma
 */
package assignment_3;

public class NQueen 
{
	int [][] finalBoard;
	/**
	 * this is a recursive method that finds the arrangement of n queens in a n x n board.
	 * 
	 * @param board
	 * @param startRow
	 * @param dimensionOfMatrix
	 * @return
	 */
	boolean nQueen (int [][] board, int startRow, int dimensionOfMatrix)
	{
		finalBoard=new int[dimensionOfMatrix][dimensionOfMatrix];
		boolean check = false; //variable to tell the status of board
		for(int colNum = 0; colNum < dimensionOfMatrix; colNum++) //to check for all columns in the passed row
		{
			if (startRow >= dimensionOfMatrix)
			{
				finalBoard=board;
				return true;
			}
			 //to check if this particular position is safe or not
			if (safeState (board, startRow, colNum, dimensionOfMatrix))
			{
				board[startRow][colNum] = 1; //place queen at  that position
				check = nQueen(board, startRow + 1, dimensionOfMatrix);   //recursive call for next row
				if(check)                                       
					return check;
			}
			board [startRow][colNum] = 0;
		}
		return check;
	}
	
	/**
	 * this method checks if the board is in safe state for the position this is passed as startrow and col
	 * @param board
	 * @param startRow
	 * @param col
	 * @param dimensionOfMatrix
	 * @return
	 */
	boolean safeState (int [][] board, int startRow, int col, int dimensionOfMatrix)
	{
		boolean check = true; //to check if there is conflict 
		//to check conflicts in all possible directions
		for(int iterator = 0; iterator < dimensionOfMatrix; iterator++) 
		{
			if(board [iterator][col] == 1)              
			//checking conflicts in row and column 
			{
				check = false;
				break;
			}
			if ( (col - iterator) >= 0 && (startRow - iterator) >= 0 && board [startRow - iterator][col - iterator] == 1 ) 
			//checking conflict in top right diagonal
			{
				check = false;
				break;
			}
			if ( (col + iterator) < dimensionOfMatrix && (startRow - iterator) >= 0 && board [startRow - iterator][col + iterator] == 1 )
			//checking conflict in top left diagonal
			{
				check = false;
				break;
			}
		}
		return check;
	}
	int [][] boardStatus (int [][] board)
	{
		
		nQueen (board, 0, board.length);
		return finalBoard;
	}
}
