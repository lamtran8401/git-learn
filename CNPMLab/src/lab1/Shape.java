package lab1;

public abstract class Shape implements IShape {
	protected double length;

	protected Shape(double len) {
		this.length = len;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

}
