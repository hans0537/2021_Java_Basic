package step6_02.method;

import java.util.Scanner;

class TicTacToe{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;
	
	void setGame() {
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				game[i][j] = " ";
			}
		}
	}
	
	void printGame() {
		System.out.println("===틱택토===");
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				System.out.print("[" + game[i][j] + "]");
			}
			System.out.println();
		}
	}
	
	void game() {
		if (turn%2==0) {
			System.out.print("P1 x입력: ");
			int xidx = scan.nextInt();
			System.out.print("P1 y입력: ");
			int yidx = scan.nextInt();
			
			if (game[xidx][yidx].equals(" ")) {
				game[xidx][yidx] = "O";
				turn++;
			}
			else {
				System.out.println("잘못 입력 하셨습니다.");
			}
		}
		else if (turn%2==1) {
			System.out.print("P2 x입력: ");
			int xidx = scan.nextInt();
			System.out.print("P2 y입력: ");
			int yidx = scan.nextInt();
			
			if (game[xidx][yidx].equals(" ")) {
				game[xidx][yidx] = "X";
				turn++;
			}
			else {
				System.out.println("잘못 입력 하셨습니다.");
			}
		}
	}
	
	void garo() {
		for (int i = 0; i < game.length; i++) {
			if(game[i][0].equals("O") && game[i][1].equals("O") && game[i][2].equals("O")) win = 1;
			else if(game[i][0].equals("X") && game[i][1].equals("X") && game[i][2].equals("X")) win = 2;
		}
		
	}
	
	void sero() {
		for (int i = 0; i < game.length; i++) {
			if(game[0][i].equals("O") && game[1][i].equals("O") && game[2][i].equals("O")) win = 1;
			else if(game[0][i].equals("X") && game[1][i].equals("X") && game[2][i].equals("X")) win = 2;
		}
		
	}
	
	void cross() {
		if (game[0][0].equals("O") && game[1][1].equals("O") && game[2][2].equals("O")) win = 1;
		if (game[0][0].equals("X") && game[1][1].equals("X") && game[2][2].equals("X")) win = 2;
		if (game[0][2].equals("O") && game[1][1].equals("O") && game[2][0].equals("O")) win = 1;
		if (game[0][2].equals("X") && game[1][1].equals("X") && game[2][0].equals("X")) win = 2;
	}
	
	void run() {
		setGame();
		while(true) {
			printGame();
			if (win==1) {
				System.out.println("P1 승리");
				break;
			}
			else if(win==2) {
				System.out.println("P2 승리");
				break;
			}
			game();
			garo();
			sero();
			cross();
			
		}
	}
	
	
}
public class MethodEx16 {

	public static void main(String[] args) {
		
		TicTacToe t = new TicTacToe();
		t.run();
	}

}
