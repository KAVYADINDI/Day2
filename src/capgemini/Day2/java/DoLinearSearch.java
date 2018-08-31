package capgemini.Day2.java;

public class DoLinearSearch {
public static Boolean search(int numberToBeSearched) {
	int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	for(int i=0;i<=14;i++)
	{
		if(a[i]==numberToBeSearched)
		{
	   System.out.print(numberToBeSearched+" is in the array");
	  return true;
		}
	}
	return false;
}
}
