
/**
 * FiguresTest.java
 *
 *
 *
 * @author Clint 
 * @version 1.0
 */


public class FiguresTest {

	public static void main(String[] args) {
	  
		Circle c1 = new Circle(50); 
		boolean done = true;
		//test 1
		if(c1.getRadius() == 50){
			System.out.println("Test 1 Passed");
		}
		else{
			System.out.println("Test 1 Failed...check Constructor in Circle");
			done = false;
		}
	  
		c1.updateArea();
		if(c1.getArea() == Math.PI * 50 * 50){
			System.out.println("Test 2 Passed");
		}
		else{
			System.out.println("Test 2 Failed... check updateArea method in Circle");
			done = false;
		}
	  
	  
		c1.updatePerimeter();
		if(c1.getPerimeter() == Math.PI * 100){
			System.out.println("Test 3 Passed");
		}
		else{
			System.out.println("Test 3 Failed... check updatePerimeter method in Circle");
			done = false;
		}
	  
		System.out.println("Circle of Radius="+c1.getRadius() + "Area="+ c1.getArea() );
		System.out.println("Circle of Radius="+c1.getRadius() + "Perim="+ c1.getPerimeter() );

		System.out.println();

		// test the rectangle
		Rectangle r1 = new Rectangle (10,15 );
		if(r1.getLength() == 10 &&  r1.getWidth() == 15){
			System.out.println("Test 4 passed");
		}
		else{
			System.out.println("Test 4 failed... check constructor in Rectangle");
			done = false;
		}
	  
		r1.updateArea();
		if(r1.getArea() == 150 ){
			System.out.println("Test 5 passed");
		}
		else{
			System.out.println("Test 5 failed... check updateArea in Rectangle");
			done = false;
		}
	  
		r1.updatePerimeter();
		if(r1.getPerimeter() == 50 ){
			System.out.println("Test 6 passed");
		}
		else{
			System.out.println("Test 6 failed... check updatePerimeter in Rectangle");
			done = false;
		}

		System.out.println("Rectangle of Length = "+r1.getLength()+ "  width =" + r1.getWidth() + 
						   "Area=" + r1.getArea() );
		
		System.out.println("Rectangle of Length ="+ r1.getLength() + " width= " + r1.getWidth() + "Perim= " + r1.getPerimeter() );

		System.out.println("\n\n*****************************************************");

		if(done == true){
			System.out.println("Your program Passed all tests! Good Job!!");
		}
		else{
			System.out.println("Your program failed some tests!");
		}
		System.out.println("*****************************************************\n");
	}

} // FiguresTest
