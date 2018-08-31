package capgemini.Day2.java;

public class MissingNumber {
public static int searchForMissingNumber( int array[], int arraysize ) {
	int sum=0;
	sum=(arraysize*(arraysize+1))/2;
	for(int i=0;i<arraysize;i++)
	{
		sum=sum-array[i];
	}
	return sum;
}
}
