package hotel_manage;



class Animal {

	  // field and method of the parent class
	  String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}

	// inherit from Animal
	class Dog extends Animal {

	  // new method in subclass
	  public void display() {
	    System.out.println("My name is " + name);
	  }
	}

	class lab7 {
	  public static void main(String[] args) {

	    Dog labrador = new Dog();

	    labrador.name = "Rohu";
	    labrador.display();
	    labrador.eat();

	  }
	}

