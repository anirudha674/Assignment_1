
public class Question_4 {
	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40,greatest=0;
		greatest=a>b?a:b;
		greatest=c>greatest?c:greatest;
		greatest=d>greatest?d:greatest;
		System.out.println(greatest);
		
	}

}
