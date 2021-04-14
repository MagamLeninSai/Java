import java.util.Scanner;

public class Area {
	double length,breadth;
	Area(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	double returnArea() {
		return length*breadth;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle :");
		double l=s.nextDouble();
		System.out.println("Enter Breadth of Rectangle :");
		double b=s.nextDouble();
		Area a=new Area(l,b);
		System.out.println("The Area of Rectangle : "+a.returnArea());
		s.close();
	}
}
