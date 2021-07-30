package day04_if;

import java.util.Scanner;

public class Ex04_switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		System.out.println("수 입력");
		select = input.nextInt();
		switch( select%2 ) {
		case 0:System.out.println("입력 값은 짝수 입니다");break;
		case 1:
			System.out.println("1.입력값 : "+select); 
			break;
		case 2:System.out.println("2.입력값 : "+select); break;
		case 3:System.out.println("3.입력값 : "+select); break;
		default:System.out.println("1,2,3을 제외한 다른 값 입력");break;
		}
		/*
		if(select == 1) {
			
		}
		*/
	}
}






