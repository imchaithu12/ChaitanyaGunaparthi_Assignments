package strings;

public class Problem3 {

	public static void main(String[] args) {
		
		String One="Java String pool refers to collection of Strings which are stored in heap memory";
		//Above sentence converted to LowerCase
		String Onelower=One.toLowerCase();
        System.out.println(One.toLowerCase());
        //sentence converted to UpperCase
        String OneUpper=One.toUpperCase();
        System.out.println(One.toUpperCase());
        //replace a to $
        String Replace=One.replace('a', '$');
        System.out.println(One.replace('a','$'));
        //to search a word collection
        System.out.println(One.contains("collection"));
        //matches original
        String strOriginal=One;
        String str="java string pool refers to collection of strings which are stored in heap memory";
        int intIndex = strOriginal.indexOf(str);
        
        if(intIndex==1) {
        	System.out.println("Original Sentence Mismatched");
        }
        else {
        	System.out.println("Matched with original data at index: "+ intIndex);
        }
       
	}

}
