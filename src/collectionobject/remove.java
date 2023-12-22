package collectionobject;

import java.util.ArrayList;

public class remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList ai = new ArrayList();
		
		ai.add(0,200);
		ai.add(1,"sneha");
		ai.add(2,500);
		System.out.println(ai);
		
		ai.remove("sneha");
		System.out.println(ai);


	}

}
