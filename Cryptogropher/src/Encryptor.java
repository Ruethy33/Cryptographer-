import java.util.Scanner;
import java.util.ArrayList;

public class Encryptor
	{
	static Scanner userInput = new Scanner(System.in);
	static String sentence;
	static ArrayList <Integer> space = new ArrayList <Integer>();
	
	public static void main()
		{
		printSentence();
		stripSpaces();
		encryptor();
		returnSentence();
		}
	
	public static void printSentence()
		{
		System.out.println("Please input a sentence.");
		sentence = userInput.nextLine();
		}
	
	public static ArrayList stripSpaces()
	{
	int place = 1;
	while(place!= 0)
		{
		space.add(sentence.indexOf (" ", place));
		place = sentence.indexOf(" ", place) + 1;
		}
	space.remove(space.size() - 1);
	sentence = sentence.replace(" ", "");	
	return space;

	}
	
	public static String encryptor()
		{	
		sentence = sentence.replace("a", "hk");
		sentence = sentence.replace("e", "jw");
		sentence = sentence.replace("i", "pf");
		sentence = sentence.replace("o", "dr");
		sentence = sentence.replace("u", "qx");
		sentence = sentence.replace("s", "ml");
		sentence = sentence.replace("g", "vb");
		return sentence;
		}
	
	public static void returnSentence()
		{
		System.out.println("your encoded sentence is: " + sentence);
		
		}
	}


