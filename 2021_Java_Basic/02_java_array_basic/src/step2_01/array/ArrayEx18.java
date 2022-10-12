package step2_01.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayEx18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;
		
		int win1 = 0;	int win2 = 0;		
		
		while(true) {
			System.out.println(Arrays.toString(game));
			System.out.println(Arrays.toString(p1) + "[" + win1 + "바퀴]");
			System.out.println(Arrays.toString(p2) + "[" + win2 + "바퀴]");
			
			if (win1==3) {
				System.out.println("p1 승리");
				break;
			}else if (win2==3) {
				System.out.println("p2 승리");
				break;
			}
			
			if (turn%2==0) {
				System.out.print("[p1사용자]1~3 입력 : ");
				int num = scan.nextInt();
				p1[idx1] = 0;
				idx1 = idx1 + num;
				if (idx1>=8) {
					idx1 = idx1 % 8;
					win1++;
				}
				p1[idx1] = 1;
				
			}
			
			if (turn%2==1) {
				int num2 = ran.nextInt(3)+1;
				System.out.println("[p2컴퓨터] : " + num2);
				p2[idx2] = 0;
				idx2 = idx2 + num2;
				if (idx2>=8) {
					idx2 = idx2 % 8;
					win2++;
				}
				p2[idx2] = 2;
				
			}
			
			if (idx1==idx2 && idx1!=0 && turn%2==0) {
				System.out.println("[p1사용자]가 [p2컴퓨터]를 잡았다!");
				p2[idx2]=0;
				idx2=0;
				p2[idx2]=2;
			}
			else if(idx1==idx2 && idx2!=0 && turn%2==1) {
				System.out.println("[p2컴퓨터]가 [p1사용자]를 잡았다!");
				p1[idx1]=0;
				idx1=0;
				p1[idx1]=1;
			}
			turn++;
			
			
		}
		

	}

}
