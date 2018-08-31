package capgemini.Day2.java;

public class IncomeTax {
public static float calculateTaxAmount( float income)
{
	float taxAmount=0;
	if(income>0 && income<=1000000)
	{
	if(income>0 && income<=180000)
    {
   	 taxAmount=0;
    }
    else if(income>180000 && income<=300000)
    {
   	 taxAmount= income/10;
    }
    else if(income>300000 && income<=500000) 
    {
   	 taxAmount= income/5;
    }
    else if(income>500000 && income<=1000000)
    {
   	 taxAmount=(income*3)/10;
    }
	return taxAmount;
	}
 return  -1;
}
}
