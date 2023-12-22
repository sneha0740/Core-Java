package collectionobject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hashnext {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	List l=new ArrayList();
	  
	
	l.add(10);
	l.add("sneha");
	l.add("shiva");
	

	
	Iterator itr = l.iterator();
	while  (itr.hasNext());
	{
		System.out.println(itr.next());
	}
       
	
	l.remove(0);
	System.out.println(l);

	
	  l.add(100);
	System.out.println(l);
	}
}

