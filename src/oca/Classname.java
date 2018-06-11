package oca;

import java.util.ArrayList;
import java.util.List;

interface a{}
class b implements a{}
class c extends b{}
public class Classname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List objs = new ArrayList();
		a c1 = new b();
		a c2 = new c();
		b c3 = new c();
		objs.add(c1);
		objs.add(c2);
		objs.add(c3);
		for(Object item: objs) {
			System.out.println(item.getClass().getName());
		}

	}

}
