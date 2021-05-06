import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapDemo 
{
	public static void main(String[]args)
	{
		HashMap m=new HashMap();
		m.put("diksha", 101);
		m.put("ravi", 102);
		m.put("dikshapatidar", 103);
		m.put("diksha", 106);
		m.put("null", null);
		//m.put("siksha", 104);
		m.put("rani", 105);
		System.out.println(m);
		Set s=m.keySet();
		System.out.println(s);
		Collection c=m.values();
		System.out.println(c);
		
		Set s1=m.entrySet();
		System.out.println(s1);
		
		Iterator itr= s1.iterator();
	while(itr.hasNext())
	{
		Map.Entry m1=(Map.Entry)itr.next();
		System.out.println(m1.getKey()+"..........."+m1.getValue()+"..........."+m1.getClass());
		if(m1.getKey().equals("diksha"))
		{
			m1.setValue("109");
		}
		
	}
		System.out.println(m);
		
		
	}

}
