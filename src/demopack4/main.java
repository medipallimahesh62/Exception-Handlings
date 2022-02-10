package demopack4;
import demopack3.P;
import demopack3.Q;
import demopack3.R;
public class main 
{
	public static void main(String [] args)
	{
		System.out.println(P.name);
		Q q=new Q();
		q.move();
		R.test();
		R r=new R();
		r.test2();
	}

}
