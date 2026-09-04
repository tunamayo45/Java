package Chapter01_basics;

public class Toaster {

//	간단한 method 사용 법

//	타입이 존재하지 않을 때 void(공허, 하무것도 없다.)
	
	public static void main(String[] args) {
		String dish = toaster("빵"); //
		System.out.println(dish);
	}
	
	static String toaster(String input) {
		System.out.println(input + "구워진다.");
		return "구워진 "+ input;
	}
}
