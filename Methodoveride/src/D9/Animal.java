package D9;

class Animal {

	  // method in the superclass
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}

	// Dog inherits Animal
	class Dog extends Animal {

	  // overriding the eat() method
	  @Override
	  public void eat() {
	    System.out.println("I eat dog food");
	  }

	  // new method in subclass
	  public void cat() {
	    System.out.println("Hi I am cat");
	  }
	}

	class Main {
	  public static void main(String[] args) {

	    // create an object of the subclass
	    Dog b = new Dog();

	    // call the eat() method
	    b.eat();
	    b.cat();
	  }
	}