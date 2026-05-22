package VectorPack;

import java.util.Vector;

public class VectorClass6 {

	public static void main(String[] args) {
		Vector V = new Vector(4, 3);
		
		
		V.add("ElderKid");
		V.add("YongerKid");
		
		System.out.println("Now the capacity is : " +V.capacity());
		
		V.add("FatherName");
		V.add("MotherName");
		
		System.out.println("capacity with 4 elements is : " +V.capacity());
		
		V.add("GrandParentName");
		
		System.out.println("capacity with 4+ elements is : " +V.capacity());
		
		V.add("ElderKid");
		V.add("YongerKid");
		V.add("GrandParentName");
		
		System.out.println("capacity with 7+ elements is : " +V.capacity());
		
	System.out.println(V.firstElement());
	System.out.println(V.lastElement());
		

	}

}
