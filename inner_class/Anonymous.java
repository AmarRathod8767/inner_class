package inner_class;


abstract class Anonymous {
	abstract void ab();
}
class Hi
{
 
	
	Anonymous obj=new Anonymous(){
		void ab()
		{
			System.out.println("Anonymous Class");
		}
	};
	//public static void main(String[]args)
	//{
	//	Anonymous obj=new Anonymous();
		
	
	
}
