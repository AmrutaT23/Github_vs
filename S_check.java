//Write a java program to check whether a character is a vowel or consonant using switch ststement.
class S_check
{
	char letter='A';
	void check()
	{
		switch(letter)
		{
			case 'a': System.out.println("Vowel");
				  break;
			case 'e': System.out.println("Vowel");
				  break;
			case 'i': System.out.println("Vowel");
				  break;
			case 'o': System.out.println("Vowel");
				  break;
			case 'u': System.out.println("Vowel");
				  break;
			case 'A': System.out.println("Vowel");
				  break;
			case 'E': System.out.println("Vowel");
				  break;
			case 'I': System.out.println("Vowel");
				  break;
			case 'O': System.out.println("Vowel");
				  break;
			case 'U': System.out.println("Vowel");
				  break;
			default:  System.out.println("Consonant");
		}
	}
public static void main(String args[])
{
	S_check c =new S_check();
	c.check(); 	
}
}	
				
