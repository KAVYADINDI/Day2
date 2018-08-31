package capgemini.Day2.java;

public class SimpleAndCompoundInterest {
	public static double[] interestCalculation (double principalAmount, double rateOfInterest, double time ){
		double si;
		double ci;
		    si=( principalAmount* time*rateOfInterest)/100;
		    ci=(double) principalAmount*(Math.pow(1+(rateOfInterest/100), time))- principalAmount;
		    double[] result=new double[2];
		    result[0]=si;
		    result[1]=ci;
		    System.out.println("Simple interest is: " + si);
		    System.out.println("Compound interest is: " + ci);
		return result;
	}

	
}
