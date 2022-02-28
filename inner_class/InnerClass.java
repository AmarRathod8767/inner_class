package inner_class;

public class InnerClass {
	class A
	{
		void a()
		{
			System.out.println("Class A inner");
		}
		class C
		{
			void c()
			{
				System.out.println("Class C");
			}
		}
	}
	void demo()
	{
		System.out.println("Main class");
	}
	public static void main(String[]args)
	{
		InnerClass obj=new InnerClass();
		obj.demo();
		obj.new A().a();
		obj.new A().new C().c();
		
				
		
	}
	

}
