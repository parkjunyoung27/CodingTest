package algorithm;

import java.util.Scanner;

public class problem1 {
	
	public static void main(String[] args) {
		
		System.out.println("---------------- 1. 문자열 출력하기 -------------------");
		System.out.println("Hello World");

		System.out.println("---------------- 2. 문자열 출력하기 -------------------");
		System.out.println("Mary\' cosmetics"); //특수 기호 출력
		
		System.out.println("---------------- 3. 포맷 연산자 -------------------");
		double num = 3.141592;		 
		double result = Math.round(num*100)/100.0; // 소수점 둘째자리까지 출력
		System.out.println(result);
		 
		System.out.println("---------------- 4. 사용자 입력 -------------------");
		Scanner sc = new Scanner(System.in); 
		 
		System.out.println("첫번쨰 숫자를 입력해주세요 : ");
		String first = sc.next();
		System.out.println("두번째 숫자를 입력해주세요 : ");
		String second = sc.next();
		
		System.out.println(Integer.parseInt(first)+ Integer.parseInt(second)); //문자를 숫자로 바꾸기 

		System.out.println("---------------- 5. 사용자 입력(반복문을 배우는 이유) -------------------");
		System.out.println("출력하고자 하는 문자열을 입력하시오 : ");
		String text = sc.next();
		System.out.println("몇번 반복 하시겠습니까?");
		int repeat = Integer.parseInt(sc.next());
	
		System.out.println(text);
		for(int i = 0; i<repeat; i++) {
			System.out.println(text);
		}
		
		System.out.println("---------------- 6. 형 변환 -------------------");
		String string1 = "720";
		int digit1 = 100;
		
		System.out.println(Integer.parseInt(string1)); //문자를 숫자로
		System.out.println(digit1+"");
		System.out.println(String.valueOf(digit1)); //숫자를 문자로
		
		System.out.println("---------------- 7. 사칙 연산 -------------------");
		
		System.out.println("첫번째 숫자를 입력해주세요 : ");
		int num1 = Integer.parseInt(sc.next());
		System.out.println("두번째 숫자를 입력해주세요 : ");
		int num2 = Integer.parseInt(sc.next());
		
		System.out.println(num1 + num2); // 덧셈
		System.out.println(num1 - num2); // 뺼셈
		System.out.println(num1 * num2); // 곱하기
		System.out.println(num1 / num2); // 나누기(정수는 나누기 값도 정수로)
		
		System.out.println("---------------- 8. 거듭 제곱 -------------------");
		System.out.println("밑의 숫자를 입력해주세요 : ");
		num1 = Integer.parseInt(sc.next());
		System.out.println("지수의 숫자를 입력해주세요 : ");
		num2 = Integer.parseInt(sc.next());
		
		System.out.println(Math.pow(num1, num2)); // 거듭제곱 
		
		System.out.println("---------------- 9. 입력과 출력 -------------------");
		System.out.println("첫번째 숫자를 입력해주세요 : ");
		int number1 = Integer.parseInt(sc.next());
		System.out.println("두번째 숫자를 입력해주세요 : ");
		int number2 = Integer.parseInt(sc.next());
		
		System.out.println(number1 + number2);
		System.out.println(number1 * number2);		
		System.out.println(number1 / (double)number2);//나누기
		System.out.println(number1 / number2);//몫
		System.out.println(number1 % number2);//나머지
		
		System.out.println("---------------- 10. 입력과 출력 -------------------");
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
		System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
		System.out.println(number1 + " / " + number2 + " = " + (number1 / (double)number2));
		System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
		System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
		
		System.out.println("---------------- 11. 입력과 출력 -------------------");
		
		System.out.println("첫번째 숫자를 입력해주세요 : ");
		number1 = Integer.parseInt(sc.next());
		System.out.println("두번째 숫자를 입력해주세요 : ");
		number2 = Integer.parseInt(sc.next());
		System.out.printf( " %d  / %d = %.2f ",number1,number2,number1/(double)number2);
		
	}
	
}
