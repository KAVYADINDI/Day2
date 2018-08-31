package capgemini.Day2.java;

public class AbsoluteDistancedNumbers {
private int[] integerArray;
private int  absoluteDistance;


public AbsoluteDistancedNumbers ()
{

}
public int[] getIntegerArray() {
	return integerArray;
}


public void setIntegerArray(int[] integerArray) {
	this.integerArray = integerArray;
	//System.out.println("....");
}


public int getAbsoluteDistance() {
	return absoluteDistance;
}


public void setAbsoluteDistance(int absoluteDistance) {
	this.absoluteDistance = absoluteDistance;
}
 
public  int[] findNumberAtAbsoluteDistance()
{
	int temp=0;
	int index1=0;
	int index2=0;
	int[] indexes=new int[2];
	for(index1=0;index1<integerArray.length;index1++)
    {
		//System.out.println("...");
    	temp=integerArray[index1];
    	for(index2=index1+1;index2<integerArray.length;index2++)
		{
    	if(integerArray[index2]==temp)
    	{
    		if(Math.abs(index2-index1)<=absoluteDistance)
    		{
    			indexes[0]=index1+1;
    			indexes[1]=index2+1;
    			System.out.println(integerArray[index2]+ " at "+ (index1+1)+" , " +(index2+1));
    		}
    	}
    		
		}
}	
	
	
	return indexes;
}
}
