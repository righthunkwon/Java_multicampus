package test04.sort;


	/*
		삽입정렬(InsertionSort)
			: 선택한 요소를 그보다 더 앞쪽의 알맞은 위치에 삽입하는 작업을 반복하여 정렬하는 알고리즘
			: 매 순서마다 해당 원소를 삽입할 수 있는 위치를 찾아 해당 위치에 넣는다.
			: 손안의 카드를 정렬하는 방법과 유사하다.
					- 새로운 카드를 기존의 정렬된 카드 사이의 올바른 자리를 찾아 삽입한다.
					- 새로 삽입될 카드의 수만큼 반복하게 되면 전체 카드가 정렬된다.
			
			: 삽입 정렬은 두 번째 자료부터 시작하여 그 앞(왼쪽)의 자료들과 비교하여 삽입할 위치를 지정한 후 자료를 뒤로 옮기고 지정한 자리에 자료를 삽입하여 정렬하는 알고리즘이다.
			  즉, 두 번째 자료는 첫 번째 자료, 세 번째 자료는 두 번째와 첫 번째 자료, 네 번째 자료는 세 번째, 두 번째, 첫 번째 자료와 비교한 후 자료가 삽입될 위치를 찾는다.
 	 		  자료가 삽입될 위치를 찾았다면 그 위치에 자료를 삽입하기 위해 자료를 한 칸씩 뒤로 이동시킨다. 이때 처음 Key 값은 두 번째 자료부터 시작한다.
 	 		: 시간복잡도 = 최선일 경우 O(n), 최악일 경우(입력자료가 역순일 경우) O(n^2)
 	 		
 	 		장점
 	 			안정적인 정렬방법
 	 			레코드의 수가 적을 경우 알고리즘이 간단하므로 다른 복잡한 정렬 방법보다 유리
 	 			대부분의 레코드가 이미 정렬되어 있는 경우 매우 효율적
 	 			
 	 		단점
 	 			비교적 많은 레코드들의 이동을 포함
 	 			레코드 수가 많고 레코드 크기가 클 경우 적합하지 않음
			  
	*/


public class ArrayInsertionSort {

	public static void main(String[] args) {
		// 데이터 : 1~100사이의 난수 10개
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1; // 
		}
		System.out.println("============= 정렬 전 =============");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();		
		
		// 삽입정렬(insertion sort)
		for(int i=1; i<arr.length; i++) { // 기준점(0번째 index는 제외하고 연산해야 하므로 i=1부터)
			int temp = arr[i]; // 비교대상이 되는 기준값을 임시변수에 보관
			int j;
			for(j=i-1; j>=0 && temp<arr[j] ; j--) {
				arr[j+1] = arr[j];
			}
			// temp보다 j번째 값이 작으면
			arr[j+1] = temp;
			
			// 출력부분
			System.out.println("==========="+i+"번째 정렬 후 ===========");
			for(int k=0; k<arr.length; k++) {
				System.out.print(arr[k]+"  ");
			}
			System.out.println();
					
		}
	}

}

	/*
		난수 생성의 두 가지 방법
			: Random 클래스, Math 클래스의 random() 메소드
			
			
			(1) Random 클래스
				Random 클래스는 java.util 패키지안에 있어 사용시 import가 필요하고 할당연산자 new를 통해 객체를 생성해주어야 한다. 
				기본 생성자를 통해 Random객체를 생성하면 현재시간을 종자값으로 사용하고 setSeed메서드를 통해 시드값을 따로 설정해줄수도 있다. 
	
				ran.setSeed(10);
				()안에 seed값을 넣어주면 실행할 때마다 같은 패턴으로 랜덤값이 나오는 것을 알 수 있다. 
				이렇게 정해진 랜덤패턴을 사용하기 위해서는 Random클래스를 사용하면 된다. 
				하지만 사용자에게 예측 불가능한 랜덤값을 나타내고 싶을 때는 seed값을 지정하는 것은 안전하지 않은 선택이다.
			
			
			(2) Math 클래스의 random() 메소드
				Math 클래스는 최상위 클래스인 Object 클래스 안에 있으므로 따로 Import를 시켜주지 않아도 사용이 가능하다. 
				또한 Math.random()메소드도 static메소드로 이루어져있기에 바로 호출할 수 있다. 
				Math.random()의 메소드는 시드값으로 현재시간을 사용하므로 매번 실행시킬때마다 다른 숫자가 출력된다. 
				또한 Math.random() 메서드를 실행하면 실수형의 0.0 ~ 1.0사이의 무작위 실수값이 하나 리턴된다. 
				소수점 자리수가 무한한 무한소수의 형태로 출력되므로 무한에 가까운 경우의 수가 나타난다. 
				이 실수값을 정수형으로 가공을 하고 싶다면 값에 정수값을 곱하거나 나눈 다음 형변환하여 사용한다.
	*/
