package ygp;

public class Management {
     public static void main(String[] args) {
    	 Person firstP = new Person("유건표", 27);
    	 Person secondP = new Person("조정인", 26);
    	 Person thirdP = new Person("최가람", 26, "P20231207");
    	 
    	 Bankaccount firstPaccount = new Bankaccount("유건표", "신한은행", "110-444-739027", "천재");
    	 Bankaccount secondPaccount = new Bankaccount("조정인", "카카오뱅크", "33333-000-0000");
    	 Bankaccount thirdPaccount = new Bankaccount("최가람", "우리은행", "10-484-6423");
     
        firstP.personInfo();
        secondP.personInfo();
        thirdP.personInfo();
        
        firstPaccount.bankaccountInfo();
        secondPaccount.bankaccountInfo();
        
        System.out.println("최가람 사원번호 : " + thirdP.getP_num());
        
        firstP.setP_num("P100");
        
     }
}
