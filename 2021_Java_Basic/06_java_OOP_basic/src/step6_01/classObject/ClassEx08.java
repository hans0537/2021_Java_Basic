package step6_01.classObject;

import java.util.Arrays;
import java.util.Scanner;

class Ex08{

	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};

}
public class ClassEx08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Ex08 e = new Ex08();

		while(true) {
			System.out.println(Arrays.toString(e.game));
			int idx = 0;
			for (int i = 0; i < e.game.length; i++) {
				if (e.game[i]==2) {
					idx = i;
				}
			}

			System.out.print("이동 왼쪽(1) 오른쪽(2) 종료(0) : ");

			int sel = scan.nextInt();
			if (sel==1) {
				if (idx-1>=0) {
					if (e.game[idx-1]==1) {
						System.out.print("벽을 파괴 하시겠습니까? 1.예 2.아니오 : ");
						int num = scan.nextInt();
						if (num==1) {
							e.game[idx-1] = 0;
						}else {
							continue;
						}
					}else if(e.game[idx-1]==0) {
						e.game[idx] = 0;
						idx--;
						e.game[idx] = 2;
					}
				}
				
			}
			else if(sel==2) {
				if (idx+1<=e.game.length-1) {
					if (e.game[idx+1]==1) {
						System.out.print("벽을 파괴 하시겠습니까? 1.예 2.아니오 : ");
						int num = scan.nextInt();
						if (num==1) {
							e.game[idx+1] = 0;
						}else {
							continue;
						}
					}else if(e.game[idx+1]==0) {
						e.game[idx] = 0;
						idx++;
						e.game[idx] = 2;
					}
				}
			}
			else if(sel==0) {
				break;
			}
		}

	}

}
