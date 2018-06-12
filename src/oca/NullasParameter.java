package oca;

class Test1 {
	public String a;
	public Test1(String b){
		a=b;
	}
}

public class NullasParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 a = new Test1(null); //can't pass null to a constructor takes string?
		System.out.println(a);
		System.out.println(a.a);
	}

}
