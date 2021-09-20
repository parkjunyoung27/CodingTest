package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class problem3 {

	public static void main(String args[]) {
		
	System.out.println("---------------- 31. 반복문  -------------------");
	int sum = 0;
	for(int i=1; i<11; i++) {
		sum += i;
	}
	System.out.println(sum);
		
	System.out.println("---------------- 32. 반복문  -------------------");
	for(int i=2; i<10; i++) {
		int j = 1;
		for(j=1; j<10; j++) {
			System.out.println(i +"*"+ j +"="+i*j);
		}
	}
	
	System.out.println("---------------- 33. 반복문과 문자열 다루기(split)  -------------------");
	
	String name= "Dave,David,Andy,Arthor";
	String[] arr = name.split(",");
	for(int i =0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	int idx = name.indexOf(",");
	System.out.println(idx); //하나만 나눌때 좋다
	
	System.out.println("---------------- 34. 반복문과 문자열 다루기(split)  -------------------");
	name = "[Dave],[David],[Andy],[Arthor]";
	arr = name.split(",");
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i].substring(1,arr[i].length()-1));
	}
	
	System.out.println("---------------- 35. 반복문과 조건문  -------------------");
	for(int i=1; i<31; i++) {
		if(i%3==0) { // 나머지가 0
			System.out.println(i);
		}
	}
	
	System.out.println("---------------- 36. 반복문(while)  -------------------");
	
	int i = 1;
	sum = 0;
	while(i<101) {
		sum+=i;
		i++;
	}
	System.out.println(sum);
	
	System.out.println("---------------- 37. 반복문(while)  -------------------");
	Scanner sc = new Scanner(System.in);
	String pw = "1234";
	
	System.out.println("비밀번호를 입력하세요 : ");
	while(pw!=sc.next()) {
		System.out.println("비밀번호가 맞지않습니다. 다시 입력해주세요 : ");
		sc.next();
		break;
	}
	System.out.println("비밀번호가 맞습니다.");
	
	System.out.println("---------------- 38. 데이터 구조와 반복문(리스트)  -------------------");
	System.out.println("----------------  중요  -------------------");
	double[] arr1 = {0,-11, 31, 22,-11, 33, -44, -55};
	ArrayList<Integer> arr2 = new ArrayList<Integer>();
	
	for(int j=0; j<arr1.length; j++) {
		if(arr1[j]>=0) {
			arr2.add((int) arr1[j]);
		}
	}
	System.out.println(arr2.toString());	
	
	System.out.println("---------------- 39. 데이터 구조와 반복문(리스트)  -------------------");

	String[] arr5 = {"fun-coding", "Dave", "Linux","Python", "javascript", "front-end", "back-end", "dataengineering"};
	for(i=0; i<arr5.length; i++) {
		System.out.println(arr5[i]+"문자의 길이 : "+ arr5[i].length());
	}
	
	System.out.println("---------------- 40. 데이터 구조와 반복문(리스트)  -------------------");
	int[] arr40 = {1,2,3,4,5,6,7,8,9,10};
	for(i=0; i<arr40.length; i++) {
		System.out.println(arr40[i]);
	}
	
	System.out.println("---------------- 41. 데이터 구조와 반복문(리스트), 반복문, 문자열 다루기  -------------------");
	String[] arr41 = {"exercise01.docx","exercise02.docx","exercise03.docx","exercise04.docx","exercise05.docx"};
	for(i=0; i<arr41.length; i++) {
		int index = arr41[i].indexOf(".");
		System.out.println(arr41[i].substring(0,index));
	}
	
	System.out.println("---------------- 42. 데이터 구조와 반복문(리스트), 반복문, 문자열 다루기  -------------------");
	String[] arr42 = {"exercise01.docx","exercise02.csv","exercise03.txt","exercise04.hwp"};
	for(i=0; i<arr42.length; i++) {
		int index = arr42[i].indexOf(".");
		if(arr42[i].substring(index+1, arr42[i].length()).equals("txt")) {
			System.out.println(arr42[i]);			
		}
	}
	
	System.out.println("---------------- 43. 문자열 다루기와 조건문  -------------------");
	String doller = "100 달러";
	String[] prices = doller.split(" "); // 띄어쓰기 중요
	int price =Integer.parseInt(prices[0]);
	System.out.println(price);
	System.out.println(price*1112+"원");
	
	System.out.println("---------------- 44. 문자열 다루기와 조건문  -------------------");
	String moneys = "100 위안";
	int money = Integer.parseInt(moneys.split(" ")[0]);
	if(moneys.split(" ")[1]=="달러") {
		System.out.println(money*1112+"원");
	}else {
		System.out.println(money*171+"원");
	}
	
	System.out.println("---------------- 45. 문자열 다루기와 조건문 (dictionary) -------------------");
	String input = "100 달러";
	String[] result = input.split(" ");
	
	Map<String, Integer> exchange = new HashMap<String, Integer>();
	exchange.put("달러", 1112);
	exchange.put("위안", 171);
	exchange.put("엔", 1010);
	
	int won = Integer.parseInt(result[0]);
	String word = result[1];
	
	if(word.equals("달러") || word.equals("위안") || word.equals("엔")) {
		System.out.println(won * exchange.get(word)+"원");
	}
	
	System.out.println("---------------- 46. 이중 반복문 -------------------");
	
	for( i=2; i<10; i++) {
		int j = 1;
		for(j=1; j<10; j++) {
			System.out.println(i +"X"+ j +"="+i*j);
		}
	}
	
	System.out.println("---------------- 47. 이중 반복문과 조건문 -------------------");

	for( i=2; i<10; i++) {
		int j = 1;
		for(j=1; j<10; j++) {
			if( i*j % 2 == 0) {
				System.out.println(i +"X"+ j +"="+i*j);				
			}
		}
	}
	
	System.out.println("---------------- 48. 이중 반복문과 데이터 구조(리스트) -------------------");
	
	String[] dong = {"6209동", "6208동", "6207동"};
	String[] hos = {"101호", "102호", "103호", "104호"};
	
	for(i=0; i<dong.length; i++) {
		for(int j=0; j<hos.length; j++) {
			System.out.println(dong[i]+" "+hos[j]);
		}
		System.out.println("");
	}
	
	
	
	
	}
	
}
