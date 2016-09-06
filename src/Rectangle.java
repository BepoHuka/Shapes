
public class Rectangle {

	private double width;
	private double length;
	private Point origin;

	private double square;
	private double perimetr;

	public Rectangle() {
		this.origin = new Point();
		this.width = 1.0;
		this.length = 2.0;
	}

	public Rectangle(Point p, double width, double length) throws Throwable {
		this.origin = p;
		this.setWidth(width);
		this.setLength(length);
	}

	public void setWidth(double width) throws Throwable {
		if (width <= 0)
			throw new Exception("Not positive width");

		this.width = width;
		this.square = width * length;
		this.perimetr = 2 * (width + length);
	}

	public void setLength(double length) throws Throwable {
		if (length <= 0)
			throw new Exception("Not positive length");

		this.length = length;
		this.square = width * length;
		this.perimetr = 2 * (width + length);
	}

	public double square() {
		return this.square;
	}

	public double perimetr() {
		return this.perimetr;
	}

	public void move(Point p) {
		this.origin = p;
	}

	public boolean isInside(Point p) {
		// It's more convenient to look through coordinates separately than
		// create one huge "IF". Isn't it?
		if ((p.getX() >= origin.getX()) && (p.getX() <= origin.getX() + length))
			if ((p.getY() >= origin.getY()) && (p.getY() <= origin.getY() + width))
				return true;

		return false;
	}

	public String toString() {
		// There is only Origin point and the rest three points calculated with
		// length and width there is no needs to convert to Points.
		String result;
		result = "Rectangle coordinates: ";
		/*
		 * result += "[" + origin.toString() + "] ";
		 */
		result += "[" + origin.getX() + ", " + origin.getY() + "] ";
		result += "[" + (origin.getX() + length) + ", " + origin.getY() + "] ";
		result += "[" + origin.getX() + ", " + (origin.getY() + width) + "] ";
		result += "[" + (origin.getX() + length) + ", " + (origin.getY() + width) + "]";
		return result;
	}

}
