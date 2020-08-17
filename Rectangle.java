import java.util.*;
class Rectangle{
	int height;
	int width;
	void display()
	{
		System.out.println(width+" "+height);
	}
}
class RectangleArea extends Rectangle{
	void read_input(int x,int y)
	{
		height=x;
		width=y;
		
	}
	void display()
	{
		super.display();
		System.out.println(width*height);
	}
}

public class Question2Assignment1 {

	public static void main(String[] args) {
		RectangleArea obj=new RectangleArea();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter width");
		int w=sc.nextInt();
		System.out.println("Enter height");
		int h=sc.nextInt();
		obj.read_input(h, w);
		obj.display();
	}

}