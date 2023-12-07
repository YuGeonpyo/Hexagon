package ygp;

public class Bankaccount {
	// data, data 처리 방법
	public String bankname = "";
	public String name = "";
	public String account = "";
	private int basesalary = 0; //기본 급여
	private int salary = 0; // 월 급여
	public String desc = ""; //비고 : 이 고객 진상임 
	
	//instance  만들 때 어떻게 만들 것인가
	//생성자
	// 이름, 계좌, 비고
	// 이름, 계좌
	public Bankaccount(String name, String bankname, String account, String desc) {
		this.name = name;
		this.bankname = bankname; 
		 this.account = account;
		 this.desc = desc;
		 
	}
	public Bankaccount(String name, String bankname, String account) {
		this.name = name;
		this.bankname = bankname;
		this.account = account;
	}
	
	//getter, setter
	
	//기본 급여 setBaseSalary(int baseSalary)
	//월 급여 setter
	
	public void monthSalary(int month) {
		int total = this.basesalary + month; // 이달의 급여
		this.salary = total;
	}
	
	
	//이달의 급여 정보 출력
	public Bankaccount(int basesalary, int salary) {
		this.basesalary = basesalary;
		this.salary = salary;
		}
	
	public void salaryInfo() {
		System.out.println("basesalary = " + basesalary + ", salary = " + salary);	
	}
	
	//getter
	
		public String getName() {
			return this.name;
		}
	
		public String getBankame() {
			return this.bankname;
		}
		public String getAccount() {
			return this.account;
		}
		public String getDesc() {
			return this.desc;
		}
		public int getBasesalary() {
			return this.basesalary;
		}
		public int getSalary() {
			return this.salary;
		}
		
		
		
		//setter
		public void setName(String name) {
			this.name = name;
		}
		
		public void setBankname(String bankname) {
			this.bankname = bankname;
		}
		
		public void setAccount(String account) {
			this.account = account;
		}
		
		public void setDesc(String desc) {
			this.desc = desc;
		}
		
		public void setBasesalary(int basesalary) {
			this.basesalary = basesalary;
		}
		
		public void setSalary(int salary) {
			this.salary = salary;
		}	
			
	
	//계좌 설계 정보
	public void bankaccountInfo() {
		System.out.println("name : " + name + ", account : " + account);
	}
}
