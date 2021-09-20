package algorithm;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		
		System.out.println("---------------- 12. 기본 자료형 -------------------");
	
		Integer num1 = 10;
		Integer num2 = (int) 2.2;
		String string1 = "coding";
		
		System.out.println(num1.getClass().getName());
		System.out.println(num2.getClass().getName());
		System.out.println(string1.getClass().getName());
		
		System.out.println("---------------- 13. 기본 자료형 -------------------");
		String code = "000660\n00000102\t12312312";
		System.out.println(code); // \n은 줄내리기 \t은 띄어쓰기
		
		System.out.println("000660\t00000102\t12312312");
		System.out.println("Hello\nHello\nHello\nHello");
		
		System.out.println("---------------- 14. 조건문 -------------------");	
		Scanner sc = new Scanner(System.in);
		int digit1 = sc.nextInt();
		int digit2 = sc.nextInt();
		
		if(digit1 > digit2) {
			System.out.println(digit1);
		}else {
			System.out.println(digit2);
		}
		
		System.out.println("---------------- 15. 조건문 -------------------");	
		System.out.println("숫자를 입력해주세요 : ");
		int digit3 = sc.nextInt();
		if (digit3 % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");			
		}
		
		System.out.println("---------------- 16. 조건문 -------------------");	
		System.out.println("숫자 a를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.println("숫자 b를 입력해주세요 : ");
		int b = sc.nextInt();
		System.out.println("숫자 c를 입력해주세요 : ");
		int c = sc.nextInt();
		
		if( a < b ) {
			if(a < c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else {
			if(b<c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}
		
		System.out.println("---------------- 17. 조건문 -------------------");	
		System.out.println("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		
		if(score <= 100 && score >=81) {
			System.out.println("A");
		}else if(score>=61){
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		
		System.out.println("---------------- 18. 데이터 구조 (리스트) -------------------");	
		
		System.out.println("주민등록번호를 입력해주세요 : ");
		String id = sc.next();
		System.out.println(String.valueOf(id.charAt(0))+String.valueOf(id.charAt(1)));
		
		System.out.println("---------------- 19, 20. 데이터 구조 (리스트) -------------------");	
		
		if(String.valueOf(id.charAt(8)) == "1") {
			System.out.println("남성");
		}else {
			System.out.println("여성");
		}
		
		
		System.out.println("---------------- 중요  -------------------");	
		System.out.println("---------------- 21. 데이터 구조 (리스트) -------------------");	
		System.out.println("다음 문자열에서 ...를 제거하라");
		String mystr = "a man goes into the room...";
		
		mystr = mystr.replace(".", "");
		System.out.println(mystr);
		
		System.out.println("---------------- 22. 문자열 다루기 (strip) -------------------");	
		
		mystr = "         000660\n";
		mystr = mystr.strip();
		System.out.println(mystr);
		
		System.out.println("---------------- 23. 문자열 다루기 (count) -------------------");	
		mystr = "python_desc = 'Python is an interpreted high-Level programming language for general-purpose programming.equals(Created by Guido van Rossum and first released in'" 
				+ "'1991,Python has a design philosophy that emphasizes code readability, notably using significant whitespace.'";
		
		int count = 0;
		String word="Python";
		
		String[] arr = mystr.split(word);
		count = arr.length-1;
		
		System.out.println(count);
	
		System.out.println("---------------- 24. 문자열 다루기 (count) -------------------");	

		arr = mystr.split("p");
		count= arr.length-1;
		
		System.out.println(count);			
	
		System.out.println("---------------- 25. 문자열 다루기 (문자열 인덱싱) -------------------");	
		char[] letters = "python".toCharArray();
		System.out.println(letters[1]);
		System.out.println(letters[3]);
		
		System.out.println("---------------- 26, 27. 문자열 다루기 (문자열 인덱싱) -------------------");	
		System.out.println("문자를 입력해주세요 : ");		
		String str1 = sc.next();
		if(str1.contains("n")) {
			System.out.println("n이 들어있습니다.");
		}else {
			System.out.println("n이 안들어있습니다.");			
		}
		
		System.out.println("---------------- 28. 문자열 다루기 (문자열 인덱싱)와 조건문 -------------------");	
		char[] string5 = sc.next().toCharArray();
		System.out.println(String.valueOf(string5[7])+String.valueOf(string5[8]));
		
		System.out.println("---------------- 29. 문자열 다루기 (split) -------------------");	
		String arr3 = "Dava,David,Andy,2222,3123123,LLL";
		String[] arr4 = arr3.split(",");
		
		for(int i =0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		System.out.println("---------------- 30. 문자열 다루기 (split) -------------------");	

		String str5 = "exercise01.docs";
		String[] str7 = str5.split(".");
		System.out.println(str7.length);
	
		System.out.println("------------------------------------중요-----------------------------------");
		String document = "exercise01.docs";
		int idx = document.indexOf(".");
		
		String document1 = document.substring(0,idx);
		System.out.println(document1);
	
	}
	
}
