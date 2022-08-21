package lab3;
import java.io.*;
//import java.util.Scanner;

public class Exercise5 {
	/*Write a Java program that displays the number of characters, lines and words in a 
	text file?*/
	
	public static void main(String[] args) throws IOException
	
	{
		File file = new File(" ");
		FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
  
        String line;
        int wordCount = 0;
        int characterCount = 0;
        int paraCount = 0;
        int whiteSpaceCount = 0;
        int sentenceCount = 0;
        
        while((line = bufferedReader.readLine())!= null )
        {
        	if(line.equals(""))
        	{
        		paraCount +=1;
        	}
        	else 
        	{
        		characterCount += line.length();
        		String words[] = line.split("\\s+");
                wordCount += words.length;
                whiteSpaceCount += wordCount - 1;
                String sentence[] = line.split("[!?.:]+");
                sentenceCount += sentence.length;
        	}
        }
		if(sentenceCount>=1)
		{
			paraCount++;
		}
		
		String words[] = line.split("\\s+");
        wordCount += words.length;
        whiteSpaceCount += wordCount - 1;
        String sentence[] = line.split("[!?.:]+");
        sentenceCount += sentence.length;
        bufferedReader.close();
		}
}
