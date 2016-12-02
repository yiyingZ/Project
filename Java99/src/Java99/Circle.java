package Java99;


public class Circle {
	private double Radius;
	private static double PI = 3.14;
	
	public Circle(double r){
		Radius = r;
	}
	public Circle(){
		Radius = 0;
	}
	public double getArea(){
		return PI*Radius*Radius;
	}
	public double getPerimeter(){
		return PI*2*Radius;
	}
	public void show(){
		System.out.println("Radius: "+Radius+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter());
	}
}
