package Java99;

public class leapYear001 {
	public static void main(String args[]){
		int year = 2010;
		if(args.length!=0)
			year = Integer.parseInt(args[0]);
		if((year%4 == 0 && year%100 != 0)||(year%400 == 0))
			System.out.println("This year is a leap year.");
		else
			System.out.print("This year is not leap year.");
		
	}
}
