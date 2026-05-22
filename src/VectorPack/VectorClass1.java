package VectorPack;

import java.util.Vector;

public class VectorClass1 {

	public static void main(String[] args) {
		Vector V = new Vector();
		
		V.add("Good");				//0
		V.add(1246);                //1
		V.add("City");              //2
		V.add(false);               //3
		V.add(true);                //4
		V.add("hello");             //5
		V.add(35235F);              //6
		V.add(623L);                //7
		V.add("Parrot");            //8
		
		System.out.println("With 9 Elements, vector capacity is : " +V.capacity());
		
		

	}

}
