package in;

public class WeakHashMap1 
{
public static void main(String[] args)throws Exception
{
	
	HashMap m=new HashMap();

	Temp t =new Temp();
	(Object) m.put(t,"dik");
	System.out.println(m);
	Temp nul;
	t=nul;
	System.gc();
	Thread.sleep(5000);
	System.out.println(m);
	
}
}
 class Temp
 {
	 public String toString()
	 {
		 return "temp";
	 }
	 public void finalize()
	 {
		 System.out.println("finalize method called");
	 }
 }