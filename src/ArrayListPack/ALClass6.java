package ArrayListPack;

import java.util.ArrayList;

public class ALClass6 {

	public static void main(String[] args) {
		ArrayList A = new ArrayList();
		
		A.add("Good");				//0
		A.add(1246);                //1
		A.add("City");              //2
		A.add(false);               //3
		A.add(true);                //4
		A.add("hello");             //5
		A.add(35235F);              //6
		A.add(623L);                //7
		A.add("Parrot");            //8
		A.add(true);                //9
		A.add("Hai");               //10
		A.add("Read");              //11
		
		//System.out.println(A);
		
		System.out.println("The Number of Elements in the collections is : " +A.size());
		
		for(int u = 0 ; u < A.size() ; u++)
		{
			System.out.println(A.get(u));
		}
		
		

	}

}
