package a_operators8to10;

public class Example_Debug {
	
	/**
	 * First thing to do while debugging is to -  toggle a break point
	 * breakpoint is the place where the execution needs to stop while running a program
	 * double click on the left margin/ right click and choose toggle breakpoint, to toggle a breakpoint
	 * 
	 *now,  right click the code > debug as > Java Application
	 * 
	 * confirm on switching the perspective to debug ( from java) if eclipse prompts
	 * 
	 * Press F5 - to step into - i.e. to go inside a method for debugging
	 * 
	 * F6 - for step over - to execute the method and go to next line to debug
	 * 
	 * F8-  to come out of the debug mode & resume the program execution as normal
	 * 
	 * Ctrl + F2 - to stop the debugging
	 * 
	 * Note: You can also choose these options from Run menu during debugging. 
	 */
	
	public static void main(String[] args) {
		String[] names = {"Krishna", "Vamsi", "Dadi"};
		printAllMarks(names,0);
	}

	private static void printAllMarks(String[] names, int count) {
		for (String name: names) {
			System.out.println(name);
		}
	}
}
