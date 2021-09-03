package mainTest;

public class main {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(3,  4));
		System.out.println(cal.subtract(3,  4));
		System.out.println(cal.multiply(3,  4));
		System.out.println(cal.divide(4, 3));
	}

}

class Calculator {
	int add(int i, int j) {
		return i + j;
	}
	
	int subtract(int i, int j) {
		return i - j;
	}
	
	int multiply(int i, int j) {
		return i * j;
	}
	
	int divide(int i, int j) {
		if(j == 0) {
			return 0;
		}
		return i / j;
	}
}

