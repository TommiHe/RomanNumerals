
public class RomanNumerals {
	
	public final int[] ARABIC = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	public final String[] ROMAN = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	public final String[] FAIL = {"VV","LL","DD"};
	
	public int convertToInteger(String romanNum) {
		if(romanNum.contains("VV") || romanNum.contains("LL") ||romanNum.contains("DD")) {
			System.out.println("You cant repeat V, L or D");
			return 0;
		}
        for (int i= 0; i < ROMAN.length; i++) { 
			 if(romanNum.startsWith(ROMAN[i])) {
                return ARABIC[i] + convertToInteger(romanNum.replaceFirst(ROMAN[i], "")); }
        	}	

return 0;
}
}