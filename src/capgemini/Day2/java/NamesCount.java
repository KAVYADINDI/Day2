package capgemini.Day2.java;

public class NamesCount {
public static String countOfOccurances(String Name) {
	int count=0;
	String errormessage="Name not found";
	String[] users= {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dev","Kity","Meery","Smith","Johnson","Bill","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson"};
	for (int i=0;i<users.length;i++)
	{
	if (users[i].equals(Name)) 
		{
		count++;			
		}
   }
	if(count>0)
	{
		return("Found name: " + Name + " Occurence: "+ count);
	}
	return errormessage;
}
}
