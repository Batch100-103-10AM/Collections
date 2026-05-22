package VectorPack;

import java.util.Vector;

public class VectorClass4 {

	public static void main(String[] args) {
		Vector V = new Vector(4);
		
		
		V.add("ElderKid");
		V.add("YongerKid");
		
		System.out.println("Now the capacity is : " +V.capacity());
		
		V.add("FatherName");
		V.add("MotherName");
		
		System.out.println("capacity with 4 elements is : " +V.capacity());
		
		
		

	}

}
