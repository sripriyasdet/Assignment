package xxxx.SDETTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class StringTest {
	
	ArrayList<String> list1;
	ArrayList<String> l;
	StringSearch s;
	
	@Test
	public void EmptyString()                       // Test case when empty string is passed as parameter
	{
		list1=new ArrayList<String>();
		list1.add(":0");
		s=new StringSearch();
		l=s.longLength("");
		assertTrue(list1.equals(l));
	}
	 
	@Test(expected=NullPointerException.class)
	public void NullString()								// Test case when null is passed as parameter
	{
		list1=new ArrayList<String>();
		list1.add(":0");
		StringSearch s=new StringSearch();
		ArrayList<String> l=s.longLength(null);
		assertTrue(list1.equals(l));
	}
	
	@Test
	public void givenExInput() 								// Test case for given example string passed as parameter
	{
		list1=new ArrayList<String>();
		list1.add("jumped:6");
		StringSearch s=new StringSearch();
		l = s.longLength("The quick fox jumped over the moon");
		assertEquals(list1,l);
	}
	
	@Test
	public void givingSChars()								// Test case when string of special characters passed as parameter
	{
		list1=new ArrayList<String>();
		list1.add("+++++///+++++gckjb;jl;ik:24");
		StringSearch s=new StringSearch();
		l = s.longLength("+++++///+++++gckjb;jl;ik  +++++++++++++++");
		assertEquals(list1,l);
	}
	
	@Test
	public void sameLengthWords()							// Test case when string containing same length words are passed as parameter
	{
		list1=new ArrayList<String>();
		list1.add("how:3");
		list1.add("are:3");
		list1.add("you:3");
		StringSearch s=new StringSearch();
		l = s.longLength("Hi how are you");
		assertEquals(list1,l);
	}
	
}
