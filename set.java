package set;

import java.util.HashSet;
import java.util.Iterator;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet a = new HashSet();
		a.add("sneha");
		a.add(200);
		a.add("shiva");
		a.add("bittu");
		a.notify();
		System.out.println(a);
	     Iterator itr = a.iterator();
	     while(itr.hasNext());
		{
			System.out.println(a.contains(1));
		}

	}

}
