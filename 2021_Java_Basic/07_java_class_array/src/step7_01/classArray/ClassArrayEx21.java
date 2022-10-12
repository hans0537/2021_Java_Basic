package step7_01.classArray;

import java.util.ArrayList;

class Tv{
	
	String name;
	String brand;
	int price;
	
	Tv (String name, String brand, int price){
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
}

class TvList{
	
	Tv[] arr = null;
	int cnt;
	
	void add(Tv tv) {
		if(cnt==0) {
			arr = new Tv[cnt + 1];
		}
		else if (cnt > 0) {
			Tv[] temp = arr;
			
			arr = new Tv[cnt + 1];
			for (int i = 0; i < cnt; i++) {
				arr[i] = temp[i];
			}
		}
		arr[cnt] = tv;
		cnt++;
	}
	
	int size() {
		return cnt;
	}
	
	void remove(int index) {
		if (cnt == 1) {
			arr = null;
			cnt = 0;
		}
		else if (cnt > 1) {
			Tv[] temp = arr;
			
			arr = new Tv[cnt - 1];
			for (int i = 0; i < index; i++) {
				arr[i] = temp[i];
			}
			for (int i = index; i < cnt-1; i++) {
				arr[i] = temp[i+1];
			}
		}
		cnt--;
	}
}
public class ClassArrayEx21 {

	public static void main(String[] args) {
		
		//ArrayList 사용
		ArrayList<Tv> list = new ArrayList<Tv>();
		
		Tv temp = new Tv("TV", "삼성", 1000);
		list.add(temp);
		
		temp = new Tv("시그니처 TV", "엘지", 2000);
		list.add(temp);
		
		temp = new Tv("스마트TV", "애플", 3000);
		list.add(temp);
		
		for(Tv tv : list) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}
		
		//System.out.println(list.get(0).brand);
		
		//직접 ArrayList 와 비슷한 메서드를 만들어서 구현
		TvList myList = new TvList();
		temp = new Tv("TV", "삼성", 1000);
		myList.add(temp);

		temp = new Tv("시그니처TV", "엘지", 2000);
		myList.add(temp);

		temp = new Tv("스마트TV", "애플", 3000);
		myList.add(temp);
		
		myList.remove(1);
		
		for (Tv tv : myList.arr) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}
		
	}

}
