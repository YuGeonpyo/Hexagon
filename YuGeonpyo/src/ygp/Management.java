package ygp;
import java.util.*;
public class Management {
     public static void main(String[] args) {

    	 
    	 
    	 String MyLevel;  
    	   
    	//인사관리를 한 명이 '직접'하는 형태 
       	//인사관리팀, 사장님, 내가 내 급여
       	Scanner sc = new Scanner(System.in);
       	System.out.print("이름 입력");
       	String myName = sc.nextLine();
       	System.out.println("직급 입력");
       	String myLevel = sc.nextLine();
       	
       	
       	System.out.println("이름 : " + myName + ", 직급 = " + myLevel);
    	 Person firstP = new Person("유건표", 27);
    	 Person secondP = new Person("조정인", 26);
    	 Person thirdP = new Person("최가람", 26, "P20231207");
    	 
    	 Bankaccount firstPaccount = new Bankaccount("유건표", "신한은행", "110-444-739027", "천재");
    	 Bankaccount secondPaccount = new Bankaccount("조정인", "카카오뱅크", "33333-000-0000");
    	 Bankaccount thirdPaccount = new Bankaccount("최가람", "우리은행", "10-484-6423");
    
    	 
    	 
    	 
    	  

    	 
        firstP.personInfo();
        secondP.personInfo();
        thirdP.personInfo();
        System.out.println("최가람 사원번호 : " + thirdP.getP_num());
        firstPaccount.monthSalary(1,myLevel);
        firstPaccount.salaryInfo(myName, firstP);
        
      
       
     }
}
