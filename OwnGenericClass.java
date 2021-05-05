package in;

public class OwnGenericClass <T>
{
T obj;
OwnGenericClass(T obj)
{
	this.obj=obj;
}
public void show()
{
	System.out.println(obj.getClass().getName());
}
public T getobj()
{
	return obj;
}

}
   class OwnGenericClass1
  {
	  public static void main(String[] args) 
	  {
		
		  OwnGenericClass<Double> s=new OwnGenericClass<Double>(10.5);
		  s.show();
		  System.out.println(s.getobj());
		  
	}
  }
 
	 
 