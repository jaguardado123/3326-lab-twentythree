# Lab Assignment 23

In this lab you will practice working with interfaces.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

Now let's begin!

### Interfaces

**Interfaces** is an important concept of OOP, it's the process of completely making a class and all its members **abstract**. In an **abstract class**, only the class itself is abstract. If a programmer wants members to be abstract, it must be specified. An **interface class** makes all the members abstract by default.

Interface classes follow the same rules as abstract class. An interface class cannot be used to make objects.

**In an Interface Class:**
- Don't need the `class` keyword.
- Can't be used to make objects.
- **Methods** by default are `public` and `abstract` and **must be overriden**.
- **Attributes** by default are `public`, `static`, and `final` (constant).
- Constructors are **NOT ALLOWED**.

**For Example:**
```java
// Interfaces don't require class keyword.
interface Mammal {
	// Since by default is final, must be initialized.
	String blood = "warm blooded";
	// By default methods are public and abstract.
	void about();
}

class Main {
	
	public static void main(String[]args) {
		// ****** ERROR *********
		Mammal dog = new Mammal(); // Cannot instanciate Interface classes
	}
}
```

What's the benefit of using interface classes over abstract classes?

Java allows you to inherit multiple interface classes at once using the `implements` keyword.

**For Example:**
```java
interface Mammal {
	// Since by default is final, must be initialized.
	String blood = "warm blooded";
	// By default methods are public and abstract.
	void about();
}

interface Animal {
	// Since by default is final, must be initialized.
	String type = "heterotroph";
	// By default methods are public and abstract.
	void diet();
}

class Dog implements Mammal, Animal {
	// Inherits all Mammal and Animal members.
	// Must overrid methods.
	@Override
	public void about() { 
		System.out.print("Maintains high body temp"); 
	}

	@Override
	public void diet() { 
		System.out.print("Can't make its own food"); 
	}
}

class Main {
	
	public static void main(String[]args) {

		Dog rover = new Dog(); // We can instantiate the sub-class
		rover.about();
		rover.diet();
		System.out.print( Dog.type ); // Attributes still static.
	}
}
```

To learn more about interfaces in Java visit: https://www.w3schools.com/java/java_interface.asp and https://www.geeksforgeeks.org/interfaces-in-java/

## Your Assignment

### Animal Classification

For this assignment you are provided with 4 classes: `Vehicle`, `Car`, `Engine`, and `Truck`. 

`Vehicle`, `Car`, and `Engine` are **abstract classes**.

The `Truck` class needs to inherit the `Vehicle`, `Car`, and `Engine` classes. Unfortunately, Java only lets us inherit one class at a time, so a Russian Nesting Doll scenario is set up to achieve this...

Refactor the `Vehicle`, `Car`, and `Engine` classes so that `Truck` can inherit them all at once.

After refactoring your code, run the test below to test your code.

**Test Your Code:**

```
./build.sh
./test.sh
```

## Submit your assignment

To submit your lab assignment click on the **Source Control** icon (3 circles with 2 lines) on your leftside navbar. Next, click on the **+** symbol next to **Changes** to stage your changes. Lastly, add a commit message (ex: "First commit") and click **Commit** then **Sync Changes**. And you're done!
