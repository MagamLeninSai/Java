import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No: ");
		int n=sc.nextInt();
		int k=n-1,h=n-2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<1+2*i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
			k--;
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<1+2*h;j++) {
				System.out.print("* ");
			}
			System.out.println("");
			h--;
		}
		sc.close();
	}

}
