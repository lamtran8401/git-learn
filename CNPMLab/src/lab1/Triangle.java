package lab1;

public class Triangle extends Shape {
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		super(a);
		this.b = b;
		this.c = c;
	}

	@Override
	public double getArea() {
		// TODO
		return 0;
	}

	public double getA() {
		return length;
	}

	public void setA(double a) {
		this.length = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
