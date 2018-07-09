package p_encapsulation41;

/*
# Encapsulation is a process of binding code and data together into a
single unit


# We can create a fully encapsulated class in java by making all the data
members of the class as private.


# And we can access them by getter and setter method by making getter and setter methods
as public.


# Actually private members can not be accessed outside the class & private members can not 
participate in inheritance. But, we can access them by making getter and setter as public


# Advantage of Encapsulation in java
• By providing only setter or getter method, you can make the class read-only
or write-only.
• We can provide data security.


*/


public class Example1 {

	private int age;
	
	// how to create getter and setter :
	// right click -> Source -> Generate Getters and Setters ...


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
