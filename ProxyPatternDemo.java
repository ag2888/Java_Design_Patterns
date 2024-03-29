

// Step 1 Create an Interface

interface Image {
	void display();
}

// Step 2 create concrete classes implementing the Interface

class RealImage implements Image {
	

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	public void display() {
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}

}


class ProxyImage implements Image {
	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}


	public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}

		realImage.display();
	}

}

public class ProxyPatternDemo {
	public static void main (String [] args) {
		
		Image image = new ProxyImage("test_10mb.jpg");
		image.display();
		System.out.println("");
		image.display();


	}
}