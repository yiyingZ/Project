package shape;

public class Rectangle extends Shape {
	private double rLength;
	private double rWidth;
	
	public Rectangle(String type,double length,double width){
		super(type);
		// TODO Auto-generated constructor stub
		rLength = length;
		rWidth = width;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		sArea = rLength * rWidth;
	}

}
