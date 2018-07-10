package s_staticBlockinJava42;

/*

# A class can have multiple static blocks , which will execute in the same sequence in which 
they are written in the program. 

# Static will get executed only once per class , where as 
iib will get executed 5 times if we create 5 Objects

# Whenever we want to get some data to be executed only once / some data to be fixed as 
part of the pre-requisite, we can go for the static block

*/

public class Example2 {

	static {

		System.out.println("SB1");
	}

	static {
		System.out.println("SB2");
	}

	static {
		System.out.println("SB3");
	}

	public static void main(String[] args) {

	}
}
