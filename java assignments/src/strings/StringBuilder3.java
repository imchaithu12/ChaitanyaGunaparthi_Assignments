package strings;

public class StringBuilder3 {

	public static void main(String[] args) {
		StringBuilder rev=new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println(rev);
        
        //By using reverse method
        rev.reverse();
        System.out.println(rev);
	}

}
