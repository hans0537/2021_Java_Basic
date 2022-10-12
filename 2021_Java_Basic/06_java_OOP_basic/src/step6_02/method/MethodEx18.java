package step6_02.method;

import java.util.Scanner;

class LadderGame{
	
	Scanner scan = new Scanner(System.in);
	
	int[][] ladder = { 
			{ 0, 0, 0, 0, 0 }, 
			{ 1, 2, 0, 1, 2 }, 
			{ 0, 1, 2, 0, 0 }, 
			{ 0, 0, 0, 1, 2 }, 
			{ 0, 1, 2, 0, 0 },
			{ 1, 2, 0, 0, 0 }, 
			{ 0, 0, 0, 1, 2 }, 
			{ 0, 0, 0, 0, 0 } 
		};
	int xIdx = 0;
	int yIdx = 0;
	String menu = "";
	
	void showLadder() {
		System.out.println("  1  2  3  4  5");
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				if (ladder[i][j] == 0) {
					if (xIdx == i && yIdx == j) 	System.out.print("  *");
					else 							System.out.print("  │");
				} else if (ladder[i][j] == 1) {
					if (xIdx == i && yIdx == j) 	System.out.print("  * ");
					else 							System.out.print("  ├─");
				} else if (ladder[i][j] == 2) {
					if (xIdx == i && yIdx == j) 	System.out.print(" *");
					else 							System.out.print("─┤");
				}
			}
			System.out.println();
		}
		System.out.println("김밥 우유 치킨 따아 피자");
		System.out.println();
		
		try {
			Thread.sleep(500);  // 0.5초 딜레이 ,  1000 > 1초 , 3000 > 3초 , 100 > 0.1초 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class MethodEx18 {

	public static void main(String[] args) {

		LadderGame lg = new LadderGame();
		lg.showLadder();

	}

}
