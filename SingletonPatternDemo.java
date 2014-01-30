
// Create a Singleton class 


class SingleObject { 

	// create an object of singleObject
	private static SingleObject instance = new SingleObject();

	private SingleObject() {
		
	}

	// get the only object available
	public static SingleObject getInstance() { 
		return instance; 

	}

	public void showMessage() { 
		System.out.println("Hello World!");

	}


}


public class SingletonPatternDemo { 

	public static void main(String [] args) { 

			SingleObject object = SingleObject.getInstance(); 

			object.showMessage(); 

	}


}