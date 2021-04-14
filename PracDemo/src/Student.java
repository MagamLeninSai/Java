
public class Student {
	int rollno;
	String name;
	String course;
	int marks;
	Student(int rollno,String name,String course,int marks){
		this.rollno=rollno;
		this.name=name;
		this.course=course;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}
	
}
