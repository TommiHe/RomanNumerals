import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void convertinIto1() {
		RomanNumerals roman = new RomanNumerals();
		String romanNum ="I";
		
		int test = roman.convertToInteger(romanNum);
		//System.out.println(test);
		assertEquals(1, test);
	}
	
	@Test
	public void convertinIIIto3() {
		RomanNumerals roman = new RomanNumerals();
		String romanNum ="III";
		
		int test = roman.convertToInteger(romanNum);
		//System.out.println(test);
		assertEquals(3, test);
	}
	
	@Test
	public void convertinVto5() {
		RomanNumerals roman = new RomanNumerals();
		String romanNum ="V";
		
		int test = roman.convertToInteger(romanNum);
		//System.out.println(test);
		assertEquals(5, test);
	}
	
	@Test
	public void convertinMDto1500() {
		RomanNumerals roman = new RomanNumerals();
		String romanNum ="MD";
		
		int test = roman.convertToInteger(romanNum);
		//System.out.println(test);
		assertEquals(1500, test);
	}
	
	@Test
	public void convertinIVto4() {
		RomanNumerals roman = new RomanNumerals();
		String romanNum ="IV";
		
		int test = roman.convertToInteger(romanNum);
		//System.out.println(test);
		assertEquals(4, test);
	}
	
	@Test
	public void convertinMCMLXXXIVto1984() {
		RomanNumerals roman = new RomanNumerals();
		String romanNum ="MCMLXXXIV";
		
		int test = roman.convertToInteger(romanNum);
		//System.out.println(test);
		assertEquals(1984, test);
	}
	
	@Test
	public void convertinIVVtofail() {
		RomanNumerals roman = new RomanNumerals();
		String romanNum ="IVV";
		
		int test = roman.convertToInteger(romanNum);
		//System.out.println(test);
		assertEquals(0, test);
	}
	
	@Test
	public void cantSubtractVLD() {
		RomanNumerals roman = new RomanNumerals();
		String romanNum ="VX";
		
		int test = roman.convertToInteger(romanNum);
		//System.out.println(test);
		assertEquals(0, test);
	}
	
	@Test
	public void convertMMMCCXLIIIto3243() {
		RomanNumerals roman = new RomanNumerals();
		String romanNum ="MMMCCXLIII";
		
		int test = roman.convertToInteger(romanNum);
		//System.out.println(test);
		assertEquals(3243, test);
	}
	
	@Test
	public void cantRepeatIXCMmoreThan3Times() {
		RomanNumerals roman = new RomanNumerals();
		String romanNum ="IIII";
		
		int test = roman.convertToInteger(romanNum);
		//System.out.println(test);
		assertEquals(0, test);
	}
	
	@Test
	public void canSubstractOnlyOnes() {
		RomanNumerals roman = new RomanNumerals();
		String romanNum ="DIIX";
		
		int test = roman.convertToInteger(romanNum);
		//System.out.println(test);
		assertEquals(0, test);
	}
	
	@Test
	public void cantRepeatVLD() {
		RomanNumerals roman = new RomanNumerals();
		String romanNum ="VV";
		
		int test = roman.convertToInteger(romanNum);
		//System.out.println(test);
		assertEquals(0, test);
	}
}
