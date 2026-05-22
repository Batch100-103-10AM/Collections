package TreeSetPack;

import java.util.Iterator;
import java.util.TreeSet;

public class TSClass4 {

	public static void main(String[] args) {
		TreeSet T = new TreeSet();
		
		T.add(63463);
		T.add(632523);
		T.add(94362);
		T.add(22574);
		T.add(61241);
		T.add(367684);
		T.add(432);
		T.add(3512);
		T.add(346352);   
		T.add(3422);
		T.add(56734231);
		T.add(32263);
		T.add(34624);
		T.add(612);
		
		System.out.println(T);
		
		Iterator H = T.descendingIterator();
		
		System.out.println(H);
		
	}

}
