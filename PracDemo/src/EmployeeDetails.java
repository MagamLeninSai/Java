
public class EmployeeDetails {
	String name;
	int rollNo,work,sal;
	EmployeeDetails(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
	void addSal(int sal) {
		this.sal=sal;
		
		if(this.sal<500) {
			this.sal+=10;
		}
	}
	void addWork(int work) {
		this.work=work;
		
		if(this.work>6) {
			this.sal+=5;
		}
	}
	void getInfo(int work,int sal) {
		this.addSal(sal);
		this.addWork(work);
		System.out.println("Name :"+name+"\t Employee-Id :"+rollNo+"\t Employee-Work-per-day :"+work+"hr\t Employee Salary-per-day:$"+this.sal);
	}
	

	public static void main(String[] args) {
		EmployeeDetails e=new EmployeeDetails("Lenin",4);
		e.getInfo(6, 1000);
		EmployeeDetails e1=new EmployeeDetails("Charan",6);
		e1.getInfo(7, 100);
	}

}
