package Java99;

public class TestCylinder {
	public static void main(String args[]){
		Circle c = new Circle(2.2);
		c.show();
		System.out.println();
		Cylinder cy = new Cylinder(2.222,22);
		cy.show();
		cy.showVolume();
	}
}
