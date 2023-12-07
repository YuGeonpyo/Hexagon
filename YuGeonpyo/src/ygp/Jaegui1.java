package ygp;

public class Jaegui1 {

	public static void main(String[] args) {
		int a = 4;
		System.out.println(fibo(a));
		
		
	}
	public static int fibo (int num) {
		int result = 0;
		
		if(num == 1) {
			result = 1;
		}
		else if(num == 2) {
			result =1;
		}
		else if(num >= 3) {
			result = fibo(num-2) + fibo(num-1);
		}
		return result;
	}

	}


