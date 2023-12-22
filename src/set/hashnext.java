package set;

import java.util.HashMap;
import java.util.Iterator;

public class hashnext {

	public static void main(String[] args) {
		
		
		HashMap <Integer,String>s = new HashMap();
		
		s.put(101,"sneha");
		s.put(103,"sakshi");
		s.put(109,"shivani");
		s.put(106,"akankesha");
		 Iterator itr = s.iterator();
		 
		 while(itr.hasNext());
		 
		 {
			 System.out.println(itr.next());
		 }
		
	}

}
