package oca;

class Test {
	public String a;
	public Test(String b){
		a=b;
	}
}

public class NullasParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test a = new Test(null);
		System.out.println(a);
		System.out.println(a.a);
	}

}
