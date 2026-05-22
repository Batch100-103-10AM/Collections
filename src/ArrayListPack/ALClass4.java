package ArrayListPack;

import java.util.ArrayList;

public class ALClass4 {

	public static void main(String[] args) {
		ArrayList A = new ArrayList();
		
		A.add("Good");				//0
		A.add(1246);                //1
		A.add("City");              //2
		A.add(false);               //3
		A.add(true);                //4
	
		
		//System.out.println(A);
		
		for(int u = 0 ; u <= 5 ; u++)  // java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 5
		{
			System.out.println(A.get(u));
		}
		
		

	}

}
