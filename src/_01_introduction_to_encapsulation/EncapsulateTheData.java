package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	protected static int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private static float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	protected static String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private static Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	static int getItemsReceived() {
		return itemsReceived;
	}
	
	static float getDegreesTurned() {
		return degreesTurned;
	}
	
	static String getNomenclature() {
		return nomenclature;
	}
	
	static Object getMemberObj() {
		return memberObj;
	}
	
	static void setItemsReceived(int i) {
		if (i < 0) {
			itemsReceived = 0;
		} else {
			itemsReceived = i;
		}
	}
	
	static void setDegreesTurned(float f) {
		if (0.0 < f  && f < 360.0) {
			degreesTurned = f;
		}
	}
	
	static void setNomenclature(String s) {
		if (s.equals("")) {
			nomenclature = " ";
		} else {
			nomenclature = s;
		}
	}
	
	static void setMemberObj(Object o) {
		System.out.println(o.getClass().toString());
		if (o.getClass().toString().equals("class java.lang.String")) {
			memberObj = new Object();
		} else {
			memberObj = o;
		}
	}
	
	@Test
	static
	void testGetters1() {
		assertEquals(1, getItemsReceived());
		assertEquals(270.0f, getDegreesTurned());
		assertEquals("Hi", getNomenclature());
		assertEquals(2, getMemberObj());
	}
	
	static void testGetters2() {
		assertEquals(0, getItemsReceived());
		assertEquals(270.0f, getDegreesTurned());
		assertEquals(" ", getNomenclature());
		assertEquals(new Object(), getMemberObj()); //this is false because the objects are not exactly the same but it does make a new object
	}
	
	public static void main(String[] args) {
		setItemsReceived(1);
		setDegreesTurned(270.0f);
		setNomenclature("Hi");
		setMemberObj(2);
		testGetters1();
		setItemsReceived(-3);
		setDegreesTurned(361.0f);
		setNomenclature("");
		setMemberObj("aghfgsd");
		testGetters2();
	}
}
