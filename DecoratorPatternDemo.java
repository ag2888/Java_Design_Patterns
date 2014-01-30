
interface Shape {
	public void draw();
}


class Rectangle implements Shape{

	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}



class Circle implements Shape{

	public void draw() {
		System.out.println("Shape: Circle");
	}
}



abstract class ShapeDecorator implements Shape {

		protected Shape decoratedShape;

		public ShapeDecorator(Shape decoratedShape) {
			this.decoratedShape = decoratedShape;
		}


}


class RedShapeDecorator extends ShapeDecorator {
	
	public RedShapeDecorator(Shape decoratedShape) {

			super(decoratedShape);
	}

	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}


	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}



}


public class DecoratorPatternDemo {
	public static void main (String [] args) {
		

		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle()); 

		Shape redRectangle = new RedShapeDecorator(new Rectangle());


		System.out.println("Circle with normal border");

		circle.draw(); 

		System.out.println("\nCircle of Red Border"); 

		redCircle.draw();

		System.out.println("\n Rectangle of red Border"); 



	}
}