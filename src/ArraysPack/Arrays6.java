package ArraysPack;

public class Arrays6 {

	public static void main(String[] args) {
	int[] marks = new int[13];
	
	marks[3] = 61;
	marks[1] = -16;
	marks[0] = 92;
	marks[7] = 27;
	//marks[11] = 82;  // java.lang.ArrayIndexOutOfBoundsException
	marks[10] = 82;
	
	System.out.println("The Number of Elements in the Array : " +marks.length);  //length is a predefined variable
	
	for(int h = 0 ; h < marks.length ; h++)
	{
		System.out.println(marks[h]);
	}
	
	
	
		
	
		
		

	}

}
