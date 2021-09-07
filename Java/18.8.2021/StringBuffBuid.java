/*write an example demonstrating all constructors from 
 * String, StringBuffer and StringBuilder.*
 */
package Day5;

public class StringBuffBuid {

	public static void main(String[] args) { 
	
//String Constructor
		System.out.println("1. "+ new String() );//Empty String
		String a = new String("Maha");
			System.out.println("2. "+a);					//New string
		byte[] b = {12,23,34,45,56};
			System.out.println("3. "+new String(b));		//byte array to string
			System.out.println("4. "+new String(b,1,3));	//substring of byte array
		char[] c = {'M','a','h','a'};						
			System.out.println("6. "+new String(c));		//char array to string
			System.out.println("7. "+new String(c,1,3));	//substring or char array
		int[] d = {0110,0101,0100,0110,1111};
		int[] e = {97,33,99,100,101,102};
			System.out.println("8. "+new String(d,1,3));	//bin array to substring
			System.out.println("9. "+new String(e,1,4));	//Codepoint array to substring
		StringBuilder sbd = new StringBuilder("Maha");
			System.out.println("10. "+sbd.getClass());		//StringBuilder
		String bd = new String(sbd);
			System.out.println("11. "+bd.getClass());		//StringBuilder to String
		StringBuffer sbf = new StringBuffer("Lakshmi");
			System.out.println("12. "+sbf.getClass());		//StringBuffer
		String abf = new String(sbf);
			System.out.println("11. "+abf.getClass());		//StringBuffer to String
		
//StringBuffer Constructor
		StringBuffer a1 = new StringBuffer();
			System.out.println("12. "+a1);				//Empty stringbuffer with memory for 16 characters	
			System.out.println("13. "+a1.capacity());	//Capacity of Empty stringbuffer
			System.out.println("14. "+a1.append("MahaPapa"));	
		CharSequence cs = "asdrrcfr";
			System.out.println("15. "+cs);
			System.out.println("16. "+cs.getClass()); 
		StringBuffer a2 = new StringBuffer(cs);
			System.out.println("17. "+a2);
			System.out.println("18. "+a2.getClass());	//charSequence to string buffer
		StringBuffer a3 = new StringBuffer(a);
			System.out.println("19. "+a.getClass());
			System.out.println("20. "+a2.getClass());
	
//StringBuilder Constructor
			StringBuilder b1 = new StringBuilder();
			System.out.println("21. "+b1);				//Empty stringbuilder with memory for 16 characters	
			System.out.println("22. "+b1.capacity());	//Capacity of Empty stringbuilder
			System.out.println("23. "+b1.append("MahaPapa"));	
		CharSequence cs1 = "asdrrcfr";
			System.out.println("24. "+cs1);
			System.out.println("25. "+cs1.getClass()); 
		StringBuilder b2 = new StringBuilder(cs1);
			System.out.println("26. "+b2);
			System.out.println("27. "+b2.getClass());	//charSequence to string builder
		StringBuilder b3 = new StringBuilder(a);
			System.out.println("28. "+a.getClass());
			System.out.println("29. "+b2.getClass());
	}
	
}