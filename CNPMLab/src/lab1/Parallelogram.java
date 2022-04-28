package lab1;

public class Parallelogram extends Shape {
	private double h;

	public Parallelogram(double a, double h) {
		super(a);
		this.h = h;
	}

	@Override
	public double getArea() {
		double a = length;
		return a * h;
	}

	public double getA() {
		return h;
	}

	public void setA(double a) {
		this.length = a;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

}
