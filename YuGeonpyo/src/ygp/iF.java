package ygp;

public class iF {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 100;
		
		//num1이 num2 보다 작을 때
		//num1과 num2를 곱한 값을 출력하고
		// num1에 50을 곱한 값을 num1에 저장하시오
		
		//새로운 if문을 만들어 num1이 num2 보다 작을 때
        //system.out.println("num1이 num2보다 작다")
		//출력하고
		//else if문에 num1이 num2보다 클 때 
		//num1 과 num2를 더한 값을 출력하시오
		
		if(num1 < num2) {
			System.out.println("num1 * num2 = " + (num1*num2));
			num1 *= 50;
		}	
	    if(num1 < num2) {
	    	System.out.println("num1이 num2보다 작다");
	    } else if(num1 > num2) {
	        System.out.println("num1 + num2 = " + (num1 + num2)); 
	    	 
	    }
	  }
    }
 


