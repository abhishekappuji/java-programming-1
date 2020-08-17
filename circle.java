public class Circle {
	private double radius=1.0;
	private String color="red";
	Circle(){
		
	}
	Circle(double r){
		
	}
	double getRadius() {
		return radius;
	}
	double getArea() {
		return (3.14*radius*radius);
	}
	
	public static void main(String[] args) {
		Circle obj = new Circle();
		System.out.println(obj.getRadius());
		System.out.println(obj.getArea());
	}
}