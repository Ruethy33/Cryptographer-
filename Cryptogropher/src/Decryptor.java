import java.util.Scanner;
import java.util.ArrayList;


public class Decryptor
	{
	static String sentence;
	static String spaceSpot;
	
	public static void decryptor(String sentence, ArrayList <Integer> space)
		{
			sentence = sentence.replace("hk", "a");
			sentence = sentence.replace("jw", "e");
			sentence = sentence.replace("pf", "i");
			sentence = sentence.replace("dr", "o");
			sentence = sentence.replace("qx", "u");
			sentence = sentence.replace("ml", "s");
			sentence = sentence.replace("vb", "g");
			
			for(int i = 0; i < space.size(); i++)
				{
				sentence = sentence.substring(0, space.get(i)) + " " + sentence.substring(space.get(i));
				}
				
			System.out.println("your original sentence was: " + sentence);
			
		}
	
	}


