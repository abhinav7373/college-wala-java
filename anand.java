import java.util.Scanner;
public class anand {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		// int t=sc.nextInt();
		// for(int i=0;i<t;i++)
		// {
		    int n=sc.nextInt();
		    String s=sc.next();
		    String b = s.substring(0,n/2);
		    String c = s.substring((n/2),n);
		    if((c+b)==s)
		    System.out.println("YES");
		    else 
		    System.out.println("NO");
		    
		    
		    // }
	
}
}
