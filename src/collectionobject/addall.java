package collectionobject;

import java.util.ArrayList;

public class addall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList c1 = new ArrayList ();
		
		c1.add("sneha");
		c1.add("shiva");
		c1.add("akanksha");
		
		ArrayList v1 = new ArrayList();
		
		v1.add(100);
		v1.add(200);
		v1.add(400);
		
		c1.addAll(v1);
		System.out.println(c1);
		

	}

}
