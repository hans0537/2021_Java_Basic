package step7_01.classArray;
//# ArrayList 클래스의 기능을 직접 구현해보자!
import java.util.Arrays;

class MyList{

	int[] arr = null;
	int cnt = 0;

	void add(int value) {
		if (cnt==0) {
			arr = new int[cnt+1];
		}
		else if (cnt>0) {
			int[] temp = arr;
			arr = new int[cnt+1];

			for (int i = 0; i < cnt; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}
		arr[cnt] = value;
		cnt++;
	}

	void add(int idx, int value) {
		if (idx<0 || idx>cnt) {
			System.out.println("해당 인덱스에는 추가 불가");
		}else {
			if (cnt==0) {
				arr = new int[cnt+1];
			}
			else if (cnt>0) {
				int[] temp = arr;
				arr = new int[cnt+1];

				int j = 0;
				for (int i = 0; i < cnt+1; i++) {
					if(i!=idx) {arr[i] = temp[j++];}
				}
				temp = null;
			}
			arr[idx] = value;
			cnt++;
		}
	}

	void remove(int idx) {
		if (cnt==1) {
			arr = null;
		}
		else if(cnt > 1) {
			int[] temp = arr;
			arr = new int[cnt - 1];

			int j = 0;
			for (int i = 0; i < cnt; i++) {
				if (i!=idx) {
					arr[j++] = temp[i];
				}
			}
			temp = null;
		}
		cnt--;
	}

	int size() {
		return cnt;
	}

	int get(int idx) {
		return arr[idx];
	}
	
	void set(int idx, int value) {
		arr[idx] = value;
	}
	
	void clear() {
		arr = null;
		cnt = 0;
	}
}
public class ClassArrayEx22 {

	public static void main(String[] args) {

		// 직접 구현한 ArrayList
		MyList list = new MyList();
		
		//추가하기
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(Arrays.toString(list.arr));

		//해당 위치에 추가하기
		list.add(3,30);
		System.out.println(Arrays.toString(list.arr));
		
		//해당 위치 삭제하기
		list.remove(3);
		System.out.println(Arrays.toString(list.arr));
		
		//길이 구하기
		int size = list.size();
		System.out.println(size);
		
		//(index로) 값 꺼내오기
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			System.out.print(list.get(i));
			if (i != size - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		//특정 위치값 수정하기
		list.set(3,1000);
		System.out.println(Arrays.toString(list.arr));
		
		//클리어 하기
		list.clear();
		System.out.println(Arrays.toString(list.arr));
		System.out.println(list.size());
	}

}
