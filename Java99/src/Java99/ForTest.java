package Java99;

public class ForTest {
	public static void main(String arg[]){
		int answer = 0;
		for(int i=1; i<=10 ; i++){
			answer += factorial(i);
		}
		System.out.println("1!+....+10!= "+answer);
	}
	public static int factorial(int n){
		if(n == 1) return 1;
		return n*factorial(n-1);
	}
}
