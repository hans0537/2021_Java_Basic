package step1_03.operator;

/*
 * 
 * # 증감 연산자
 * 
 *  += , -= , *= , /= , %= , ++ , --
 * 
 * 
 * */

public class OpEx07 {

	public static void main(String[] args) {
		
		int tempData1 = 100;
		tempData1 -= 3;      // tempData1 = tempData1 - 3;
		System.out.println(tempData1);

		
		int tempData2 = 10;
		tempData2 += 100; 	// tempData2 = tempData2 + 100;
		System.out.println(tempData2);
		
		
		int tempData3 = 10;
		tempData3 %= 3;		// tempData3 = tempData3 % 3;
		System.out.println(tempData3);
		
		System.out.println();
		
		
		int tempX = 0;
		tempX++;       // tempX = tempX + 1  , tempX += 1
		++tempX;	   // tempX = tempX + 1  , tempX += 1
		System.out.println(tempX);
		System.out.println();
		
		/*
		 * 
		 * 변수++;
		 * ++변수의 차이점
		 * 
		 * */
		
		int x = 0;
		System.out.println(x++); // println작업 후에 x를 올린다.
		System.out.println(x);
		System.out.println();
		
		int y = 0;
		System.out.println(++y); // y를 올리고 println작업을 한다.
		System.out.println(y);
		System.out.println();		
		
	}

}
