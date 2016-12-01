package shape;

public abstract class Shape {
	private static final double PI = 3.1415926;
	protected double sArea;
	private String sType;
	
	public Shape(String type){ sType = type;}
	public abstract void calculateArea();
	public double getArea() { return sArea; }
	public String toString(){
		return "Shape Type: "+sType ;
	}
}
