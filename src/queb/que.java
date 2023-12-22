package queb;

import java.util.ArrayList;
import java.util.Iterator;

public class que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>a = new ArrayList<Integer>();
		
		a.add(1);
		a.add(200);
		a.add(100);
		a.add(500);
		a.add(900);
		{
//		System.out.println(a);
		
		}
		Iterator<Integer> v = a.iterator();
		while(v.hasNext())
		{
			System.out.println(v.next());
		}
		

	}

}

