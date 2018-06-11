package oca;
class Test{
	int sum=0;
	public void docheck(int num) {
		if( num%2==0) {
			break;//if can not use break or continue
		}else {
			for(int i =0;i<num;i++) {
				sum+=i;
			}
		}
	}
}
public class N72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
