package ArraysPack;

public class Arrays4 {

	public static void main(String[] args) {
	int[] marks = new int[11];
	
	marks[3] = 61;
	marks[1] = -16;
	marks[0] = 92;
	marks[7] = 27;
	//marks[11] = 82;  // java.lang.ArrayIndexOutOfBoundsException
	marks[10] = 82;
	
	for(int t = 0 ; t < 11 ; t++)
	{
		System.out.println(marks[t]);
	}
	
	
		
	
		
		

	}

}
