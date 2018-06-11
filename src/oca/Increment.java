package oca;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 5;
		int b = 4;
		int e = 4;
		long c = b*4-b++;
		long d = e*4-++e;
		System.out.println(c);
		System.out.println(d);
	}

}
