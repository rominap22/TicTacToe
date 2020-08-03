import java.util.*;
import java.util.Scanner
public class TicTacToe {
	
static boolean hasWon = false;
static char[][] board = new char[3][3];

int row
int column
int row2
int column2;
	
public static void main (String [] args){
Scanner s = new Scanner (System.in); 
		
		System.out.println("Welcome to Tic Tac Toe! You are player X, and player O is your opponent.");
		System.out.println("Please ensure two people are playing.");
		System.out.println("Player X, is it your turn!");
	while (!hasWon){
		do {
			System.out.println("Enter a row number from (0-2)");
			row = s.nextInt();
		} while ((row < 0 || row > 2));
		System.out.println("Entered row number is within specified parameters.");
		do {
			System.out.println("Enter a row number from (0-2)");
			column = s.nextInt();
		} while ((column < 0 || column > 2));
		System.out.println("Entered column number is within specified parameters.");
		
		//if-else block below does not work to 1. ensure player is not overriding taken space 2. re-prompt player to choose a new column/row #
		if(board[row][column] != ' ') {
			board[row][column] = 'O';
		} else { 
			System.out.println("This position is taken! Please enter a new row and column number.");
			
		/* @Romina, how does the following work to accomplish the above goals? 
		if (board[row][column] == 0){
			board[row][column] = 'X';
		} 
		else if (board[row][column] != 0){
			System.out.println("ERROR DETECTED: You may not pick this row and column as it is taken.");
		}
		*/
		
		checkWin();
		System.out.println(" " + board[0][0] + " |" + " " + board[0][1] + " |" +  " " + board[0][2] + " ");
		System.out.println("- - - - - -");
		System.out.println(" " + board[1][0] + " |" + " " + board[1][1] + " |" + " " + board[1][2] + " ");
		System.out.println("- - - - - -");
		System.out.println(" " + board[2][0] + " |" + " " + board[2][1] + " |" +  " " + board[2][2] + " ");
			
		
		
		System.out.println("Player O, it is now your turn!");
		do { 
			System.out.println("Enter a row number from (0-2)");
			row2 = s.nextInt();
		} while ((row2 < 0 || row2 > 2));
		System.out.println("Entered row number is within specified parameters.");
		do {
			System.out.println("Enter a column number from (0-2)");
			column2 = s.nextInt();
		} while ((column2 < 0 || column2 > 2));
		System.out.println("Entered column number is within specified parameters.");
		
		//if-else block below does not work to 1. ensure player is not overriding taken space 2. re-prompt player to choose a new column/row #
            	if ( (board[row2][column2] != ' ') || (board[row][column] != ' ') ) {
                	board[row2][column2] = 'X';
            	} else {
                System.out.println("This board position it is already taken! Please enter a new row and a new column number.");
            	}
		
		/* @Romina, how does the following work to accomplish the above goals? 
		board[row2][column2] = 'O';
		if (board[row][column] != 0){
		System.out.println("ERROR DETECTED: You may not pick this row and column as it is taken.");
		*/ 
			
		checkWin();
		System.out.println(" " + board[0][0] + " |" + " " + board[0][1] + " |" +  " " + board[0][2] + " ");
		System.out.println("- - - - - -");
		System.out.println(" " + board[1][0] + " |" + " " + board[1][1] + " |" + " " + board[1][2] + " ");
		System.out.println("- - - - - -");
		System.out.println(" " + board[2][0] + " |" + " " + board[2][1] + " |" +  " " + board[2][2] + " ");
	}
}

static void checkWin() {
	//across top
			if (board[0][0] == board [0][1] && board[0][0] == board[0][2] && board[0][0] != 0){
				hasWon = true;
				System.out.println("Player " + board[0][0] + " won!");
			}
	//across middle
			if (board[1][0] == board [1][1] && board[1][0] == board[1][2] && board[1][0] != 0){
				hasWon = true;
				System.out.println("Player " + board[1][0] + " won!");
			}
	//across bottom
			if (board[2][0] == board [2][1] && board[2][0] == board[2][2] && board[2][0] != 0){
				hasWon = true;
				System.out.println("Player " + board[2][0] + " won!");
			}
	//vertical left
			if (board[0][0] == board [1][0] && board[0][0] == board[2][0] && board[0][0] != 0){
				hasWon = true;
				System.out.println("Player " + board[0][0] + " won!");
			}
	//vertical middle
			if (board[0][1] == board [1][1] && board[0][1] == board[2][1] && board[0][1] != 0){
				hasWon = true;
				System.out.println("Player " + board[0][1] + " won!");
			}
	//vertical right
			if (board[0][2] == board [1][2] && board[0][2] == board[2][2] && board[0][2] != 0){
				hasWon = true;
				System.out.println("Player " + board[0][2] + " won!");
			}
	//negative diagonal
			if (board[0][0] == board [1][1] && board[0][0] == board[2][2] && board[0][0] != 0){
				hasWon = true;
				System.out.println("Player " + board[0][0] + " won!");
			}
	//positive diagonal
			if (board[0][2] == board [1][1] && board[0][2] == board[2][0] && board[0][2] != 0){
				hasWon = true;
				System.out.println("Player " + board[0][2] + " won!");
			}
			if (board[0][0] != 0 && board[0][1] != 0 && board[0][2] != 0 && board[1][0] != 0 && board[1][1] != 0 && board[1][2] != 0 && board[2][0] != 0 && board[2][1] != 0 && board[2][2] != 0){
				System.out.println("Game over; no winner could be determined.");
			}
}
}
