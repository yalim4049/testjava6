package com.tech2.poly;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();

}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	public void clacSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 *2");
	}
}

abstract class Manager extends Employee {
	public void clacSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}

public class HRSTest {

	public static void calTax(Employee s) {
		// System.out.println("소득세를 계산합니다.");
		System.out.println("Salesman 비교 : " + (s instanceof Salesman));
		if (s instanceof Salesman) {
			System.out.println("Salesman 입니다.");
		} else if (s instanceof Manager) {
			System.out.println("Manager 입니다.");
		} else if (s instanceof Consultant) {
			System.out.println("Consultant 입니다.");
		}

	}

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();

		Object arr[] = new Object[3];

		arr[0] = s;
		arr[1] = c;
		arr[2] = d;

		// calTax(arr[0]);
		// calTax(arr[1]);
		// calTax(arr[2]);
		calTax(s);
		// for (Object object : arr) {
		// calTax(object);
		// }

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// s.calcBonus();
		// c.calcBonus();
		// d.calcBonus();
		// System.out.println(s.toString());
		// System.out.println(c.toString());
		// System.out.println(d.toString());
		// Salesman s2=s;
		//
		// System.out.println(s2.toString());
		//
		//
		// calcTax(s);
		// calcTax(c);
		// calcTax(d);
		//

	}

	private static void calcTax(Director d) {
		// TODO Auto-generated method stub

	}

	private static void calcTax(Consultant c) {
		// TODO Auto-generated method stub

	}

	private static void calcTax(Salesman s) {
		// TODO Auto-generated method stub

	}
}