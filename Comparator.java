package in;

import java.util.Comparator;
import java.util.TreeSet;

public class Comprator  
{ public static void main(String[] args) {
	
	
	TreeSet t=new TreeSet(new MyComparator1());
			t.add(10);
			t.add(20);
			t.add(5);
			t.add(7);
			t.add(199);
			System.out.println(t);
			
}

}
 class MyComparator1 implements Comparator
 {
	 
	@Override
	public int compare(Object obj, Object obj2) {
		 Integer i1= (Integer)obj;
		 Integer i2= (Integer)obj2;
		return i2.compareTo(i1);
	}
 }