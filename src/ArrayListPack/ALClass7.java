package ArrayListPack;

import java.util.ArrayList;

public class ALClass7 {

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
	
		System.out.println(A);
		
		
		ArrayList B = new ArrayList();
		
		B.add("hen");				//0
		B.add(4562521);                //1
		B.add("Yes");              //2
		B.add("No");               //3
		B.add(3252346);                //4
		
		
		System.out.println(B);
		
		A.addAll(B);
		
		
		System.out.println(A);
		
		

	}

}
