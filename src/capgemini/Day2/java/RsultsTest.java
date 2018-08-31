package capgemini.Day2.java;

public class RsultsTest {
public static int checkResults(int maths, int social, int science)
{
	int count =0;
	if(maths>=0 && social>=0 && science>=0)
    {
    if(maths>60) {
    count++;
    }
    if(science>60) { count++; }
    if(social>60) { count++; }
    switch(count)
    {
    case 0 : System.out.println("failed");break;
    case 1 : System.out.println("failed"); break;
    case 2 : System.out.println("promoted"); break;
    case 3 : System.out.println("passed promoted"); break;
    }	
    }
	return count;
}
}
