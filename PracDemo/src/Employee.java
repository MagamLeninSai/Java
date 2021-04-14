
public class Employee {
	String name;
	int yoj;
	String address;
	Employee(String name,int yoj,String address){
		this.name=name;
		this.yoj=yoj;
		this.address=address;
	}
	void display() {
		System.out.println(name+"\t"+yoj+"\t\t"+address);
	}
	public static void main(String[] args) {
		Employee e=new Employee("Robert",1994,"64C- WallsStreet");
		Employee e1=new Employee("Sam",2000,"68D- WallsStreet");
		Employee e2=new Employee("John",1999,"26B- WallsStreet");
		System.out.println("Name\tYear-of-joining\tAddress\n");
		e.display();
		e1.display();
		e2.display();
		
	}

}
 
