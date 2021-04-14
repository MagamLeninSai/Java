import java.util.ArrayList;

public class StudentSort {
	public static void main(String args[]) {
	ArrayList<Student> al = new ArrayList<Student>();
	ArrayList<Student> al1 = new ArrayList<Student>();
	Student s=new Student(1,"Lenin","java",60);
	al.add(s);
	Student s1=new Student(2,"Sai","C",70);
	al.add(s1);
	Student s2=new Student(3,"charan","python",50);
	al.add(s2);
	System.out.println("Before Sorting :\n"+al+"\n");
	int j=al.size();
	int arr[]=new int[j];
	int i=0,swap;
	for(Student stu1:al) {
			arr[i]=stu1.marks;
			i++;
	}
	for(int c=0;c<j-1;c++) {
		for(int d=0;d<j-c-1;d++) {
			if(arr[d]>arr[d+1]) {
				swap=arr[d];
				arr[d]=arr[d+1];
				arr[d+1]=swap;
			}
		}
	}
	for(int h=0;h<j;h++) {
		for(Student stu:al) {
			if(arr[h] == stu.marks) {
				al1.add(stu);
			}
		}
	}
	System.out.println("Objects After Sorting(Based on Marks) :\n"+al1);
}
}