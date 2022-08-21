package lab3;

import java.util.Scanner;

/* Create a method which accepts a String and replaces all the consonants in the 
String with the next alphabet. 
Note: Consonant refers to all alphabets excluding vowels*/
public class Exercise3 {
	//Replace next immediate consonants alphabetically
	static String alterString(char[] s) 
	{
		//stsrt traversing the string
		for(int i=0; i<s.length;i++) 
		{
			if(!isVowel(s[i])) {
				if(s[i] == 'z'){
					s[i] = 'a';
				}
				else {
					//replace the element with next immediate alphabet
					s[i] = (char)(s[i]+1);
				}
			}
		}
		return String.copyValueOf(s);
		
	}
	//Function to check if a character is vowel or not
	static boolean isVowel(char ch)
    {
        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o'
            && ch != 'u'&& ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O'
            && ch != 'U') {
            return false;
        }
        return true;
    }
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		System.out.println(alterString(str.toCharArray()));
		sc.close();
		}
}

