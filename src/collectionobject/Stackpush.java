package collectionobject;

import java.util.Iterator;
import java.util.Stack;

public class Stackpush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		
		s.push("sneha");
		s.push("shiva");
		s.push(100);
		s.push(200);
		System.out.println(s);
		
		Iterator itr = s.iterator();
		while(itr.hasNext());
		System.out.println(itr.hasNext());

	}

}
