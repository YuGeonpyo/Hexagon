package ygp;

import java.util.Scanner;

public class siken {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력해봐");
		int grand = sc.nextInt();
		
		
          
		if(grand >= 90 && grand <= 100) {
			System.out.println("A");
		}
		
		else if(grand >= 80 && grand <= 89) {
			System.out.println("B");
	    }
		   
		else if(grand >= 70 && grand <= 79) {
			System.out.println("C");
		}
		else if(grand >= 60 && grand <= 69) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		    }
	
	}
