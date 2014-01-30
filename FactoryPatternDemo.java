
// Step 1 Create an Interface 

// Shape.java

interface Shape { 

	void draw(); 

}


// Step 2 Create Concrete classes implementating the same interface 

class Rectangle implements Shape { 


	public void draw() { 
		System.out.println("Inside Rectangle::draw() method");
	}



}


class Circle implements Shape { 


	public void draw() { 
		System.out.println("Inside Circle::draw() method");
	}



}


class Square implements Shape  {
	public void draw() { 
		System.out.println("Inside Square::draw() method"); 
	}
}

class ShapeFactory { 

	public Shape getShape(String shapeType) { 

		if(shapeType == null) {
			return null; 
		}

		if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();


		if(shapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		
		if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		

		return null; 
	}

}


public class FactoryPatternDemo {

	public static void main ( String [] args) { 

			ShapeFactory shapeFactory = new ShapeFactory();


			// get an obj of Circle and call its draw Method 
			Shape obj1 = shapeFactory.getShape("CIRCLE"); 

			obj1.draw();

			Shape obj2 = shapeFactory.getShape("Rectangle");

			Shape obj3 = shapeFactory.getShape("Square");








	}


}
