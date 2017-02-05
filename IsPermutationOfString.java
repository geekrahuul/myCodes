package arraysAndString;
/*
 * check if the  string is permutation of other string
 * anagram
 */
public class IsPermutationOfString {
	
public static boolean isAnagram(String str1,String str2)
{
	
	if(str1.length()!=str2.length())
	{
		return false;
	}
	// depending upon the ASCII characters
	int [] letters = new int [128]; // Assuming
	char [] chars=new char[str1.length()];
	for(int i=0;i<str1.length();i++)
	{
		char value1=str1.charAt(i);
		int val1 = value1;
		letters[val1]++;
		//char_val[(str1.charAt(i))]
	}
	for(int i=0;i<str2.length();i++)
	{
		int val= str2.charAt(i);
		letters[val]--;
		if(letters[val]<0)
		{
			return false;
		}
	}
	return true;
}


static void printResult(String str1, String str2)
{
	boolean value =isAnagram(str1, str2);
	if(value)
	{
		System.out.println("\""+str1+"\" is permutation of "+"\""+str2+"\"");
	}
	else
	{
		System.out.println("\""+str1+"\" is not permutation of "+"\""+str2+"\"");
	}
}

	
	public static void main(String[] args) {
	String str1="rahul";
	String str2 ="ahurl";
		printResult(str1, str2);
	}
}
