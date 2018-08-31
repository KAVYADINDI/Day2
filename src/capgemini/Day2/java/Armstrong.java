package capgemini.Day2.java;
import java.lang.Math;
public class Armstrong {
 public static boolean checkArmstrongNumber(int number)
 {
	number=Math.abs(number);
	int temp=number,digit,sum=0;
	
	while(temp>0) {
		digit=temp%10;
		sum=sum+(digit*digit*digit);
		temp=temp/10;
	}
	System.out.println(number + ":" +sum);
	if(sum==number)
		{
		return true;
		}
	else return false;
	
 }
}
