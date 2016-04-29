import java.util.Scanner;

public class Cryptogropher
	{

		public static void main(String[] args)
			{
			Encryptor.main();
			Decryptor.decryptor(Encryptor.encryptor(), Encryptor.stripSpaces());
			}

	}
