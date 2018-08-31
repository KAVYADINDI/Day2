package capgemini.Day2.java;

public class BubbleSorting {
public static int[]  doBubbleSort (int list[])
{
	int i,j,n;
	n=list.length;
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(list[j]>list[j+1])
			{
				list[j]=list[j]+list[j+1];
				list[j+1]=list[j]-list[j+1];
				list[j]=list[j]-list[j+1];
			}
		}
	}
	return list;
}
}
