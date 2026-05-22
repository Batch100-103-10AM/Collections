package LinkedListPack;

import java.util.LinkedList;

public class LLClass1 {

	public static void main(String[] args) {
		
		LinkedList L = new LinkedList();
		
		L.add("Good");				//0
		L.add(1246);                //1
		L.add("City");              //2
		L.add(false);               //3
		L.add(true);                //4
		L.add("hello");             //5
		L.add(35235F);              //6
		L.add(623L);                //7
		L.add("Parrot");            //8
		L.add(true);                //9
		L.add("Hai");               //10
		L.add("Read");              //11
		
		System.out.println(L);
		
		L.addFirst("King");
		L.addLast("Queen");
		
		System.out.println(L);
		
		L.removeFirst();
		L.removeLast();
		
		System.out.println(L);
		
		
		

	}

}
