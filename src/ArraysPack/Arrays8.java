package ArraysPack;

public class Arrays8 {

	public static void main(String[] args) {
	String[][] marks = new String[2][5];
	
	marks[0][3] = "ZeroThree";
	marks[1][3] = "OneThree";
	marks[0][1] = "ZeroOne";
	marks[1][1] = "OneOne";
	marks[0][4] = "ZeroFour";
	marks[1][4] = "OneFour";
	marks[0][2] = "ZeroTwo";
	marks[1][2] = "OneTwo";
	marks[0][0] = "ZeroZero";
	marks[1][0] = "OneZero";
	
	for(int k = 0 ; k < marks.length  ; k++)
	{
		for(int u = 0 ; u < 5 ; u++)
		{
			System.out.print(marks[k][u]+"   ");
		}
		
		System.out.println();
	}
	
	
	
	
		
	
		
		

	}

}
