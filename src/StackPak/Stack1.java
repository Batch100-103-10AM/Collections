package StackPak;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack S = new Stack();
		
		S.push("Good");				
		S.push(1246);                
		S.push("City");              
		S.push(false);               
		S.push(true);                
		S.push("hello");             
		S.push(35235F);              
		S.push(623L);                
		S.push("Parrot");  
		
	System.out.println(S);
	
		S.pop();
		
		System.out.println(S);
		
		System.out.println(S.firstElement());
		System.out.println(S.lastElement());
		System.out.println(S.peek());
		
		
		
		
		
		

	}

}
