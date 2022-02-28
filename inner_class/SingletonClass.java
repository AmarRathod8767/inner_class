package inner_class;

public class SingletonClass {
	private static SingletonClass obj;
   static String s="";
	private SingletonClass()
	{
		
	}
	public static SingletonClass getInstance()
	{
		if(obj==null)
		{
			obj=new SingletonClass();
		
			s="object sucsefully created";
		}
		else 
		{
			s="Object Alredy created";
		}
		return obj;
	}
	public static void show()
	{
		System.out.println(s);
	}

}
