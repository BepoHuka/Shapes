/*
 * 
 * 
 */

public class ThirdPractice {

	private static final double PRECISION = 0.001;

	public static void main(String[] args) throws Throwable {

		Point myPoint = new Point(3, 4);
		Circle myCircle = new Circle(myPoint, 5);

		System.out.println("Tests for Circle: " + myCircle.toString());

		// Test for Circle isInside method
		System.out.println("Method: isInside. Input value: Point(1, 1). Expected result: point inside of Circle");
		System.out.print("Method: isInside - ");
		test(myCircle.isInside(new Point(1, 1)), true);
		System.out.println("Method: isInside. Input value: Point(9, 9). Expected result: point outside of Circle");
		System.out.print("Method: isInside - ");
		test(myCircle.isInside(new Point(9, 9)), false);

		// Test for Circle square method
		System.out.println("Method: square. Expected result: 78.53981633974483");
		System.out.print("Method: square - ");
		test(myCircle.square(), 78.53981633974483);

		// Test for Circle circuit method
		System.out.println("Method: circuit. Expected result: 31.41592653589793");
		System.out.print("Method: circuit - ");
		test(myCircle.circuit(), 31.41592653589793);

		// Test for Circle boundingBox method
		System.out.println(
				"Method: boundingBox. Expected result: Rectangle with coordinates: [-2.0, -1.0] [8.0, -1.0] [-2.0, 9.0] [8.0, 9.0]");
		System.out.print("Method: boundingBox - ");
		test(myCircle.boundingBox().toString(),
				"Rectangle coordinates: [-2.0, -1.0] [8.0, -1.0] [-2.0, 9.0] [8.0, 9.0]");

		// Test for Circle move method
		System.out.println(
				"Method: move. Moving Circle to Point(1, 1). Expected result: Circle origin: [1, 1], radius: 5");
		System.out.print("Method: move - ");
		myCircle.move(new Point(1, 1));
		test(myCircle.toString(), "Circle origin: [1, 1], radius: 5");

		System.out.println("---------------------------------------------------------");

		Rectangle myRectangle = new Rectangle(new Point(1, 2), 3, 5);
		System.out.println("Tests for Rectangle: " + myRectangle.toString());

		// Test for Rectangle isInside method
		System.out.println("Method: isInside. Input value: Point(3, 3). Expected result: point inside of Rectangle");
		System.out.print("Method: isInside - ");
		test(myRectangle.isInside(new Point(3, 3)), true);
		System.out.println("Method: isInside. Input value: Point(9, 9). Expected result: point outside of Rectangle");
		System.out.print("Method: isInside - ");
		test(myRectangle.isInside(new Point(9, 9)), false);

		// Test for Rectangle square method
		System.out.println("Method: square. Expected result: 15.0");
		System.out.print("Method: square - ");
		test(myRectangle.square(), 15.0);

		// Test for Rectangle circuit method
		System.out.println("Method: circuit. Expected result: 16.0");
		System.out.print("Method: circuit - ");
		test(myRectangle.perimetr(), 16.0);

		// Test for Rectangle move method
		System.out.println(
				"Method: move. Moving Rectangle to Point(3, 6). Expected result: Rectangle coordinates: [3.0, 6.0] [8.0, 6.0] [3.0, 9.0] [8.0, 9.0]");
		System.out.print("Method: move - ");
		myRectangle.move(new Point(3, 6));
		test(myRectangle.toString(), "Rectangle coordinates: [3.0, 6.0] [8.0, 6.0] [3.0, 9.0] [8.0, 9.0]");
	}

	public static void test(String testValue, String expectedResult) {
		if (testValue.equals(expectedResult)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
	}

	public static void test(Boolean testValue, Boolean expectedResult) {
		if (testValue.equals(expectedResult)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
	}

	public static void test(double testValue, double expectedResult) {

		if (Math.abs(testValue - expectedResult) < PRECISION) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
	}

}
