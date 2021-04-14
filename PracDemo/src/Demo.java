
public class Demo {
 public static void main(String[] args) {
	int req[]= {2,-3,8,-6,-7,18,1};
	int answer=0;
	
	
	
	for(int i=0;i<req.length;i=i+2) {
		answer=req[i]+answer;
	}
	
	
	
	System.out.println(answer);
}
}

