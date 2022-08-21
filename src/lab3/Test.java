package lab3;
	/*
	 * String - non primitive data type
	 *  represents sequence characters
	 *  pkg - java.lang.String
	 *  immutable
	 *  
	 *  Ways to define String
	 *    1. String literal value
	 *    2. using new keyword
	 *    
	 *  String storage location
	 *    Heap - new keyword
	 *    String Constant pool - string literal value
	 *    
	 *  v1.6 - SCP is outside of heap area
	 *  v1.7 - SCP is part of heap area
	 *  
	 *  Methods to access/manipulate string
	 *  
	 *  
	 */

	public class Test {
		static String str6;
		public static void main(String[] args) {
			
			// String literals
			String str1 = "Hello";
			String str2 = "Hello";
			String str13 = str1;
			
			
			
			System.out.println(str1==str2);//true
			System.out.println(str1==str13);//true
			
			System.out.println(str1+" "+str2);
			
			str1.concat(" World!");
			
			System.out.println(str1.hashCode());
			System.out.println(str2.hashCode());
			
			System.out.println(str1);// Hello 
			System.out.println(str2);// Hello
			
			str1 = str1.concat(" World!");
			System.out.println(str1);// Hello World!
			System.out.println(str2);// Hello
			
			// hashcode
			System.out.println(str1.hashCode());
			System.out.println(str2.hashCode());
			
			// create string obj using new keyword
			String str3 = new String(); 
			String str4 = new String("Hello World!");
			String str5 = new String(new char[] {'h', 'i'});
			String str7 = new String("Hello World!");
			String str8 = str4;
			
		
			System.out.println(str3);
			System.out.println(str4);
			System.out.println(str5);
			System.out.println(str6);// null
			
			str5 =null;
			System.out.println("$$$$$"+str5);
			
			// equals - content comparison& '==' reference comparison
			
			System.out.println(str4==str8); // true
			System.out.println(str4==str7); // false
			
			System.out.println(str4.equals(str7)); // true
			
			System.out.println(str1.charAt(0));//H
			System.out.println("Hello".compareTo("Hello")); //0
			System.out.println("hello".compareTo("Hello"));//1
			System.out.println("Hello".compareTo("hello"));//-1
			System.out.println("Hello".compareToIgnoreCase("hello")); //0
			System.out.println("Hello".contains("ell"));// true
			System.out.println("Hello".endsWith("o"));//true
			System.out.println("HELLO".toLowerCase());//hello
			System.out.println("Hello".indexOf('l')); //2
			String[] strArr= "Hello World".split(" ");
			System.out.println(strArr[0]+" "+strArr[1]);
			System.out.println(String.join("-", "Hello", "World!"));
			
		}
}
