package Java99;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder(double h,double r){
		super(r);
		height=h;	
	}
	public double getVolume(){
		return super.getArea()*height;
	}
	public void showVolume(){
		System.out.println("Volume: "+getVolume());
	}
}
