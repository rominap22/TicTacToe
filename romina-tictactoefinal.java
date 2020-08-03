import java.util.*;
import java.util.Scanner;
public class TicTacToe {
	
static boolean hasWon = false;
static char[][] board = new char[3][3];
Scanner s = new Scanner (System.in);

static int row = 0;
static int column = 0;
static int row2 = 0;
static int column2 = 0;
	
public static void main (String [] args){ 
		TicTacToe myClassObject = new TicTacToe();
		System.out.println("Welcome to Tic Tac Toe! You are player X, and player O is your opponent.");
		System.out.println("Please ensure two people are playing.");
	
	while (!hasWon){
		myClassObject.inputPlayerX();
		myClassObject.printBoard(board);
		checkWin();
		myClassObject.checkValidForPlayer0(row2, column2);
		checkWin();
	}
}

public void printBoard(char[][] board) {
	System.out.println(" " + board[0][0] + " |" + " " + board[0][1] + " |" +  " " + board[0][2] + " ");
		System.out.println("- - - - - -");
		System.out.println(" " + board[1][0] + " |" + " " + board[1][1] + " |" + " " + board[1][2] + " ");
		System.out.println("- - - - - -");
		System.out.println(" " + board[2][0] + " |" + " " + board[2][1] + " |" +  " " + board[2][2] + " ");
}

public void inputPlayer() {
	do {
	   System.out.println("Player X: Enter a row number from (0-2)");
	   row = s.nextInt();
	   System.out.println("Player X: Enter a column number from (0-2)");
	   column = s.nextInt();
	  } while ((row < 0 || row > 2) && (column < 0 || column > 2));
	  checkValidForPlayerX(row, column);
}

public void inputPlayer0() {
	do {
	   System.out.println("Player O: Enter a row number from (0-2)");
	   row2 = s.nextInt();
	   System.out.println("Player O: Enter a column number from (0-2)");
	   column2 = s.nextInt();
	  } while ((row2 < 0 || row2 > 2) && (column2 < 0 || column2 > 2));
	  checkValidForPlayerO(row2, column2);
}

public void checkValidForPlayerX(int row, int column) {
	if(board[row][column] == ' ' || board[row][column] == 'X' || board[row][column] == 'O')) {
		System.out.println("Player X: Your number entries are valid!");
		board[row][column] == 'X';
	} else {
		inputPlayerX();
	}
}

publicvoid checkValidForPlayerO(int row2, int column2) {
	if(!(board[row2][column2] == ' ') || board[row][column] == 'X' || board[row2][column2] == '0')){
		System.out.println("Player O: Your row and column numbers are valid!");
		board[row2][column2] = 'O';
	} else {
		inputPlayerO();
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
