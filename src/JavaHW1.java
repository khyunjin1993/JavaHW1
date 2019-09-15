///////////////////////////////////////////////////////////////////////////////
// Title: JavaHW1
// Files: JavaHW1.java
// Semester: 2019‐2학기
//
// Author: 김현진 / khyunjin1993@naver.com
// Class: 수123
//
// 작성일: 2019‐09‐15 (1주 실습)
// 키워드: class를 이용한 객체생성, 객체의 묶음을 다루는 방법.
//
// 과제설명: 버거의 갯수와 정보를 입력하면 주어진 형식에 맞춰 출력한다. 이후, 최고가격을 입력하면
// 그보다 같거나 싼가격의 버거정보들을 출력한다.
// 과제완성여부: 완성
// 미완성 기능: none
//////////////////////////// 80 columns wide //////////////////////////////////

import java.util.ArrayList;
import java.util.Scanner;

public class JavaHW1 {
	ArrayList <Burger> BurgerList = new ArrayList<>();
	
	void mymain() {
		Scanner scan = new Scanner(System.in);
		System.out.println("quantity?");
		int quantity = scan.nextInt();
		int maxPrice; 
		int count = 0;
		System.out.println("insert burger info...");
		for(int i = 0; i < quantity; i++) {
			Burger b = new Burger();
			b.read(scan);
			BurgerList.add(b);
		}
		for(Burger b : BurgerList) {
			b.print();
		}
		System.out.print("검색할 최고 가격을 넣으세요...");
		maxPrice = scan.nextInt();
		for(Burger b : BurgerList) {
			if(b.price <= maxPrice) {
				b.print();
				count++;
			}
		}
		System.out.printf("%d원 이하 : %d개", maxPrice, count);
	}
	

	public static void main(String[] args) {
		JavaHW1 my = new JavaHW1();
		my.mymain();
	}

}

class Burger {
	int number;
	String name;
	int price;
	
	void read(Scanner scan) {
		number =  scan.nextInt();
		name = scan.next();
		price = scan.nextInt();
	}
	
	void print() {
		System.out.printf("[%d]%s %d원\n", number, name, price);
	}
}
