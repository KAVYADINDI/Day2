package capgemini.Day2.java;

public class StringReverse {
public static String reversing(String stringToBereversed)
{
	String[] s=stringToBereversed.split(" ");
	String reverse="";
	for(int i=0;i<s.length;i++)
	{
		for(int j=s[i].length()-1;j>=0;j--) 
		{
			reverse=reverse+s[i].charAt(j);
		}
		reverse=reverse + " ";
	}   
	System.out.print(reverse + " ");
	return reverse;
}
}
