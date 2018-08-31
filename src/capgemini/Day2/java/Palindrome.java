package capgemini.Day2.java;

public class Palindrome {
public static boolean checkIfPalindrome(int number) {
	int rem,reverse=0,temp;
	temp=number;
	if(number>=0)
	{
	while(temp>0)
	{
	rem=temp%10;
	reverse=10*reverse+rem;
	temp=temp/10;
	}
	if(reverse==number) {
		return true;
	}	
	}
	return false;
}
}
