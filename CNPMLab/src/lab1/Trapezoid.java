package lab1;

public class Trapezoid extends Shape {
	private double b;
	private double h;

	public Trapezoid(double a, double b, double h) {
		super(a);
		this.b = b;
		this.h = h;
	}

	@Override
	public double getArea() {
		double a = length;
		return (a + b) * h / 2;
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

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

}
