package arraysAndString;

/*
 * Implement an algorithm to determine if a string has all unique characters.
 *  using additional data structure like array
 *  
 *  if without use any additional array, compare each character with every character
 */


/*
 * considering string is ASCII string and 128  unique, extended ASCII is of 256 codes
 *
 */
public class IsUniqueChars {

	//method to check if string has all unique characters
	public static boolean isUnique(String str)
	{
		if(str.length()>128)
		{
			return false;
		}
		
		boolean [] char_set= new boolean [128];
		
		for(int i=0;i<str.length();i++)
		{
			int val = str.charAt(i);
			if(char_set[val])
			{
				return false;
			}
			else
			{
				char_set[val]=true;
			}
		}
		
		return true;
	}
	
	public static  void printResult(String str)
	{
	   boolean val=	isUnique(str);
	   if(val)
	   {
		   System.out.println(str+ " has unique characters");
	   }
	   else
	   {
		   System.out.println(str+" has not unique charcters");
	   }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rahuul";
		printResult(str);
		
	}

}
