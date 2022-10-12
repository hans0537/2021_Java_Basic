package step1_06.loop;

public class LoopEx02 {

	public static void main(String[] args) {

		
		// 예시 1) 
		
		int i = 1;
		
		while ( i <= 10 ) {
			
			if (i >= 5 && i < 9) {
				System.out.println(i);
			}
			i++;
			
		}		
		System.out.println();
		
		
		
		// 예시 2)
		
		i = 10;
		
		while ( i >= 1 ) {
			
			if (i >= 3 && i <= 6) {
				System.out.println(i);
			}
			i--;
			
		}
		System.out.println();
		
		
		// 예시 3)
		
		i = 1;
		
		while ( i <= 10 ) {
			
			if ( i % 2 == 0 ) {
				System.out.println(i);
			}
			i++;
			
		}
		System.out.println();
		
		
		
	}

}
