import java.util.*;
public class Complex {
	double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    void add(Complex n1, Complex n2)
    {
    	Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;
        System.out.println("Sum = "+(float)temp.real+" + "+temp.imag+"i");
    }
    void difference(Complex n1, Complex n2)
    {
    	Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real - n2.real;
        temp.imag = n1.imag - n2.imag;
        System.out.println("Difference = "+temp.real+" +  "+temp.imag+"i");
    	
    }
    void product(Complex n1, Complex n2)
    {
    	Complex temp = new Complex(0.0, 0.0);
    	temp.real =(n1.real * n2.real) - (n1.imag * n2.imag);
    	temp.imag=(n1.real * n2.imag) - (n1.imag * n2.real);
    	 System.out.println("Product = "+temp.real+" + "+temp.imag+"i");
    	
    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter real and imag part of 1st number");
		double real1= sc.nextDouble();
		double imag1= sc.nextDouble();
		Complex n1=new Complex(real1,imag1);
		System.out.println("Enter real and imag part of 2nd number");
		double real2= sc.nextDouble();
		double imag2= sc.nextDouble();
		Complex n2=new Complex(real2,imag2);
		n1.add(n1,n2);
		n1.difference(n1, n2);
		n1.product(n1, n2);
		
		

	}

}