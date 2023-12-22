package collectionobject;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
ArrayList<Integer> ai = new ArrayList<Integer>();
		
		ai.add(200);
		ai.add(300);
		ai.add(500);
		

      Iterator<Integer> itr = ai.iterator();
      
      while(itr.hasNext());
      {
    	  System.out.println(itr.next());
      }
	}

}
