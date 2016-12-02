package Java99;
import java.util.Scanner;

public class Strinput {
	public static void main(String args[]){
		String str1,str2;
		int i1,i2;
		float f1,f2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your first String: ");
		str1 = keyboard.nextLine();
		System.out.println("Enter your second String: ");
		str2 = keyboard.nextLine();
		
		i1 = Integer.parseInt(str1);
		i2 = Integer.parseInt(str2);
		f1 = Float.parseFloat(str1);
		f2 = Float.parseFloat(str2);
		
		String integerSum=strAdd(i1,i2);
		String floatSum=strAdd(f1,f2);
		String strSum = strAdd(str1,str2);
		
	
		System.out.println("Integer Result: "+integerSum);
		System.out.println("Float Result: "+floatSum);
		System.out.println("String Result: "+strSum);
	}
	 
	static String strAdd(int int1,int int2){
		return String.valueOf(int1+int2);
		}
	static String strAdd(float float1, float float2){
		return String.valueOf(float1+float2);
	}
	static String strAdd(String s1,String s2){
		return String.valueOf(s1+s2);
	}
}
