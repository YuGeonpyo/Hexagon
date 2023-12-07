package ygp;

import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		String op = "Add"; 
	 int num1 = 5;
	 int num2 = 10;
	 int result = 0;

	 
	 switch (op) {
	 case "Add":
		 result = funcAdd(num1, num2);
		 System.out.println("Add = " + result);
		 break;
		
	 case "Min" :
		 result = funcMin(num1, num2);
		 System.out.println("Min = " + result);
		 break;
		 
	 case "Div" :
		 result = funcDiv(num1, num2);
		 System.out.println(result);
	     break;
	     
	 case "Mul" :
		 result = funcMul(num1, num2);
		 System.out.println(result);
		 break;
		 
	default :
	System.out.println("Error");
	
	 }
	}
   public static int funcAdd(int num1, int num2) {
	   return num1 + num2;
	   
   }
   public static int funcMin(int num1, int num2) {
	   return num1 - num2;
   }
   public static int funcDiv(int num1, int num2) {
	   return num1 / num2;
   }
   public static int funcMul(int num1, int num2) {
	   return num1 * num2;
   }
   
}


