package Chapter02_Compare;

public class AndOr {

	public static void main(String[] args) {
		
//		논리 연산자
		
		int val = 6;
		
//		AND (&&) - 둘다 만족해야함 (논리 곱)
		if (val>1 && val<7) {
			System.out.println(val+"은 1보다 크고 7보다는 작다");
		}

		
//		OR - 둘 중에 하나만 만족해도 됨 ( 논리 합 )
		if (val%2 == 0 || val%4 ==0) {
			System.out.println("2 또는 3의 배수");
		}
		
		
//		XOR ( 배타적 논리합 ) - true, false 둘다 있어야 결과가 true 가 됨
		if (val>1 ^ val>9) {
			System.out.println("9이하의 값");
		}
		
		
		
	}

}
