package interfaceInJava35;

/*
Multiple classes can implement same interface and write their own method implementations as per their need

this is the benefit of interface

*/

public class AXIS implements RateOfInterest {

	@Override
	public void rateofInterest() {
		System.out.println("Axis gives 9%");
		
	}

}
