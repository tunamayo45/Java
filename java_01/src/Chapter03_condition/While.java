package Chapter03_condition;

public class While {

	public static void main(String[] args) {
		
		/* 반복문에 정해진 횟수가 없을 때 사용
		 * 조건이 true 면 계속 한다. -> 조건이 false 일때 까지 한다.
		*/
		
//		while 은 조건이 참이면 계속 반복한다.
		int i = 1;
		while (true) { // 조건이 true 이므로 무한 반복이 된다.
			System.out.println(i);
			i++;
//			멈출 수 있는 코드 삽입
			if (i==100) {
				break; // break 는 소스파일 전체를 멈추는게 아니라 가장 가까운 반복문을 종료시킨다.
			}
		}
		
		/*100 이 출력 않되는 이유
		 * i 가 100 이 되는 순간 break 가 실행되어
		 * println 이 실행되기 전에 반복문이 종료되기 때문이다.
		 * 
		 * while(true)는 무한 반복문이다.
		 * break 와 같은 종료 조건이 없으면 반복문을 빠져나올 수 없다.
		 * 
		 * unreachable code (도달 할 수 없는 코드) : 컴파일러가 판단했을 때 절대로 실행될 수 없은 코드
		 * 해결 방법 1 : 무한 반복을 발생시키는 코드를 제거한다.
		 * 해결 방법 2 : break 와 같은 반복문 종료 조건을 추가한다.
		*/
		
		int cpu = 1;
		System.out.println(cpu); // unreachable code break 가 없으면 실행이 안됨

	}

}
