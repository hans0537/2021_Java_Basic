package step1_06.loop;

// # 2차원 반복문

public class LoopEx21 {

	public static void main(String[] args) {
		
		for (int i = 2; i < 10; i++) {
			System.out.println("==========" +i+"단==========");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j +" = "+(i*j));
			}
		}
		
		System.out.println();
		
		int i = 2;
		while (i < 10) {
			
			System.out.println("==========" +i+"단==========");
			int j = 1;
			
			while (j < 10) {
				System.out.println(i + " * " + j +" = "+(i*j));
				j++;
			}
			
			i++;
			
		}
				
	}

}
