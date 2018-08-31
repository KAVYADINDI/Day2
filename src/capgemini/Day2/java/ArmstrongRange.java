package capgemini.Day2.java;

public class ArmstrongRange {
public static int[] findAllArmstrongNumbers(int start, int end)
{
	int number,digit,j=0,sum;
	int allArmstrongNumbers[]= new int[4];
	for (int i =start; i <end; i++) {
		number=i;
		sum=0;
		while(number>0)
		{
			digit=number%10;
			sum=sum+(digit*digit*digit);
			number=number/10;
		}
		if(sum==i) {
			allArmstrongNumbers[j]=i;
			j++;
		}
	}
	return allArmstrongNumbers;
}
}
