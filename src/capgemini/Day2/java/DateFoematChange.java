package capgemini.Day2.java;

public class DateFoematChange {
public static String changeDateFormat( String date)
{
	int m;
	int d;
	String s="";
	String invalidInput="Invalid Input";
	String[] entries=date.split(",");
	 m=Integer.parseInt(entries[1]);
	 d=Integer.parseInt(entries[0]);
	 if(m>0 &&m<12)
	 {
		 if(d>0 && d<31 )
		 {
		switch(m)
		{

		case 1 : s="January"; break;
		case 2 : s="February"; break;
		case 3 : s="March"; break;
		case 4 : s="April"; break;
		case 5 : s="May"; break;
		case 6 : s="June"; break;
		case 7 : s="July"; break;
		case 8 : s="August"; break;
		case 9 : s="September"; break;
		case 10 : s="October"; break;
		case 11 : s="November"; break;
		case 12 : s="December"; break;
		default : System.out.println("Invalid Input");
		}
		entries[1]=s;
		System.out.println(entries[0]+"/"+s+"/"+entries[2]);
		return entries[0]+"/"+s+"/"+entries[2];
		 }
	 }
	return invalidInput;		
}
}


