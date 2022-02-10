package example1;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the string");
		String s=sc.next();
		System.out.println("enter another string");
		String t=sc.next();
	    int i,gcd=1,j;
	    String u="";
	    String x="";
	    int n1=s.length();
	    int n2=t.length();
		for(i=1; i <= n1 && i <= n2; ++i)
        {
              if(n1%i==0 && n2%i==0)
                gcd = i;
        }
        if(gcd==n2)
        {
            for(i=0;i<n1-2;i++)
            {
                for(j=i+1;j<n1-2;j++)
                {
                    if(s.charAt(i)==s.charAt(j) && s.charAt(i+1)==s.charAt(j+1) && s.charAt(i+2)==s.charAt(j+2))
                    {
                        //System.out.println(j);
                        u=s.substring(0,j);
                        break;
                    }
                }
                break;
            }
            
            //System.out.println(u);
            if(u.length()==t.length())
            {
                    if(u.equalsIgnoreCase(t))
                    System.out.println(u.length());
            }
            else if(u.length()<t.length())
            {
                n1=u.length();
                n2=t.length();
                for(i=1;i<= n1&&i<= n2; ++i)
                {
                        if(n1%i==0 && n2%i==0)
                        gcd = i;
                }
                if(gcd==n1)
                {
                    x=t.substring(0,n1);
                    if(u.equalsIgnoreCase(x))
                    System.out.println(u.length());
                }
            }
        }
        else
        {
            System.out.println("-1");
        }
	}
}