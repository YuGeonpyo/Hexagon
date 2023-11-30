package ygp;

public class moon {

	public static void main(String[] args) {
		int year = 2020;
		
	    //year이 윤년인지 판단하시오
		
		
	 if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		 System.out.println("윤년"); 
	 }	
	 else {
		 System.out.println("평년");
	 }
	}
}	    
	 